import java.util.Scanner;

public class Funcionario {
    //atributos e metodos de funcionario
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private int idade;
    private String area_Trabalho;
    private int anos_Experiencia;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(Scanner scanner, String nome, int idade, String area_Trabalho, int anos_Experiencia, float salario) {
        this.scanner = scanner;
        this.nome = nome;
        this.idade = idade;
        this.area_Trabalho = area_Trabalho;
        this.anos_Experiencia = anos_Experiencia;
        this.salario = salario;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getArea_Trabalho() {
        return area_Trabalho;
    }

    public void setArea_Trabalho(String area_Trabalho) {
        this.area_Trabalho = area_Trabalho;
    }

    public int getAnos_Experiencia() {
        return anos_Experiencia;
    }

    public void setAnos_Experiencia(int anos_Experiencia) {
        this.anos_Experiencia = anos_Experiencia;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
