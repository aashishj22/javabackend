import Encapsulation.Student;
import interfacePract.*;
import Abstraction.*;
import Inheritance.*;

public class Main {
    public static void main(String[] args) {
//        Another another = new Another();      coming from the abstraction
//        another.run();                          coming from the abstraction
//        another.breaki();                          coming from the abstraction
//        InterClas inter = new InterClas();         coming from the Interface
//        inter.printAashish();                        coming from the Interface

//        coming from Inheritance
//        Features features = new Features();
//        features.Cat();
//        features.barking();


//        coming from encapsulation
        Student student = new Student();
        student.setAcc_no(789955);
        student.setEmail("ashish@gmail.com");
        student.setName("Aashish");
        student.setAmount(520222);

        System.out.println(student.getAcc_no() +" " +student.getName()+" " +student.getEmail()+" " +student.getAmount());
    }
}
