package gerenciamentos;
/**José Carlos 01530501
*João Gabriel Spinelli Silva 01603379
*Jonathan César Gomes Freire Sinicio 01605270
*Gabriel da Silva Monteiro 01614815
*Maria Helena Benedito 01631011*/
import java.util.Scanner;

public class SistemaGerenciamentoFuncionarios {
    private static Object temporario1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FuncionarioEfetivo efetivo1 = new FuncionarioEfetivo("João", "Analista", 5000.0, true);
        FuncionarioEfetivo efetivo2 = new FuncionarioEfetivo("felipe", "desenvolvedor", 6000.0, true);
         FuncionarioEfetivo efetivo3 = new FuncionarioEfetivo("josé", "programador", 3500.0, true);
        FuncionarioTemporario temporário1 = new FuncionarioTemporario ("joana","analista",3000.0,6);
        FuncionarioTemporario temporário2 = new FuncionarioTemporario ("fernando","desenvolvedor",2500.0,8);
        FuncionarioTemporario temporário3 = new FuncionarioTemporario ("felipe","programador",2000.0,12);
        
        System.out.println("Calculando benefícios para diferentes funcionários:");
        
    

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calcular benefícios para funcionário efetivo");
            System.out.println("2. Calcular benefícios para funcionário temporário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    efetivo1.calcularBeneficios();
                   efetivo1.status();
                    efetivo2.calcularBeneficios();
                    efetivo2.status();
                    efetivo3.calcularBeneficios();
                    efetivo3.status();
                    break;
                case 2:
                   temporário1.duracaoContrato();
                    temporário1.status();
                    temporário2.duracaoContrato();
                    temporário2.status();
                    temporário3.duracaoContrato();
                   temporário3.status();
                    
                    break;
                case 0:
                    System.out.println("Saindo do programa. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
