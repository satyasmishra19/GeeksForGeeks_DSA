class GFG {
    static void rotate(int mat[][]) {
        int k = mat.length;
        int matt[][] = new int[k][k];

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                matt[j][k - i - 1] = mat[i][j]; // flip vertically
            }
        }

        // Copy back to original matrix
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                mat[i][j] = matt[i][j];
            }
        }
    }
}