//prog to check if the number is odd or even with the help of ternary operator
public class ternary_operator {
    public static void main(String[] args) {
        int number = 6;
        String type = ((number %2)==0)?"even":"odd";
        System.out.println("The number is: "+type);   
    }
}
