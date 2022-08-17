package day45_collections;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class H02_SetSoru {
    public static void main(String[] args) {
        /* soru-2:ilk soruya 3. bir islem ekleyelim
        str'i Hashset olarak olusturup elemanlari
        ekleyelim ve sonra TreeSet'e cevirip yazdiralim
         */


        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(33);
        hashSet.add(3);
        hashSet.add(21);
        hashSet.add(6);
        hashSet.add(4);
        System.out.println(hashSet);

        Set<Integer> treeSet = new HashSet<>();

        for (int each : hashSet) {
            treeSet.add(each);

        }
        System.out.println("hashSeti treeSet e ekledikten sonra = " + treeSet);


    }
}
