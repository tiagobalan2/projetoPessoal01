import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();  // Cria uma instância de Sistema

        int opcao;
        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Registrar funcionario");
            System.out.println("2 - Registrar gerente");
            System.out.println("3 - Acessar sistema");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ();
                    break;
                case 2:
                    // Implemente a lógica para registrar gerente
                    break;
                case 3:
                    sistema.acessarSistema(scanner);
                    break;
            }
        } while (opcao != 4);
    }




}
