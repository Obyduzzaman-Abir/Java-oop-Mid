public class OverLoadingConsTest {
    public static void main(String[] args) {
        System.out.println("*********Default Constractor************");
        OverloadingConstractor OverloadingConstractor1=new OverloadingConstractor();
        System.out.println("*********perameter 2 value  Constractor************");
        OverloadingConstractor OverloadingConstractor2=new OverloadingConstractor("Abir","male");
        OverloadingConstractor2.disPlayInfo();
        System.out.println("**********All 3 Constractor*******");
        OverloadingConstractor OverloadingConstractor3=new OverloadingConstractor("Abir","Male",79388);
        OverloadingConstractor3.disPlayInfo();

    }
}
