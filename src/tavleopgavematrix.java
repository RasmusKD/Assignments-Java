public class tavleopgavematrix {
    public static void main(String[] args) {
        int x = 1;
        int[][] tabel = new int[3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                tabel[i][j]=x;
                x++;
            }
        }
        udskriv(tabel, 3, 4);
        System.out.println(sum(tabel, 3, 4));
        System.out.println(rowSum(tabel, 4, 0));
        System.out.println(columnSum(tabel, 3, 0));
        System.out.println(minRowSum(tabel, 3, 4));
        System.out.println(maxRowSum(tabel, 3, 4));
    }
    public static int rowSum (int[][] a, int col, int rnr){
        int rsum = 0;
        for (int i = 0; i < col; i++){
            rsum+=a[rnr][i];
        }
        return rsum;
    }

    public static int columnSum (int[][] a, int row, int cnr){
        int rsum = 0;
        for (int i = 0; i < row; i++){
            rsum+=a[i][cnr];
        }
        return rsum;
    }
    public static int maxRowSum (int[][] a, int row, int col){
        int maxSum = rowSum(a, 4, 0);
        int maxRow = 0;
        for (int i = 0; i < row; i++){
            int sum = rowSum(a, col, i);
            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static int minRowSum (int[][] a, int row, int col){
        int minSum = rowSum(a, 4, 0);
        int minRow = 0;
        for (int i = 0; i < row; i++){
            int sum = rowSum(a, col, i);
            if (sum < minSum) {
                minSum = sum;
                minRow = i;
            }
        }
        return minRow;
    }

    public static int sum (int[][] a, int row, int col){
        int sum = 0;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                sum += a[i][j];
            }
        }
        return sum;
    }
    public static void udskriv (int[][] a, int row, int col){
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

