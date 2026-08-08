import java.util.*;
public class lec4{
    public static Scanner scn = new Scanner(System.in);

    public static int decimalToBinary(int n) {
        int ans = 0;
        int pow = 1;
        while (n != 0) {
            int rem = n % 2;
            n /= 2;
            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int binaryToDecimal(int n) {
        int pwr = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += rem * pwr;
            pwr *= 2;
            n /= 10;
        }
        return ans;

    }

    public static void addTwoArrays(int[] arr, int[] brr) {
        int n = arr.length, m = brr.length;
        int ansArrlen = Math.max(n, m) + 1;
        int[] ans = new int[ansArrlen];

        int i = n-1, j = m-1, k = ansArrlen-1, carry = 0;

        while (k >= 0) {
            int sum = carry + ((i >= 0) ? arr[i] : 0) + ((j >= 0) ? brr[j] : 0);
            carry = sum / 10;
            ans[k] = sum % 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < ansArrlen; idx++) {
            if (idx == 0 && ans[idx] == 0) {
                continue;
            }
            System.out.print(ans[idx] + "\t");
        }
    }

    public static void main(String[] ARGS) {
        decimalToBinary(scn.nextInt());
    }
}
