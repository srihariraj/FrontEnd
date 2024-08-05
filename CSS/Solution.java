public class Solution{
	public static int MinMoves(int N){
		int count =0;
		if(N==1){
			return 1;
		}
		else{
			for(int i =N;i>0;i++){
				if(i==N){
					N--;count++;
				}
				else{
					N/=2;count++;
				}
			}
		}
		return count;
	}
}