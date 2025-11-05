package pattern;

public class GFG5 {
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {

        pattern(5);

    }
}


