
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{5,2,4,7,3,1,6,8};
		mergeSort(arr,0,arr.length-1);
		System.out.println(count);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+"\t");
		}
		

	}
	
	static int count = 0;
	
	public static void mergeSort(int[] arr, int p, int r){
		if(p<r){
			int q = (r+p)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			merge(arr,p,q,r);	
		}
	
		
	}
	//归并排序中的合并操作
	private static void merge(int[] arr, int p, int q, int r) {
		count++;
		// TODO Auto-generated method stub
		int n1 = q-p+1;
		int n2 = r-q;
		int[] arr1 = new int[n1+1];
		int[] arr2 = new int[n2+1];
		for(int i = 0;i < n1;i++)
			arr1[i] = arr[p+i];
		arr1[n1] = Integer.MAX_VALUE;
		for(int j=0;j < n2;j++)
			arr2[j] = arr[q+j+1];
		arr2[n2] = Integer.MAX_VALUE;
	

		for(int k = p,i = 0,j = 0; k <= r; k++){
			if(arr1[i] <= arr2[j])
				arr[k] = arr1[i++];
			else
				arr[k] = arr2[j++];
		}
	}
}
