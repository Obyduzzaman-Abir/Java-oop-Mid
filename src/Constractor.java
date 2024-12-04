public class Constractor {
    String name,gender;
    int phone;

    Constractor(String n ,String g,int p)
    {
        name=n;
        gender=g;
        phone=p;
    }

    void MyDisplay()
    {
        System.out.println("Name : "+ name);
        System.out.println("Gender : " + gender);
        System.out.println("phone : " + phone);
    }

}
