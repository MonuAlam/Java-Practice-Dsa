package pattern;

public class GFG6 {

//            1 2 3 4 5 6
//            1 2 3 4 5
//            1 2 3 4
//            1 2 3
//            1 2
//            1


    static void pattern(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n) {
       for(int i=0;i<n;i++){
           for(int j=n;j>i;j--){
               System.out.print(n-j+1);
           }
           System.out.println();
       }
    }

    static void main(String[] args) {

        pattern(5);
        pattern1(5);

    }
}



