package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

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
                map( utils::karesiniAl).forEach(utils::ayniSatirdaBosluklaYazdir);
//elemanlarin degerleri degişecekse map metodunu kullanılır
    }
    //4-Ardışık tek list elementlerininin küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)

    public static void tekElemanlarinKupleriniYazdirFunctional(List<Integer> list) {
        list.stream().distinct().filter(utils::tekElemanlariSec).
                map(utils::küpleriniAl).forEach(utils::ayniSatirdaBosluklaYazdir);

    }
    public static void tekrarsızCiftElemanlarinKareToplam(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(utils::ciftElemanlariSec).
               // map(utils::karesiniAl).reduce();
       // System.out.println(toplam);


    }
}