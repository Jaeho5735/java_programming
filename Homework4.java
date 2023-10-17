import java.util.Scanner;
class TestGcd {
    int gcd(int m, int n) {
        if (m == 0)
            return n;
        return gcd(n % m, m);
    }

    int gcd2(int a, int b) {
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        return b;
    }
}
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        TestGcd gcd = new TestGcd();
        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd.gcd(num1, num2));
    }
}
