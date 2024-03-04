public class Kadai3 {
    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewatt";
        System.out.println(isRotation(str1, str2));
    }
    public static boolean isSubstring(String s1, String s2) {
    //文字列s1が文字列s2のサブストリング(部分文字列)であるかどうかを判断する
        return s1.matches(".*" + s2 + ".*$");
        //matches()：String クラスに定義されているメソッドで、文字列が指定された正規表現に一致するかどうかを判断する
        //".*"：
        //".*$"：
    }
    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            String s1s1 = s1 + s1; //str1を2回繰り返し、
            return isSubstring(s1s1, s1); //str2が出現するか調べる
        }
        return false;
    }
}
