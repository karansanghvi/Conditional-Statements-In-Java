//prog to check the largest of 3 numbers
public class largest_of_3_numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if((a>=b) && (a>=c)) {
            System.out.println("a is the largest number");
        }
        else if(b>=c) {
            System.out.println("b is the largest number");
        }
        else {
            System.out.println("c is the largest number");
        }
    }
}
