public class SumofDigits{
	public static int sumofdigitsrecursive (int n){
		if(n==0)  return 0;
		return( n%10 + sumofdigitsrecursive(n / 10));
	}

	public static int sumofdigitsiterative(int n){
		int sum = 0;
		while(n>0){
			sum += n%10;
			n/=10;
		}
		return sum;
	}

	public static  void main(String[] args){
		int n = 245;
		System.out.println("la somme des digits de 245 est: "+sumofdigitsrecursive(n));
		System.out.println("la somme des digits de 245 est: "+sumofdigitsiterative(n));


	}
}
