package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        büyükHarfYazdir(liste);
        System.out.println();
        uzunlugaGöreYazdir(liste);
        System.out.println();
        tersSiralaYazdir(liste);
        System.out.println();
        sonKaraktereGöreTekrarsızSiralaYazdir(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreSiralaYazdir(liste);
        //  baslangıcıaIleNIleBİtenSil(liste);
        // uzunlugu8Ve10ArasıOIleOlanKelimeyiSil(liste);
        System.out.println();
        System.out.println(uzunlugu12denAzMi(liste));
        System.out.println();
        System.out.println(xIleBaslamıyorMu(liste));
        System.out.println(rIleBıtıyorMu(liste));


        // uzunlugu5tenBüyükOlanElemanlarıSilYazdir(liste);
    }
    //1- Tüm elemanlari büyük harf ile yazdıran bir method olusturun

    public static void büyükHarfYazdir(List<String> list) {//1.yol
        list.stream().map(String::toUpperCase).forEach(utils::ayniSatirdaBosluklaYazdir);
    /*System.out.println("2.yol");
list.replaceAll(String::toUpperCase);
    System.out.println();*/
    }

    //2- Elemanları uzunluklarına göre sıralayıp yazdıran bir method olusturun
    public static void uzunlugaGöreYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).
                forEach(utils::ayniSatirdaBosluklaYazdir);//comparator.comparing() sıralama kosulunu belirtmek için kullanılır

    } //Elemanları ters sıoralayıp yazdıran bir method olusturun

    public static void tersSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).
                forEach(utils::ayniSatirdaBosluklaYazdir);


    }

    //4-elamnları son karakterlerine göre tekrarsız yazdiran bir method olusturun
    public static void sonKaraktereGöreTekrarsızSiralaYazdir(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(utils::sonKarakteriAl)).
                forEach(utils::ayniSatirdaBosluklaYazdir);

    }

    //5- Elemanları önce uzuynluklarına göre sonra ilk karakterine göre sıralayıp yazdiran bir method yazınız

    public static void uzunlukVeIlkHarfeGoreSiralaYazdir(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(utils::ilkKarakteriAl)).
                forEach(utils::ayniSatirdaBosluklaYazdir);

    }//6- uzunlugu 5 ten buyuk olan elemanları sılen  bir method yazınız

    /* public static void uzunlugu5tenBüyükOlanElemanlarıSilYazdir(List<String> list) {
         list.removeIf(t -> t.length() > 5);
         System.out.println(list);

 //list mutable old ıcın işlem sonrası kalıcı degistiginden commnet yapılddı

 //7-'A' 'a' ile baslayan ya da 'N' 'n' ile biten elemanşlari silen bir method olusturun

     public static void baslangıcıaIleNIleBİtenSil(List<String> list) {
       //1.yol
         list.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' ||
                 t.charAt(t.length() - 1) == 'N' || t.charAt(t.length() - 1) == 'n');

         System.out.println(list);   */
    /*public static void baslangıcıaIleNIleBİtenSil(List<String> list) {
        System.out.println("2.yyol");
        list.removeIf(t -> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);

    }
//8- uzunlugu 8 ile 10 arası olan "o"ile bitenn elemanlari yazdiran bir method olusturun

  public static void uzunlugu8Ve10ArasıOIleOlanKelimeyiSil(List<String> list) {
        list.removeIf(t -> (t.length() > 7 && t.length() < 11 || t.endsWith("o")));
        System.out.println(list);
    }*/
//9- Tüm elemanlarının uzunluklarının 12 den az olup olmadıgını kontrol eden  bir method olusturun

    public static boolean uzunlugu12denAzMi(List<String> list) {
        return list.stream().allMatch(t -> t.length() < 11);
    }
    //10- Hiç bir elemanın x ile baslamadıgını kontrol eden  bir method olusturun

    public static boolean xIleBaslamıyorMu(List<String> list) {
        return list.stream().noneMatch(t -> t.startsWith("x"));

    }//11- Herhangi bir elemanın r ile bıtıp bıtmediğin kontrol eden  bir method olusturun

    public static boolean rIleBıtıyorMu(List<String> list) {
        return list.stream().anyMatch(t -> t.endsWith("r"));
}   }