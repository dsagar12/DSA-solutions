class Solution {
    public int compress(char[] chars) {

        char curr = chars[0];
        int count = 1;
        int i = 0;

        for (int left = 1; left < chars.length; left++) {

            if (chars[left] == curr) {
                count++;
            } else {
                // write character
                chars[i++] = curr;

                // write count if > 1
                if (count > 1) {
                    String cnt = String.valueOf(count);
                    for (char c : cnt.toCharArray()) {
                        chars[i++] = c;
                    }
                }

                curr = chars[left];
                count = 1;
            }
        }

        // handle last group
        chars[i++] = curr;
        if (count > 1) {
            String cnt = String.valueOf(count);
            for (char c : cnt.toCharArray()) {
                chars[i++] = c;
            }
        }

        return i;
    }
}
