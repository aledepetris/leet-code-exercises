package com.aledepetris.leetcode.daily.challenge;

public class DivideStringIntoGroupsOfSizeK {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int sizeOfAns = n/k;
        int mod = n % k;
        if ( mod != 0) sizeOfAns += 1;

        int leftChars = k - mod;

        String[] ans = new String[sizeOfAns];

        int i = 0;
        int j = 0;

        while (i < sizeOfAns) {
            int range = j + k;
            if (range < n) {
                ans[i] = s.substring(j, range);
                j += k;
            } else {
                ans[i] = s.substring(j);
            }
            i++;
        }

        if (mod != 0) {
            StringBuilder sb = new StringBuilder(ans[sizeOfAns-1]);
            for (int m = 0; m < leftChars; m++) {
                sb.append(fill);
            }
            ans[sizeOfAns-1] = sb.toString();
        }

        return ans;

    }
}
