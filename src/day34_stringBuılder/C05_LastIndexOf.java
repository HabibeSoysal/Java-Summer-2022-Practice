package day34_stringBuılder;

public class C05_LastIndexOf {
    public static void main(String[] args) {


    StringBuilder sb=new StringBuilder("Pay attention please");
        System.out.println(sb.indexOf("Pay")); //0

        System.out.println(sb); // Pay attention please

        System.out.println(sb.indexOf("e")); // 7

        System.out.println(sb.indexOf("e",10)); // 16 10. indeksten sonra e arayacak

        System.out.println(sb.lastIndexOf("e")); // 19
        System.out.println(sb.lastIndexOf("e",10)); // 7 /  10 indeksten başa doğru e arayacak


    }
 }