public class SuperClassb extends SuperClass {
    int x=5;
   /* void display()
    {
        System.out.println(super.x);
    }*/
    @Override
   void display1()
   {
        super.display1();
       System.out.println("Inside B");
   }
}
