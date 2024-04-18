package StringPract;

public class StringPract {
    public static void main(String[] args) {
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        String txt1 = "Please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);    // concat


    }
}
