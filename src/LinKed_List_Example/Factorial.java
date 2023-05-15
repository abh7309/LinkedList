package LinKed_List_Example;

public class Factorial {

        public static int factorial(int n) {
            if (n == 0) { // base case
                return 1;
            } else { // recursive case
          System.out.println("The numbers are "  + n);
                return factorial(n - 1);
            }
        }
    public static int rev_factorial(int n) {
        if (n == 0) { // base case
            return 1;
        } else { // recursive case
            System.out.println("The numbers are "  + n);
            return factorial(n - 1);

        }
    }

        public static void main(String[] args) {
            int num = 5;

            factorial(num);
        }
    }


