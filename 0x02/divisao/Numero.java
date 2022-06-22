public class Numero {
    public static void dividir(int a, int b){
        try {
            System.out.println(a + " / " + b + " = " + (a / b));
        }
        catch (ArithmeticException Exception){
            System.out.println("Nao eh possivel dividir por zero");
        }
        finally {
            if (b == 0)
                System.out.println(a + " / " + b + " = " + 0);
        }
    }
} 
