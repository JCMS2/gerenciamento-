
package gerenciamentos;
/**José Carlos 01530501
*João Gabriel Spinelli Silva 01603379
*Jonathan César Gomes Freire Sinicio 01605270
*Gabriel da Silva Monteiro 01614815
*Maria Helena Benedito 01631011*/
public class FuncionarioEfetivo extends Funcionarios{
    private boolean planoSaude;
    
    public FuncionarioEfetivo(String nome, String cargo, double salario, boolean planoSaude) {
        super(nome, cargo, salario);
        this.planoSaude = planoSaude;
    }
void status(){
        System.out.println("cargo: "+ cargo);
        System.out.println("salario: "+salario);
        System.out.println("plano de saude: "+ planoSaude);
    }
}
