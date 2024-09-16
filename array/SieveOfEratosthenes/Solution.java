import java.util.Arrays;

public class Solution {
    public static void sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                System.out.print(p + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("Prime numbers up to " + n + ":");
        sieve(n);
    }
}
