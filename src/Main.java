import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        float avarage=0;
        Scanner input = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz: ");
        Matematik = input.nextInt();
        if (Matematik >= 0 && Matematik <= 100) {
            avarage += Matematik;
        }
        System.out.print("fizik notunuzu giriniz: ");
        Fizik = input.nextInt();
        if (Fizik >= 0 && Fizik <= 100) {
            avarage += Fizik;
        }
        System.out.print("turkce notunuzu giriniz: ");
        Turkce = input.nextInt();
        if (Turkce >= 0 && Turkce <= 100) {
            avarage += Turkce;
        }
        System.out.print("kimya notunuzu giriniz: ");
        Kimya = input.nextInt();
        if (Kimya >= 0 && Kimya <= 100) {
            avarage += Kimya;
        }
        System.out.print("muzik notunuzu giriniz: ");
        Muzik = input.nextInt();
        if (Muzik >= 0 && Muzik <= 100) {
            avarage += Muzik;
        }
        avarage/=5;
        System.out.print("ortalamaniz: "+avarage);
        if(avarage<55){
            System.out.println("kaldiniz");
        }
        else
            System.out.println("gectiniz");

    }
}
