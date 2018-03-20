package katas;

public class PascalTriangle {
    public static int[][] pascal(int size) {
        int[][] pascalTriangle = new int[size][];
        for(int i = 0; i < size; i++) {
            int[] actual = new int[i+1];
            for(int j = 0; j < actual.length; j++) {
                if (j == 0 || j == i) {
                    actual[j] = 1;
                } else {
                    actual[j] = pascalTriangle[i-1][j-1] + pascalTriangle[i-1][j];
                }
                 pascalTriangle[i] = actual;
            }
        }
        return pascalTriangle;
    }

}
