import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        String mess = scan.nextLine();
        String res = calc(mess);
        System.out.println("Output : \n" + res);
    }

    public static String calc(String input) {
        String[] numbers = input.split(" ");
        if (numbers.length == 3) {
            int res = 0;
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[2]);
            String naked = numbers[1];
            if (a > 0 && a < 11) {
                if (b > 0 && b < 11) {
                    if (naked.equals("+"))
                        res = a + b;
                    else if (naked.equals("-"))
                        res = a - b;
                    else if (naked.equals("*"))
                        res = a * b;
                    else if (naked.equals("/"))
                        res = a / b;
                }
            }
            return Integer.toString(res);
        } else {
            String res = "throws Exception";
            return res;
        }
    }
}
