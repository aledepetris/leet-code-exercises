package com.aledepetris.roadmap.algomaster.bit.manipulation;

public class CountingBits {

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                ans[i] = ans[i / 2];
            else
                ans[i] = 1 + ans[i / 2];
        }
        return ans;
    }

    public int[] countBits2(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int aux = i;
            while(aux != 0) {
                count = count + (aux & 1);
                aux = aux >>> 1;
            }
            ans[i] = count;
        }
        return ans;
    }

}
