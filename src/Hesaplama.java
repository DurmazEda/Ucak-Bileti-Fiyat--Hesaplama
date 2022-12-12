import java.sql.SQLOutput;
import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {
        double mesafe, indirim, yasindirim, gidisdonus, toplam , normal=0;
        int tip , yas;

        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı gririniz: ");
        yas = input.nextInt();

        System.out.println("Gitmek istediğiniz mesafeyi giriniz: ");
        mesafe = input.nextInt();

        System.out.println("Lütfen yolculuk tipinizi seçiniz : 1=> TekYön 2=> ÇiftYön");
        tip = input.nextInt();

        if((mesafe>0)&&(yas>0)&&(tip ==1)||(tip==2)){
            normal = mesafe * 0.10;
            if(yas<12){
                yasindirim = normal*0.50;
                indirim = normal-yasindirim;
                toplam = indirim;
                if(tip==2){
                    gidisdonus = indirim*0.20;
                    toplam = indirim-gidisdonus;
                }
                System.out.println("Bilet Tutarınız="+ toplam);
            }


        } else if (yas>=12 && yas<=24) {
            yasindirim = normal *  0.10;
            indirim = normal - yasindirim;
            toplam = indirim;
            if(tip==2){
                gidisdonus = indirim*0.20;
                toplam = indirim-gidisdonus;
            }
            System.out.println("Bilet Tutarınız: "+toplam);

        } else if (yas>65) {
            yasindirim = normal * 0.30;
            indirim = normal - yasindirim;
            toplam = yasindirim;
            if(tip==2){
                gidisdonus = indirim*0.20;
                toplam = indirim-gidisdonus;
            }
            System.out.println("Bilet Tutarınız: "+toplam);

        }
        else{
            System.out.println("HATALI GİRİŞ YAPTINIZ!!!");
        }


    }
}
