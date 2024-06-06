import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parametro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                System.out.println(exception);
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");

        for (int i = 1; i <= parametroDois - parametroUm; i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}