import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Kadai5 {
    public static void main(String[] args) {
        String randomString = generateRandomString();
        System.out.println(randomString);
        String inputString = inputString();
        System.out.println(inputString);
    }

    public static String generateRandomString() {
        char[] letters = {'A', 'B', 'C', 'D'};

        StringBuilder stringBuilder = new StringBuilder();
        //生成した4文字を格納するオブジェクトを生成

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int randomIndex = random.nextInt(letters.length);//0~3の整数をランダムに生成
            //random.nextInt()：ランダムな整数を生成する
            //letters.length：letters配列の要素数

            char randomChar = letters[randomIndex];

            stringBuilder.append(randomChar);
            //append()：与えられた値をStringBuilderの末尾に追加
        }
        return stringBuilder.toString();
    }

    public static String inputString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString;

        try {
            System.out.println("4文字の文字列を入力してください");
            inputString = reader.readLine();

            while (inputString.length() != 4) {
                System.out.println("入力された文字列の長さが4文字ではありません。再度入力してください");
                inputString = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputString;
    }
}
