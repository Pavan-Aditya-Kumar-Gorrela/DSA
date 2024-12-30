import java.util.Arrays;
public class SortedMAt{
	public static void main(String[] args){
	int[][] nums= {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
	
	int target = 3;
	System.out.println(Arrays.toString(search(nums , target)));
	}



	static int[] BS(int[][] matx , int row , int cStart , int cEnd , int target){
	
		
		while(cStart <= cEnd){
			int mid  = cStart + (cEnd-cStart)/2;
			if(matx[row][mid] == target) {
				return new int[]{row, mid};		
			}else if(matx[row][mid] < target){
				cStart = mid + 1;
			}else{
				cEnd = mid-1;
			}
		}
		return new int[]{-1,-1}; 
	}
	static int[] search(int[][] mat , int target){
		int r = mat.length;
		int c = mat[0].length;
		//perform individual BS on rows
		if(r==1){
			return BS(mat , 0 , 0 , c-1 , target);	
		}

		//reduce rows to length 2
		int rStart = 0;
		int rEnd = r-1;
		int cMid = c/2;

		while(rStart < (rEnd -1)){
			if(mat[rStart][cMid] == target){
				return new int[]{rStart , cMid};
			}else if(mat[rStart][cMid] < target){
				rStart = cMid;
			}else{
				rEnd = cMid;
			}	
		}
		//rows reduced to length two
		if(mat[rStart][cMid] == target){
			return new int[]{rStart , cMid};
		}  
		if(mat[rStart+1][cMid] == target){
			return new int[]{rStart+1 , cMid};
		}
		 
		//search in all 4 halfs
		if(target <= mat[rStart][cMid-1]){
			return BS(mat , rStart ,0, cMid-1 , target);
		}
		if(target >= mat[rStart][cMid+1] && target <= mat[rStart][c-1]){
			return BS(mat , rStart, cMid+1 , c-1 , target);
		}
		if(target <= mat[rStart+1][cMid-1]){
			return BS(mat , rStart+1 ,0, cMid-1 , target);
		}
		else{
			return BS(mat ,rStart+1 ,cMid+1 , c-1 , target);
		}
	}
}