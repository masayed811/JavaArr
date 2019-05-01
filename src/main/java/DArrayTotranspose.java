public class DArrayTotranspose {
    public static void main(String args[]) {
        // create an array
        int arr[][] = new int[3][3];

        // assign value to 1st row having r-index 0
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        // assign value to 2nd row having r-index 1
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        // assign value to 3nd row having r-index 2
        arr[2][0] = 11;
        arr[2][1] = 12;
        arr[2][2] = 13;

        // print the value of the array
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print( " " + arr[r][c] + " " );
            }
            System.out.println();//new line
        }

        //creating another matrix to store transpose of a matrix
        int transpose[][] = new int[3][3];  //3 rows and 3 columns

//Code to transpose a matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println( "Printing Matrix After Transpose:" );
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( transpose[i][j] + " " );
            }
            System.out.println();//new line
        }
    }
}
