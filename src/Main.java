// Omega is best case
// Theta is average case
// omicron is worst case also called as Big O notations,
// Even though Big O is technically the worst case but in general use used for all complexities.


public class Main {

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
        printItems(10);
    }

}
