//prog on else-if to check if a person is adult, teenager or child
public class else_fi_prog1 {
    public static void main(String[] args) {
        int age = 13;
        if(age>=18) {
            System.out.println("adult");
        }
        else if(age>=13 && age<18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("child");
        }
    }
}
