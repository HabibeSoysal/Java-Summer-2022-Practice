package day47_Maps;

import day46_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C01_DününTekrarı {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMAp= ReusableMethods.mapOluştur();
        System.out.println(sinifListMAp);

//öğrenci listesini isim soyisim olarak yazdırınız.
ReusableMethods.tumValueSiraliYazdir(sinifListMAp);

// kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
ReusableMethods.bransOgrenciSayisiYazdir(sinifListMAp);







    }
}
