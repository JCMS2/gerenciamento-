
package gerenciamentos;
/**José Carlos 01530501
*João Gabriel Spinelli Silva 01603379
*Jonathan César Gomes Freire Sinicio 01605270
*Gabriel da Silva Monteiro 01614815
*Maria Helena Benedito 01631011*/

public class FuncionarioTemporario extends Funcionarios{
    private int duracaoContrato;

    public FuncionarioTemporario(String nome, String cargo, double salario,int duracaoContrato) {
        super(nome, cargo, salario);
        this.duracaoContrato = duracaoContrato;
    }
     void status(){
         System.out.println("nome: "+nome);
         System.out.println("cargo: "+ cargo);
        System.out.println("salario: "+salario);
        System.out.println("duracao do Contrato: "+duracaoContrato +" meses de duraçao");
     }

    
    }
    
     
    
  

