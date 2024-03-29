package com.company;

public class MatrixChainOrder {
//    2. Алгоритм задачи о перемножении матриц
// Перемножение матриц
    public int MatrixChainOrder(int [] p, int n) {
        int m[][] = new int[n][n];

        int i, j, k, l, q;

        for(i=1; i<n; i++){
            m[i][i] = 0;
        }


        for(l=2; l < n; l++) {
            for(i=1; i < n-l+1; i++){
                j = i+l-1;
                m[i][j] = Integer.MAX_VALUE;
                for(k=i; k <= j-1; k++) {
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
                    if(q < m[i][j])
                        m[i][j] = q;
                }
            }
        }

        return m[1][n-1];
    }
}
