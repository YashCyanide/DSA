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
    }

    public static void main(String[] args) {
//        System.out.println("Hello World");
        printItems(10);
    }

}
