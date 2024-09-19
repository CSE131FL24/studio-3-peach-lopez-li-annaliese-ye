package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the value n: ");
		int n = in.nextInt();
		
		while (n<2)
		{
			System.out.println("Please enter a value greater than 2: ");
		}
		boolean[] isPrime = new boolean[n+1];
		for (int i = 2; i<=n; i++)
		{
			isPrime[i] = true;
		}
		for (int j = 2; j*j <=n; j++)
		{
			if (isPrime[j] == true)
			{
				for (int i = j*j; i <= n ; i+= j)
					isPrime [i] = false;
			}
		}
		for (int j = 2; j <= n; j++)
		{
			if (isPrime[j])
			{
				System.out.println(j+" ");
			}
		}
		
	}

}
