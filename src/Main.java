// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        char a = 'A';
        int c;

        for (int i = 1; i <= 26; i++) {

            if (i % 4 == 0) {
                System.out.print(a + " ");
                a++;
            } else {
                a++;
            }
        }

    }}