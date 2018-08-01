
public class LCS {
	public static void lcs(String x,String y,int m,int n){
		int l[][] = new int [m+1][n+1];
		char X[] = x.toCharArray();
		char Y[] = y.toCharArray();
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0||j==0){
					l[i][j] = 0;
				}
				else if(X[i-1]==Y[j-1]){
					l[i][j] = 1+l[i-1][j-1];
				}
				else{
					l[i][j] = max(l[i-1][j],l[i][j-1]);
				}
			}
		}
		int index = l[m][n];
		char subsequence[] = new char[index+1];
		int i=m,j=n;
		while(i>0&&j>0){
			if(X[i-1] == Y[j-1]){
				subsequence[index-1] = X[i-1];
				i--;
				j--;
				index--;
			}
			else if(l[i-1][j]>l[i][j-1]){
				i--;
			}
			else{
				j--;
			}
		}
		
		System.out.println(subsequence);
	}
     
	public static int max(int a,int b){
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
		String x = "AGGTAB";
        String y = "GXTXAYB";
        int m = x.length();
        int n = y.length();
        lcs(x,y,m,n);
	}

}
