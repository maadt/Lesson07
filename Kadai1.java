class Kadai1 {
    public static void main(String[] args) {
    String str = "abcadefg";
    System.out.println(isUniqueChars(str));
    }

    public static boolean isUniqueChars(String str) {
        char[] charArray = str.toCharArray();

        char charA;
        char charB;
        for (int i = 0; i < charArray.length - 1; i++) {//8
            charA = charArray[i];
            for (int j = i + 1; j < charArray.length; j++) {
                charB = charArray[j];
                if (charA == charB) {
                    return false;
                }
            }
        }
        return true;
    }
}
