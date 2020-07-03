package array;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr_ = new int[2][3];
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};

//        System.out.println(arr.length);
//        System.out.println(arr[0].length);
//        System.out.println(arr[1].length);

        for ( int[] row : arr){
            for ( int col : row){
                System.out.println(col);
            }
        }
        System.out.println("===============");
        for ( int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
