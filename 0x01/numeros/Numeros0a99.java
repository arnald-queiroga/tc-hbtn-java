public class Numeros0a99 {
    public static void main(String[] args) {
        int num = 0;
        while (num < 99) {
            if (num < 98 ) {
                System.out.print(num + 1 + ", ");
            } else {
                System.out.print(num + 1 + " " + "\n");
            }
            num++;
        }
    }
} 
