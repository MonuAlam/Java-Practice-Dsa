package pattern;

public class GFG7 {
//                  *
//                 ***
//                *****
//               *******
//              *********
//             ***********

    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= n - i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j =0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {

//        pattern(6);
//        pattern(3);
        pattern(5);

    }
}



