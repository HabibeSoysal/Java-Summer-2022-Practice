package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Fp01 {
    /*
1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
   Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
3) Functional Programming, Arrays ve Collections ile kullanılır.
4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.

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
        listElemanlariniYazdirStructured(liste);
        System.out.println("1-functional:");
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println("2-functional:");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKupleriniYazdirFunctional(liste);
        System.out.println();
        tekrarsızCiftElemanlarinKareToplam(liste);
        System.out.println();
        tekrarsızCiftElemanlarinKupunÇarpiminiYazdir(liste);
        getMaxEleman(liste);
        getMaxEleman2(liste);
        getMinEleman(liste);
        getYedidenBuyukCiftMin(liste);
        getYedidenBuyukCiftMin2(liste);
        getYedidenBuyukCiftMin3(liste);
        getTersSiralamaylaTekrarsizElemanlarinYarisi(liste);


        //1) Ardışık list elementlerini aynı
        // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    }

    public static void listElemanlariniYazdirStructured(List<Integer> list) {

        for (Integer w : list) {
            System.out.print(w + " ");
        }

    }
//1) Ardışık list elementlerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)

    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//strea metodu colectiondan
        // elementleri akışa dahil etmek için ve öetotlara ulaşmak için kullanılır

    }

    //2) Ardışık cift list elementlerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

        // 2) Ardışık cift list elementlerini aynı
        // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)

    }

    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }

    // 3) Ardışık tek list elementlerininin karelerini aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));
//elemanlarin degerleri degişecekse map metodunu kullanılır
    }
    //4-Ardışık tek list elementlerininin küplerini tekrarsız olarak aynı
    // satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(functıonal)

    public static void tekElemanlarinKupleriniYazdirFunctional(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 == 1).
                map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

    }
    //5-tekrarsız cift elementlerininin karelerinin toplamini hesaplayan bir method oluşturun.(functıonal)

    public static void tekrarsızCiftElemanlarinKareToplam(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).
                map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);


    }

    //6-tekrarsız cift elementlerininin kupunun çarpimini hesaplayan bir method oluşturun.(functıonal)
    public static void tekrarsızCiftElemanlarinKupunÇarpiminiYazdir(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).
                map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);

    }

    //7-list elemanlari arasınsan en büyük degeri bulan bir method oluşturun.(functıonal)
//1.yol
    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol
    public static void getMaxEleman2(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println("max = " + max);

    }
    //8-list elemanlari arasınsan en kücük degeri bulan bir method oluşturun.(functıonal)

    public static void getMinEleman(List<Integer> list) {
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("min = " + min);
    }

    //9-list elemanlari arasınsan 7 den  büyük cift en küçük  degeri bulan bir method oluşturun.(functıonal)1.yol
    public static void getYedidenBuyukCiftMin(List<Integer> list) {
        Integer minIstenilen = list.stream().distinct().filter(t -> t % 2 == 0).
                filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println("minIstenilen = " + minIstenilen);

    }//9-list elemanlari arasınsan 7 den  büyük cift en küçük  degeri bulan bir method oluşturun.(functıonal)2.yol

    public static void getYedidenBuyukCiftMin2(List<Integer> list) {
        Integer minIstenilen2 = list.stream().distinct().filter(t -> t % 2 == 0).
                filter(t -> t > 7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println("minIstenilen2 = " + minIstenilen2);

    }

    //3.yol
    public static void getYedidenBuyukCiftMin3(List<Integer> list) {
        Integer minIstenilen3 = list.stream().distinct().filter(t -> t % 2 == 0).
                filter(t -> t > 7).sorted().findFirst().get();
        System.out.println("minIstenilen3 = " + minIstenilen3);
    }
//10-ters sıralama ile tekrarsız ve 5 ten büyük elemanların yarı   degerlerini(elemanı ikiye bölüp sonucunu)
// bulan bir method oluşturun.(functıonal)2.yol

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {
        List<Double> sonuc = list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);


    }
}