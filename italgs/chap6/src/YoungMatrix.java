//习题6-3,关于Young矩阵的代码实现
public class YoungMatrix {
	public int m, n;
	public int[][] young;
	//接受一个二位数组，将其转化成Young矩阵
	//这里为了简便，假设该数组中每行的元素都是相同的，否则可以通过找到最长的行，来确定矩阵的列数
	public YoungMatrix(int[][] arr){
		m = arr.length;
		n = arr[0].length;
		young = arr;//最好是把arr的值赋给young，这里为了简便，直接将young指向arr
		buildYoung(young);
	}
	private void buildYoung(int[][] young) {
		// TODO Auto-generated method stub
		//先将最后一行排序
		ArraySorts.insertSort(young[m-1]);
		//然后从倒数第二行最后一个元素开始逐行维护最小堆性质
		for(int i = m-2; i >= 0; i--){
			for(int j = n-1; j >= 0; j--){
				minHeapify(young,i,j);
			}
		
		
		}
	}
	private void minHeapify(int[][] young, int i, int j) {
		// TODO Auto-generated method stub
		
		int si=0,sj=0;
		if(i < m-1 && young[i][j] > young[i+1][j]){
			si = i+1;
			sj = j;
		}
		else{
			si = i;
			sj = j;
		}
		if(j < n-1 && young[si][sj] > young[i][j+1]){
			si = i;
			sj = j+1;
		}
		if(si != i | sj !=j){
			swap(young,i,j,si,sj);
			minHeapify(young,si,sj);
		}
	}
	private void swap(int[][] young, int i, int j, int si, int sj) {
		// TODO Auto-generated method stub
		int temp = young[i][j];
		young[i][j] = young[si][sj];
		young[si][sj] = temp;
	}

}
