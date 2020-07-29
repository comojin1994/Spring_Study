package loopexample;

public class NestedLoop {
    public static void main(String[] args) {
//        int dan;
//        int count;
//        for (dan = 2; dan <= 9; dan++) {
//            for (count = 1; count <= 9; count++) {
//                System.out.println(dan + "X" + count + "=" + dan * count);
//            }
//            System.out.println();
//        }

        int dan = 2;
        int count = 1;
        while (dan <= 9) {
            count = 1;
            while (count <= 9) {
                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;
            }
            System.out.println();
            dan++;
        }
    }
}
