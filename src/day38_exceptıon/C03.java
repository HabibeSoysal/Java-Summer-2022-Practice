package day38_exceptıon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
         /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim
         */

        String[] urunler = {"nutella", "cokokrem", "sut", "cay", "findik"};
        Scanner scan;

        int istenenSıra = 0;
        boolean kontrol = true;
        while (kontrol) {
            try {
                scan = new Scanner(System.in);
                System.out.println("istenen ürünün indeksini giriniz");
                istenenSıra = scan.nextInt();
                kontrol=false;
            } catch (InputMismatchException e) {
                System.out.println("ürün indexi için bir tamsayı girmeniz gerekli");
            }
        }

        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSıra - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + urunler.length + " olabilir");
        }

         /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         e.printStackTrace();//Hatayı biz yazdırıyoruz yazdırabiliriz */


    }
}
