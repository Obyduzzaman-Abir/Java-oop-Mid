public class Teacher {
    String name,gender;
    int phone;

    void setInfo(String na,String gend,int ph){

        name=na;
        gender=gend;
        phone=ph;

    }
    void displayResult()
    {
        System.out.println("Name : "+name+"gender : " +gender +"  Phone : "+phone);

    }
}
