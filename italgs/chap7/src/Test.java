
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{4,6,4,8,1,8,1,3,3,9,0,8};
//		QuickSort.quickSort(arr, 0, arr.length-1);
		//0	1	3	4	6	8	8	9
		
		QuickSort.quickSortSame(arr, 0, arr.length-1);
//		QuickSort.tailRecursiveQuickSort(arr, 0, arr.length-1);
		
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+"\t");
	
////////////模糊排序部分
//		int[] a = new int[]{3,14,55,23,36,68,42};
//		int[] b = new int[]{9,29,73,24,68,105,59};
//		int m = 0;
//		int n = 0;
//		findIntersection(a, b, 0, a.length-1, m, n);
//		
		
//		
//		for(int i = 0; i < a.length; i++)
//			System.out.print(a[i]+"\t");
//		System.out.println();
//		for(int i = 0; i < b.length; i++)
//			System.out.print(b[i]+"\t");
//		System.out.println();
//		FuzzySort.fuzzySort(a, b, 0, a.length-1);
////		FuzzySort2.fuzzySort(a, b, 0, a.length-1);
//		for(int i = 0; i < a.length; i++)
//			System.out.print(a[i]+"\t");
//		System.out.println();
//		for(int i = 0; i < b.length; i++)
//			System.out.print(b[i]+"\t");
//		
//		

	}
	public static void findIntersection(int[] a, int[] b, int p, int s, int m,
			int n) {
		// TODO Auto-generated method stub
		int i = (int) Math.round(Math.random()*(s-p)+p);
		System.out.println(i);
		swap(a,i,s);
		swap(b,i,s);
		m = a[s];
		n = b[s];
		for(int j = p; j <= s-1; j++){
			if(a[j] <= n && b[j] >= m){
				if(a[j] > m)
					m = a[j];
				else if(b[j] < n) {
					n = b[j];
				}
//				if(b[j] < n) n = b[j];

			}
		}
		System.out.print(m+" "+n);
	}
		private static void swap(int[] arr, int i, int j) {
			// TODO Auto-generated method stub
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

	/*FuzzySort
	3	14	55	23	36	68	42	
	9	29	73	48	68	105	59	
	3	14	42	23	55	36	68	
	9	29	59	48	73	68	105	
	 */
	/*FuzzySort2有错误
	3	14	55	23	36	68	42	
	9	29	73	48	68	105	59	
	68	23	55	42	36	14	3	
	105	48	73	59	68	29	9
	*/
}
