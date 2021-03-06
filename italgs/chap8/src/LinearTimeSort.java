
public class LinearTimeSort {
	
	//计数排序,版本1,稳定但不是原址排序
	public static void countSort(int[] a, int b[], int k){
		int[] c = new int[k+1];
		for(int i = 0; i < a.length; i++)
			c[a[i]] += 1;
		for(int i = 1; i < k+1; i++)
			c[i] += c[i-1];
		for(int i = a.length-1; i >= 0; i--){
			b[c[a[i]]-1] = a[i];//注意这里有个减1的操作
			c[a[i]] -= 1;
		}
		
	}
	
	//计数排序,版本2,原址但不稳定
	public static void countSort2(int[] a, int k){
		int[] c = new int[k+1];
		for(int i = 0; i < a.length; i++)
			c[a[i]] += 1;
		int p = 0;
		for(int i = 0; i <= k; i++)
			for(int j = 0; j < c[i]; j++)
				a[p++] = i;
	}
	
	//水壶问题
	//此处使用的是利用快速排序思想的算法，其时间复杂度为nlgn
	public static void matchJugs(int[] r, int[] b, int p, int s){
		if(p < s){
			
			int k = (int) Math.round(Math.random()*(s-p)+p);
			int q = partitionRed(r,p,s,b[k]);
			partitionBlue(b,p,s,b[k]);
			matchJugs(r, b, p, q-1);
			matchJugs(r, b, q+1, s);
		}
	}

	private static void partitionBlue(int[] b, int p, int s, int x) {
		// TODO Auto-generated method stub
		int index = 0;
		for(int i = p; i <=s; i++){
			if(b[i] == x)
				index = i;
		}
		swap(b,index,s);
		int j = p - 1;
		for(int i = p; i <= s; i++){
			if(b[i] <= x){
				swap(b,i,++j);
			}
		}
	}

	private static int partitionRed(int[] r, int p, int s, int x) {
		// TODO Auto-generated method stub
		int index = 0;
		for(int i = p; i <=s; i++){
			if(r[i] == x)
				index = i;
		}
		swap(r,index,s);
		int j = p - 1;
		for(int i = p; i <= s; i++){
			if(r[i] <= x){
				swap(r,i,++j);
			}
		}
		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	

}
