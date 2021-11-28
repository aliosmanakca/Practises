package Practices.Soru33_Enum;

public class Ex02Main {

    public static void main(String[] args) {
        User kullanici=new User();
        kullanici.name="said";
        // kullanici.role=1;//customer
        //kullanici.status=2;//inactive
        kullanici.yetkisi=Role.ADMIN;
        kullanici.durum=Status.LOGIN;

        User kullanici1=new User();
        kullanici1.name="oner";
        // kullanici.role=1;//customer
        //kullanici.status=2;//inactive
        kullanici1.yetkisi=Role.CUSTOMER;
        kullanici1.durum=Status.ACTIVE;

        if (kullanici.yetkisi==Role.CUSTOMER){
            System.out.println("silme yetkisi yok");
        }
    }
}