public class OverloadingConstractor {
    String name,gender;
    int phone;
    OverloadingConstractor()
    {
        System.out.println("Not Info");
    }

    OverloadingConstractor(String n, String g)
    {
        name=n;
        gender=g;
    }

    OverloadingConstractor(String n, String g,int p)
    {
        name=n;
        gender=g;
        phone=p;
    }


    void disPlayInfo()

    {
        System.out.println("Name : " +name);
        System.out.println("Gender : " +gender);
        System.out.println("Phone : " + phone);
    }
}
