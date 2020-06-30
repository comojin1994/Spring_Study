package variables;

public class IntegerTest {
    public static void main(String[] args) {
        byte bs = 127;

        System.out.println(bs);

//        Out of range
//        int iVal = 12345678900;
//        4byte 이상의 숫자에는 L 붙여야함
        long lVal = 12345678900L;

        System.out.println(lVal);
    }
}
