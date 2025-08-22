public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("------ Calculadora -------");
        System.out.println("Soma de dois inteiros: " + calc.soma(30, 20));
        System.out.println("Soma de dois doubles: " + calc.soma(1.5, 3.5));
        System.out.println("Soma de três inteiros: " + calc.soma(5, 5, 5));
    }
}