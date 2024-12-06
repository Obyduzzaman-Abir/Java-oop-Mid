public class StaticStudent1 {
     String name;
     int id;
     static   String universityName="UIU";

    StaticStudent1( String name, int id )
    {
        this.name=name;
        this.id=id;
    }

    void displayInfo()
    {
        System.out.println("Name : "+name) ;
        System.out.println("id : "+id) ;
        System.out.println("University Name : "+universityName) ;
    }
}
