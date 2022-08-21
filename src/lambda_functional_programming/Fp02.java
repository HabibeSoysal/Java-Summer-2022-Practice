package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
    1-t->"Logic",(t,u)->"Logic"
    Bu yapıya   "Lambda Expression"
    2-Functional Programming kapsamında Lambda Expression kullanılabilir ama önerilmez.
    Lamda Expression yerine Method Reference tercih edilir
    3- Method Reference kullanımı Class name ::Method Name
    Aynı zamanda kendi class larıızı da kullanabilirsiniz
    Örneğin Animal class ınız var ve bu class eat() methoduna sahip==> "Animal::eat""
     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKupleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsızCiftElemanlarinKareToplam(liste);
        System.out.println();
        tekrarsızCiftElemanlarinKupunÇarpiminiYazdir(liste);
        System.out.println();
        getMaxEleman(liste);
        System.out.println();
        getMinEleman(liste);
        getYedidenBuyukCiftMin(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);

    }
//1) Ardışık list elementlerininin karelerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(utils::ayniSatirdaBosluklaYazdir);


    }

    //2) Ardışık cift list elementlerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {

        list.stream().filter(utils::ciftElemanlariSec).
                forEach(utils::ayniSatirdaBosluklaYazdir);

    }

    // 3) Ardışık tek list elementlerininin karelerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(utils::tekElemanlariSec).
                map(utils::karesiniAl).forEach(utils::ayniSatirdaBosluklaYazdir);
//elemanlarin degerleri degişecekse map metodunu kullanılır
    }
    //4-Ardışık tek list elementlerininin küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)

    public static void tekElemanlarinKupleriniYazdirFunctional(List<Integer> list) {
        list.stream().distinct().filter(utils::tekElemanlariSec).
                map(utils::küpleriniAl).forEach(utils::ayniSatirdaBosluklaYazdir);

    }

    //5-tekrarsız cift elementlerininin karelerinin toplamini hesaplayan bir method oluşturun.(functıonal)
    public static void tekrarsızCiftElemanlarinKareToplam(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(utils::ciftElemanlariSec).
                map(utils::karesiniAl).reduce(0, Math::addExact);//MAth class addExact toplama yapmak demek

        System.out.println(toplam);

        System.out.println("2.yol");
        Integer toplam2 = list.stream().distinct().filter(utils::ciftElemanlariSec).
                map(utils::karesiniAl).reduce(Math::addExact).get();//MAth class addExact toplama yapmak demek
        System.out.println(toplam2);

        System.out.println("3.yol");
        Integer toplam3 = list.stream().distinct().filter(utils::ciftElemanlariSec).
                map(utils::karesiniAl).reduce(0, Integer::sum);//Integer clasında da toplam var  toplama yapmak demek
        System.out.println(toplam2);
    }

    //6-tekrarsız cift elementlerininin kupunun çarpimini hesaplayan bir method oluşturun.(functıonal)
    public static void tekrarsızCiftElemanlarinKupunÇarpiminiYazdir(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(utils::ciftElemanlariSec).
                map(utils::küpleriniAl).reduce(1, Math::multiplyExact);//multıply carpım demek
        System.out.println(carpim);

    }  //7-list elemanlari arasınsan en büyük degeri bulan bir method oluşturun.(functıonal)

    //1.yol
    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Math::max).get();
        System.out.println(max);

    }
//8-list elemanlari arasınsan en kücük degeri bulan bir method oluşturun.(functıonal)

    public static void getMinEleman(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(Math::min).get();
        System.out.println("min = " + min);

    }  //9-list elemanlari arasınsan 7 den  büyük cift en küçük  degeri bulan bir method oluşturun.(functıonal)1.yol

    public static void getYedidenBuyukCiftMin(List<Integer> list) {
        Integer minIstenilen = list.stream().distinct().filter(utils::ciftElemanlariSec).
                filter(t -> t > 7).reduce(Math::min).get();
        System.out.println("minIstenilen = " + minIstenilen);

    }
//10-ters sıralama ile tekrarsız ve 5 ten büyük elemanların yarı   degerlerini(elemanı ikiye bölüp sonucunu)
// bulan bir method oluşturun.(functıonal)2.yol

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {
        List<Double> sonuc = list.stream().//GErekli methodları kullanmayı saglar
                             distinct().//tekrarlı olanları almaz
                             filter(t -> t > 5).//kosula göre filtrleme yapar
                             map(utils::yarisiniAl).//her bir elemanın degerini degistirmeye yarar
                             sorted(Comparator.reverseOrder()).//sıralama yapar
                             collect(Collectors.toList());//elemanları collectiona cevirir

        System.out.println("sonuc = " + sonuc);
    }


    }




