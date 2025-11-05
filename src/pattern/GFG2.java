package pattern;

public class GFG2 {


//            *
//            * *
//            * * *
//            * * * *
//            * * * * *

    static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {

        pattern(5);

    }
}
