class Solution {
    public String fractionAddition(String expression) {
        List<String> list = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (j < expression.length()) {
            if (j != 0 && (expression.charAt(j) == '+' || expression.charAt(j) == '-')) {
                list.add(expression.substring(i, j));
                i = j;
            }
            j++;
        }
        list.add(expression.substring(i, j));

        int a = 0;
        int b = 1;

        for (int k = 0; k < list.size(); k++) {
            String s = list.get(k);
            int c = 0, d = 0;

            if (k == 0) {
                // without sign and 10's
                if (s.length() == 3) {
                    c = s.charAt(0) - '0';
                    d = s.charAt(2) - '0';
                }

                if (s.length() == 4) {
                    // with sign without 10's
                    if (s.charAt(0) == '-' || s.charAt(0) == '+') {
                        c = s.charAt(1) - '0';
                        d = s.charAt(3) - '0';
                    }

                    // without sign with 10's
                    else {
                        if (s.charAt(0) == '1' && s.charAt(1) == '0') {
                            c = 10;
                            d = s.charAt(3) - '0';
                        } else {
                            c = s.charAt(0) - '0';
                            d = 10;
                        }
                    }
                }

                // with sign with 10's
                if (s.length() == 5) {
                    if (s.charAt(1) == '1' && s.charAt(2) == '0') {
                        c = 10;
                        d = s.charAt(4) - '0';
                    } else {
                        c = s.charAt(1) - '0';
                        d = 10;
                    }
                }
            }

            else {
                // with sign without 10's
                if (s.length() == 4) {
                    c = s.charAt(1) - '0';
                    d = s.charAt(3) - '0';
                }

                // with sign and 10's
                if (s.length() == 5) {
                    if (s.charAt(1) == '1' && s.charAt(2) == '0') {
                        c = 10;
                        d = s.charAt(4) - '0';
                    } else {
                        c = s.charAt(1) - '0';
                        d = 10;
                    }
                }
            }

            if (s.charAt(0) == '-') {
                c = -c;
            }

            a = (a * d) + (b * c);
            b = b * d;

            int gcdVal = gcd(Math.abs(a), b);
            a /= gcdVal;
            b /= gcdVal;
        }

        if (a == 0) return "0/1";

        StringBuilder sb = new StringBuilder();
        sb.append(a).append('/').append(b);

        return sb.toString();
    }

    public int gcd(int a, int b) {
        // Euclidean Algorithm

        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }

        if (a == 0) return b;
        else return a;
    }
}