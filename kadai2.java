public class Kadai2 {
    public static void main(String[] args) {
        String s = "dog";
        String t = "g o d";
        System.out.print(permutation(s, t));
    }

    public static boolean permutation(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] letters = new int[128];//文字列を判別するための配列を作成
        char[] s_array = s.toCharArray();
        //toCharArray()：文字列をchar型の配列に変換する

        for (char c : s_array) {
            letters[c]++; //文字列sのカウント
        }
        for (int i = 0; i < t.length(); i++) {
            int c = (int)t.charAt(i);//ASCIIコードの値をint型にキャスト
            if(--letters[c] < 0) {
            //--letters[c]：letters配列の要素[c]をデクリメントしている
                return false;
            }
        }
        return true;
    }
}
