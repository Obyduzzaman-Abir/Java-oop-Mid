public class Inherite2 extends InheritanceTest {
    //name
    //age
    //displayinfo1
    String qualification;
    void displayInfo2() {
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
        System.out.println("Qualification :" + qualification);


    }
    void displayInfo3() {
        displayInfo1();
        System.out.println("Qualification :" + qualification);


    }
}
