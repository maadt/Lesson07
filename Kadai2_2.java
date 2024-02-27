import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Kadai2_2 {
    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";
        System.out.println(permutation(str1, str2));
    }
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);//content配列の要素を昇順にソートする
        return new String(content);
        //Stringクラスのメソッドを利用して、新しい文字列を生成する
    }
    public static boolean permutation(String s, String t) {

        //長さが違えばアナグラムではないと断定できるので、判定をして処理を軽くする
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }
}
