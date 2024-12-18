public class InheritenceMain {
    public static void main(String[] args) {
        Inherite2 Teacher1=new Inherite2();
        Teacher1.name="Abir";
        Teacher1.age=30;
        Teacher1.qualification="Diploma Eng";
        Teacher1.displayInfo1();
        System.out.println("--------------------------------------------1st Object-------------------------------------------------------");
        Teacher1.displayInfo2();
        System.out.println("--------------------------------------------2nd Object-------------------------------------------------------");
        Inherite2 Teacher2=new Inherite2();
        Teacher2.name="Siam";
        Teacher2.age=25;
        Teacher2.qualification="HSC";
        Teacher2.displayInfo3();
    }
}
