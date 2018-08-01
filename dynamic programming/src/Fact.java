import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
			int n = s.nextInt();
			int a[] = new int [n+1];
			a[0]=1;
			
			for(int i=1;i<=n;i++){
				a[i] = i*a[i-1];
			}
			System.out.println(a[n]);
			t--;
		}
		s.close();
	}

}
