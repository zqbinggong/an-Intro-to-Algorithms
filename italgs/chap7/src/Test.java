
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{4,6,4,8,1,8,1,3,3,9,0,8};
//		QuickSort.quickSort(arr, 0, arr.length-1);
		//0	1	3	4	6	8	8	9
		
//		QuickSort.quickSortSame(arr, 0, arr.length-1);
//		QuickSort.tailRecursiveQuickSort(arr, 0, arr.length-1);
		/*
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+"\t");
		*/
//////////模糊排序部分
		int[] a = new int[]{3,14,55,23,36,68,42};
		int[] b = new int[]{9,29,73,48,68,105,59};
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+"\t");
		System.out.println();
		FuzzySort.fuzzySort(a, b, 0, a.length-1);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i]+"\t");
		
		

	}
	/*原版，错误
	3	14	55	23	36	68	42	
	9	29	73	48	68	105	59	
	3	42	55	14	23	36	68	
	9	59	73	29	48	68	105
	*/
	/*自我修改后，正确
	3	14	55	23	36	68	42	
	9	29	73	48	68	105	59	
	3	14	42	23	55	36	68	
	9	29	59	48	73	68	105	
	 */
}
