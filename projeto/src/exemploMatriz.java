
import java.util.Scanner;

public class exemploMatriz {

//numeroFuncionarios = quantidade de linhas


    public static void registrarFuncionarios(String[][] nomedamatriz, int numeroDeFuncionarios, int colunas) {
        Scanner scanner = new Scanner(System.in);
        mostrarExercicios(nomedamatriz, numeroDeFuncionarios, colunas);
        int linhaRegistro; //variavel para armazenar a linha inserida pelo usuario
        boolean linhaValida = false; //variavel boolean para verificar se a linha é valida ou nao
        for (int i = 0; i < numeroDeFuncionarios; i++) {
        while (!linhaValida) { //enquanto a variavel linhavalida for true
            System.out.println("Informe onde você deseja registrar o funcionario (valores de 1 a " + numeroDeFuncionarios + "):"); //vou pedir ao usuario que insira a linha que ele vai add o exercicio - numerodeexercicios é a linha limite
            linhaRegistro = scanner.nextInt(); //armazeno



            if (linhaRegistro >= 1 && linhaRegistro <= numeroDeFuncionarios) { //se a variavel linhaExercicio for maior ou igual a 1 e se a variavel linhaExercicios for menor ou igual que o numerodeexercicios: vai fazer o que vem abaixo
                linhaValida = true;  //linhaValida true vai fazer o abaixo:
                System.out.println("Insira o nome do funcionario (nomes e sobrenomes separados com hífen: ");
                nomedamatriz[linhaRegistro - 1][0] = scanner.next();
                System.out.println("Insira o a idade do funcionário: ");
                nomedamatriz[linhaRegistro - 1][1] = scanner.next();
                System.out.println("Insira o a area de trabalho do funcionario: ");
                nomedamatriz[linhaRegistro - 1][2] = scanner.next();
                System.out.println("Insira o tempo de experiencia do funcionario (em anos): ");
                nomedamatriz[linhaRegistro - 1][3] = scanner.next();
                System.out.println("Insira o salario do funcionario: ");
                nomedamatriz[linhaRegistro - 1][4] = scanner.next();
                System.out.println("Funcionario Registrado.");
            } else { //se nao for true vai fazer o abaixo:
                System.out.println("Linha inválida. Tente novamente.");
            }
        }
        }
    }

    public static void mostrarExercicios(String[][] nomedamatriz, int numeroDeFuncionarios, int colunas) {
        System.out.println("   Nome | Idade | Area de trabalho | Tempo de experiencia (anos) | Salario (R$)"); // exibo a ordem de preenchimento
        for (int i = 0; i < numeroDeFuncionarios; i++) { //esse for vai percorrer as linhas da matriz
            System.out.print((i + 1) + " - "); //isso aqui vai fazer com que mostre a primeira linha da matriz que é 0 mas vai mostrar como se fosse 1 - e assim por diante
            for (int j = 0; j < colunas; j++) { // esse for vai percorrer as colunas da matriz
                System.out.print(nomedamatriz[i][j] + " | "); //isso vai imprimir os elementos da matriz que eu ja inseri ou que eu vou inserir no método inserirExercicios
            }
            System.out.println(); // para cada linha ficar separada
        }
    }


    public static void removerFuncionario(String[][] nomedamatriz, int numeroDeFuncionarios, String nomeFuncionario) {
        boolean encontrado = false; //inicio a variavel encontrado do tipo boolean e defino ela primeiramente para false
        for (int i = 0; i < numeroDeFuncionarios ; i++) { //esse for vai percorrer as linhas da minha matriz (linhas = numerodeexercicios)
            if (nomedamatriz[i][0] != null && nomedamatriz[i][0].equals(nomeFuncionario)) { //aqui se na coluna 0 das linhas da matriz não for igual a nulo e se na coluna 0 das linhas da matriz for igual a variavel nomeExercicio eu vou fazer com que ele faça o abaixo
                encontrado = true; //
                nomedamatriz[i][0] = null; //percorrendo todas as linhas e o se o exercicio não for encontrado a variavel encontrado passa a ser true
                nomedamatriz[i][1] = null;
                nomedamatriz[i][2] = null;
                nomedamatriz[i][3] = null;
                nomedamatriz[i][4] = null;
            }
        }
        if (encontrado) {
            System.out.println("Funcionario removido.");
        } else {
            System.out.println("Funcionario não encontrado.");
        }
    }

    public static void main(String[] args) {
        String[][] nomedamatriz; //criação da matriz
        int numeroDeFuncionarios, opcao; //iniciação de variaveis int
        int colunas = 5; // 1 - nome; 2 - idade; 3 - area de trabalho; 4 - tempo de experiencia; 5 - salario; 6 - remmover;
        Scanner scanner = new Scanner(System.in);
        String nomeFuncionario; //iniciação de variaveis String


        System.out.println("Insira a quantidade de funcionarios que serão registrados: ");
        numeroDeFuncionarios = scanner.nextInt();
        nomedamatriz = new String[numeroDeFuncionarios][colunas]; //definição do tamanho da matriz. numero de linhas = numerodeexercicios e numero de colunas = colunas (5);

        do { //fazer o que esta abaixo até que a opção seja igual a 0
            System.out.println(" 1 - Mostrar funcionarios \n 2 - Registrar Funcionarios. \n 3 - Remover funcionarios: ");
            opcao = scanner.nextInt(); //le a opção solicitada
            switch (opcao) { //vai fazer o que esta sendo proposto de acordo com a leitura da variavel opcao
                case 0:
                    break;
                case 1:
                    mostrarExercicios(nomedamatriz, numeroDeFuncionarios, colunas);
                    break;
                case 2:
                    registrarFuncionarios(nomedamatriz, numeroDeFuncionarios, colunas);
                    break;
                case 3:
                    System.out.println("Insira o nome do funcionario a ser removido."); //pede para o usuario inserir o nome do exercicio a ser removido
                    nomeFuncionario = scanner.next(); //leio e armazeno o exercicio a ser removido na variavel nomeExercicio
                    removerFuncionario(nomedamatriz, numeroDeFuncionarios, nomeFuncionario);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}