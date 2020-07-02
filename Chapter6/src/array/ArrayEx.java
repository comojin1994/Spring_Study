package array;

public class ArrayEx {
    public static void main(String[] args) {
        char[] arr = new char[26];
        for (int i = 65;i < 65 + arr.length; i++){
            arr[i-65] = (char)i;
        }
        System.out.println(arr);

        char[] alpha = new char[26];
        char ch = 'A';
        for (int i = 0;i < alpha.length; i++){
            alpha[i] = ch++;
        }
        System.out.println(alpha);
    }
}
