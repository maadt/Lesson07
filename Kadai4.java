public class Kadai4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        swap(a, b);
    }
    public static void swap(int a, int b) {
        a = a + b; //3 + 5 = 8
        b = a - b; //8 - 5 = 3
        a = a - b; //8 - 3 = 5

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
