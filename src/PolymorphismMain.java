public class PolymorphismMain {
    public static void main(String[] args) {

      /*  Polymorphism1 p=new Polymorphism1();
        Polymorphism2 t=new Polymorphism2();
        Polymorphism3 s=new Polymorphism3();
            p.display();
            t.display();
            s.display();
       */
        Polymorphism1 p=new Polymorphism1();
        p.display();
        p =new Polymorphism2();
        p.display();
        p=new Polymorphism3();
        p.display();
    }

}
