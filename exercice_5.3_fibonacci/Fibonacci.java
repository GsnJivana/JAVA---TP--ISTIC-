public class Fibonacci{
	public static int fiboRecursive(int n){
		if(n==0 || n==1) return 1;
		return fiboRecursive(n-1) + fiboRecursive(n-2);
	}

	public static int fiboIterative(int n){
		int[] fiboTab = new int[n+1];
        fiboTab[0] = 1;
		fiboTab[1] = 1;
        for(int i = 2; i <= n; i++){
			fiboTab[i] = fiboTab[i - 1] + fiboTab[i - 2];
        }
		return fiboTab[n];
	}

	public static void main(String[] args){
		int n=40;
		System.out.println("fibonacci de "+n+" vaut " +fiboRecursive(n));
		System.out.println("fibonacci de "+n+" vaut " +fiboIterative(n));
	}
}
