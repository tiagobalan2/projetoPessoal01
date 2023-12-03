import java.util.Scanner;

public class Sistema {
    private boolean ligado = false;
    public int escolha;

    public void ligarSistema() {
        ligado = true;
    }

    public void desligarSistema() {
        ligado = false;
    }

    public void acessarSistema(Scanner scanner) {
        if (ligado) {
            System.out.println("Acesso ao sistema permitido.");

            do {
                System.out.println("O que deseja fazer");
                // Agora pode referenciar diretamente a variável de instância escolha
                escolha = scanner.nextInt();
            } while (escolha != 4);

        } else {
            System.out.println("O sistema deve ser ligado antes de acessar.");
            ligarSistema();
            System.out.println("Acesso ao sistema permitido");
            do {
                System.out.println("O que deseja fazer");
                // Agora pode referenciar diretamente a variável de instância escolha
                escolha = scanner.nextInt();
            } while (escolha != 4);
        }
    }
}
