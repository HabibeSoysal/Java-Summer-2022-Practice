package day34_stringBuılder;

public class C07_delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzel");

        sb.delete(8, 9);

        System.out.println(sb); // Java herzaman guzel

        sb.deleteCharAt(7);
        System.out.println(sb); // Java heraman guzel
        // bastan baslayarak her loop'da ilk harfi silip kalani yazdiralim
        System.out.println("");
        int son = sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);
        }
            System.out.println("");

            for (int j =0; j < sb.length()-1; j++) {
                sb.deleteCharAt(sb.length()-1);
                System.out.println(sb);
            }

    }
}