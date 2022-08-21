package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(getyedidenYuzeToplam());
        System.out.println(getyedidenYuzeToplam1());
        System.out.println(getikiden11eCarpim());
        System.out.println(faktöriyelHEsapla(5));
        System.out.println(ikiSayiArasindakiCiftSayilariTopla(2, 5));
        System.out.println(ikiSayiArasindakiTümSayilarinToplami(23,32));


    }

    //1- 7 den 100 e kadar ınteger degerelerinin toplamını bulan bir emthod olusturun
    public static int getyedidenYuzeToplam() {
        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }//2.yol

    public static int getyedidenYuzeToplam1() {
        return IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();
    }

    //2- 2 den 11 e kadar ınteger degerelerinin carpımını bulan bir emthod olusturun
    public static int getikiden11eCarpim() {
        return IntStream.range(2, 12).reduce(Math::multiplyExact).getAsInt();


    } //3- Verilen bir sayinin faktörelerini hesaplayan bir method olusturun

    public static int faktöriyelHEsapla(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("O dan buyuk deger giriniz");
        return 0;
    }

    //4- Verilen iki sayi arasındaki cift sayıların toplamını bulan bir method olusturun

    public static int ikiSayiArasindakiCiftSayilariTopla(int x, int y) {
        int z = 0;
        if (x > y) {
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x, y).filter(utils::ciftElemanlariSec).sum();
    }

    //4- Verilen iki sayi arasındaki tüm sayıların rakamlarinin toplamını hesaplayan bir method olusturun
    //23 and 32==>2+3 + 2+4 + 2+5 + 2+6 + 2+7 + 2+8 + 2+9 + 3+0 + 3+1 + 3+2==>68

    public static int ikiSayiArasindakiTümSayilarinToplami(int x, int y) {

return IntStream.rangeClosed(x,y).map(utils::rakamlarToplaminiAl).sum();


    }
}
