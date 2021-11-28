package Practices.Soru34_Enum;

public class Ex04Main {
    public static void main(String[] args) {

        Aylar ay = Aylar.SUBAT;
        ay.getGunMiktari();
        System.out.println("secilen ay gun sayisi :" + ay.days);
        System.out.println("ay :" + ay);
    }
}