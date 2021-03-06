
public class ArraySorts {
	
	
	//插入排序
	public static void insertSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int j = i - 1;
			while(j>=0 && arr[j] > key)
				arr[j+1] = arr[j--];
			arr[j+1] = key;
		}
	}
	
	//归并排序
	public static void mergeSort(int[] arr, int p, int r){
		if(p<r){
			int q = (r+p)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
//			merge(arr,p,q,r);	
			merge2(arr,p,q,r);
		}
	
		
	}
	private static void merge2(int[] arr, int p, int q, int r) {
		// 使用一个数组来储存两个子数组
		int n1 = q-p+1;
		int n2 = r-q;
		int[] temp = new int[n1+n2];
		int i = 0,j = 0, k = 0;
		//将子数组中数按从小到大的顺序加入temp中,直到一个子数组被取完
		while(i < n1 && j < n2){
			if(arr[p+i] <= arr[q+1+j]){
				temp[k++] = arr[p+i];
				i++;
			}else{
				temp[k++] = arr[q+1+j];
				j++;
			}
		}
		//找到未被取完的子数组，将剩下的数直接按顺序加入temp中
		while(i < n1){
			temp[k++] = arr[p+i];
			i++;
		}
		while(j < n2){
			temp[k++] = arr[q+j+1];
			j++;
		}
		//将temp复制到arr中
		for(int x = 0; x < n1+n2; x++)
			arr[p+x] = temp[x];
		
		
	}

	//归并排序中的合并操作
	private static void merge(int[] arr, int p, int q, int r) {
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
	
	//选择排序
	public static void selectionSort(int[] arr){
		int smallest;
		for(int i = 0; i < arr.length - 1; i++){
			smallest = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[smallest])
					smallest = j;
			}
			swap(arr,i,smallest);
			}
		}

	private static void swap(int[] arr, int i, int smallest) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[smallest];
		arr[smallest] = temp;
	}
		
	//冒泡排序
	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			for(int j=arr.length-1; j >= i+1; j--){
				if(arr[j] < arr[j-1])
					swap(arr,j,j-1);
			}
		}
	}
	
	//计算逆序对
	public static int inversionCount(int[] arr, int p, int r){
		int count = 0;
		if(p < r){
			int q = (r+p)/2;
			count += inversionCount(arr,p,q);
			count += inversionCount(arr,q+1,r);
			count += mergeCount(arr,p,q,r);
		}
		return count;
	}

	private static int mergeCount(int[] arr, int p, int q, int r) {
		// TODO Auto-generated method stub
		int n1 = q-p+1;
		int n2 = r-q;
		int[] arr1 = new int[n1+1];
		int[] arr2 = new int[n2+1];
		for(int i = 0;i < n1;i++)
			arr1[i] = arr[p+i];
		arr1[n1] = Integer.MAX_VALUE;
		for(int i=0;i < n2;i++)
			arr2[i] = arr[q+i+1];
		arr2[n2] = Integer.MAX_VALUE;
		int count = 0;
		for(int k = p,i=0,j=0; k <= r; k++){
			if(arr1[i] > arr2[j]){
				count += n1-i;
				arr[k] = arr2[j++];
			}
			else
				arr[k] = arr1[i++];
		}
		return count;
	}
	
	
	
	
	
	
	
	
	
	
}

