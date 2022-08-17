package day45_collections;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class H03 {
    public static void main(String[] args) {
          /*
        Bir TreeSet ve HashSet'e random 100 sayi ekleyin
        islem surelerini kiyaslayin
        Long time=System.currentTimeMilis()
         */
        Set<Integer>sayiSet=new TreeSet<>();
        Random rnd = new Random();

        int sayi=0;
        int sayiAdet=0;
        long startTime = System.currentTimeMillis();//baslangıc
        System.out.println(startTime);

        while (sayi<=100){
            sayi=rnd.nextInt(500);
            sayiSet.add(sayi);
            sayiAdet++;


        }long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("*****");

        int sayi2=0;
        int sayiAdet2=0;
        Set<Integer>has=new HashSet<>();
        long startTime2 = System.currentTimeMillis();//startTime = 1660202443336
        System.out.println(startTime2);
        while (sayiAdet<=100) {

            sayi = rnd.nextInt(500);
            has.add((Integer) sayi);
            sayiAdet++;
        }   long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2);//endTime = 1660202443336
    }
}
