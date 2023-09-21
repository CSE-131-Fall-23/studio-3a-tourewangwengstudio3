package studio3;

import java.util.Scanner;

public class Sieves {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the value of n");
		int n = in.nextInt();
		boolean [] prime= new boolean[n];
		for( int i= 1; i < prime.length; i++) {
			prime[i] = true;
											  
		for (int k= i*i; i < prime.length; k+=i) {
			prime[i]=false;
		}
		}
		
	}

}
