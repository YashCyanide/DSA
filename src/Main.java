// Omega is best case
// Theta is average case
// omicron is worst case also called as Big O notations,
// Even though Big O is technically the worst case but in general use used for all complexities.


public class Main {

    public static void osquare(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        // this is an illustration of O(n^2)
        // as loop runs for n*n time i.e n^2
        // this is very less efficient as value of n increase computations increases to n^2
    }
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        // This is a O(n) as this code runs for n times
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
        // you might think adding new for loop having n iterations will make the complexity as O(2n)
        // but it is not because it is still O(n) as the complexity is directly proportional to the input size.
        // hence rules of thumb for simplifying is to drop constants , it doesn't matter even if constant is in thousands
    }

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        printItems(10);
        osquare(10);
    }

}
