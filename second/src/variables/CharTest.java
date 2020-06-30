package variables;

public class CharTest {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println((int)ch);

        int iCh = 66;
        System.out.println((char)iCh);

//        Error
//        char ch2 = -66;

        char hangul = '\uAC00';
        System.out.println(hangul);

        char ch2 = '한';
        System.out.println(ch2);
    }
}
