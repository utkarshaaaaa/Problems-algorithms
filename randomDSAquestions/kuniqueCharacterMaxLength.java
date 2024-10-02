package randomDSAquestions;

public class kuniqueCharacterMaxLength {
    static int sw(String a, int k) {
        int wstart = 0;
        int wend = 0;
        int len = 0;
        int unique = 0;
        int n = a.length();
        int maxlen = Integer.MIN_VALUE;
        int[] fre = new int[26];

        while (wend < n) {
            int indx = a.charAt(wend) - 97;
            if (fre[indx] == 0) {
                fre[indx]++;
                unique++;

            } else {
                fre[indx]++;
            }
            if (unique == k) {
                len = wend - wstart + 1;
                maxlen = Math.max(maxlen, len);

            } else if (unique > k) {
                // srinkage
                while (unique > k && wend > wstart) {
                    indx = a.charAt(wstart) - 97;

                    wstart++;
                    fre[indx]--;
                    if (fre[indx] == 0) {
                        unique--;
                        len = wend - wstart + 1;
                        maxlen = Math.max(maxlen, len);

                    }

                }

            }

            wend++;
        }
        return (maxlen == Integer.MIN_VALUE) ? -1 : maxlen;
    }

    public static void main(String[] args) {
        System.out.println(sw("wagaggsggdggsyysyt", 4));

    }

}
