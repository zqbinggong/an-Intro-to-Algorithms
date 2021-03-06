//对区间的模糊排序
/*
1. Find-Intersection(A,B,p,s,m,n):寻找并返回（A,B)中p到s段的公共子集(m,n)
2. Partition-Right(A,B,p,s,m):根据m，对（A,B）排序，返回排序后m的下一位置
3. Partition-Left(A,B,p,s,n):根据n，对（A,B）排序，返回排序后n的下一位置
4. Fuzzy-Sort(A,B,p,s)
*/
public class FuzzySort2 {
	public static void fuzzySort(int[] a, int[] b, int p, int s){
		if(p < s){
			int m = 0, n = 0;
			findIntersection(a,b,p,s,m,n);
			int r = partitionRight(a,b,m,p,s);
			int q = partitionLeft(a,b,n,p,s);
			fuzzySort(a,b,p,q-1);
			fuzzySort(a,b,r+1,s);
		}
	}

	private static int partitionRight(int[] a, int[] b, int m, int p, int s) {
		// TODO Auto-generated method stub
		int i = p-1;
		for(int j = p; j<=s-1;j++){
			if(a[j] <= m){
				i++;
				swap(a,i,j);
				swap(b,i,j);
			}
		}
//		swap(a,i+1,s);
//		swap(b,i+1,s);
		return i+1;
	}
	
	private static int partitionLeft(int[] a, int[] b, int n, int p, int r) {
		// TODO Auto-generated method stub
		int i = p-1;
		for(int j = p; j<=r-1;j++){
			if(b[j] <= n){
				i++;
				swap(a,i,j);
				swap(b,i,j);
			}
		}
//		swap(a,i+1,r);
//		swap(b,i+1,r);
		return i+1;
	}

	private static void findIntersection(int[] a, int[] b, int p, int s, int m,
			int n) {
		// TODO Auto-generated method stub
		int i = (int) Math.round(Math.random()*(s-p)+p);
		swap(a,i,s);
		swap(b,i,s);
		m = a[s];
		n = b[s];
		for(int j = p; j <= s-1; j++){
			if(a[j] <= n && b[j] >= m){
				if(a[j] > m)
					m = a[j];
//				else if(b[j] < n) {
//					n = b[j];
//				}
				if(b[j] < n) n = b[j];
			}
		}
		
		
	}
	
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
