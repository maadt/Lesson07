public class Kadai1 {
    public static void main(String[] args) {
    String str = "abcadefg";
    System.out.println(isUniqueChars(str));
    }

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);//char型の値をint型の変数に代入する場合、自動的にchar型の値をその整数値に変換する。
            //val：文字コードが格納される変数
            //str：文字列を定義した変数
            //charAt(i)：指定されたインデックスに位置する文字を文字コード(int型)で取得する
            if (char_set[val]) return false;
            char_set[val] = true;//boolean型の配列の要素(特定の文字列)をtrueにする
            //char_set[val]：特定の文字コード
        }
        return true;
    }
}
