
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3,10,16,9,14,7,1,8,4,2};
		
		/*HeapTools.heapSort(arr);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+"\t");//16	14	7	9	10	3	1	8	4	2
		*/
		
		MyHeap heap = new MyHeap(arr);
//		System.out.print(HeapTools.maximum(heap));//16
		
//		/*
//		int key = HeapTools.heapExtractMax(heap);
//		System.out.println(key);
//		for(int i = 0; i < heap.heap_size; i++)
//			System.out.print(heap.arr[i]+"\t");
//		//16
//		//14	10	7	9	2	3	1	8	4	
//		*/
		/*
		for(int i = 0; i < heap.heap_size; i++)
			System.out.print(heap.arr[i]+"\t");
		System.out.println();
		HeapTools.heapIncreaseKey(heap, 8, 15);
		for(int i = 0; i < heap.heap_size; i++)
			System.out.print(heap.arr[i]+"\t");
		//16	15	14	9	10	7	1	8	4	2	
		*/
		/*
		HeapTools.maxHeapInsert(heap, 11);
		for(int i = 0; i < heap.heap_size; i++)
			System.out.print(heap.arr[i]+"\t");
		}
//	    16	14	7	9	11	3	1	8	4	2	10
	
	
		*/
		
		

}
