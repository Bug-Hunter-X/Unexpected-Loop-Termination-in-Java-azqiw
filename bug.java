public class MyClass {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
            if (i == 5) {
                break; // Exiting the loop prematurely 
            }
        }
    }
}