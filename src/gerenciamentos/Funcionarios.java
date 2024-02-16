
package gerenciamentos;
/**José Carlos 01530501
*João Gabriel Spinelli Silva 01603379
*Jonathan César Gomes Freire Sinicio 01605270
*Gabriel da Silva Monteiro 01614815
*Maria Helena Benedito 01631011*/

public class Funcionarios {
    public String nome;
    public String cargo;
    public double salario;

    public Funcionarios(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    
    public double getSalario() {
        return salario;
    }

    public void calcularBeneficios() {
        System.out.println("Calculando benefícios para " + nome);
    }
    public void duracaoContrato (){
        System.out.println("calculando duracao do Contrato de  "+ nome);
    }

    
}
