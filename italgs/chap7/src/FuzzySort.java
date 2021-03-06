public class FuzzySort {
	
	public static void main(String[] args){
		int[] a = new int[]{3,14,55,23,42,88,36,68,85,0};
		int[] b = new int[]{9,29,73,24,55,99,68,105,94,2};
		fuzzySort(a,b,0,a.length-1);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+"\t");
		System.out.println();
	}
	
	public static void fuzzySort(int[] a, int[] b, int p, int s){
		if(p < s){
			int[] index = new int[2];
			index = partitionSame(a,b,p,s);
			fuzzySort(a,b,p,index[0]-1);
			fuzzySort(a,b,index[1]+1,s);
		}
	}
	//partition过程利用了7-2中的针对相同元素的快速排序算法，只不过这里是对区间而言的，大小的判断有所不同
	private static int[] partitionSame(int[] a, int[] b, int p, int r) {
		// TODO Auto-generated method stub
		int[] index = new int[2];
		
		int xa = a[p];
		int xb = b[p];
		int i = p;
		int h = p;
		for(int j = p+1; j <= r; j++){
			if(b[j] < xa){
				int ya = a[j];
				int yb = b[j];
				a[j] = a[h+1];
				b[j] = b[h+1];
				a[h+1] = a[i];
	            b[h+1] = b[i];
				a[i] = ya;
				b[i++] = yb;
				h++;
			}else if(a[j] <= xb && b[j] >= xa){
				swap(a,h+1,j);
				swap(b,h+1,j);
				h++;
			}
		}
		index[0] = i;
		index[1] = h;
		return index;
	}
	
	
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

