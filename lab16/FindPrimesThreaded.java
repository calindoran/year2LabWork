/*
 * Author: Calin Doran
 * Date: 4/2018
 * Purpose: Threads Lab16
 */
package lab16;

public class FindPrimesThreaded {

	class FindPrimes extends Thread {
		

	}

	private static boolean isPrime(int x) {
		if (x == 1)
			return false;
		else {
			for (int i = 2; i <= x / 2; i++) {
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread();
		Thread thread2 = new Thread();

		thread1.start();
		thread2.start();

		int n = 500000;
		int count = 0;

		for (int i = 2; i < n; i++) {
			boolean res = isPrime(i);
			if (res == true)
				count++;
		}
		System.out.println("Prime number " + n + " found " + count);
	}
}
