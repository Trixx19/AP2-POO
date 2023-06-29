public class FuncionarioCLT implements Funcionarios{
    private String Nome;
    private String Cpf;
    private Double Salario;

    public FuncionarioCLT(String Nome_Completo, String cpf_){
        this.Nome = Nome_Completo;
        this.Cpf = cpf_;
    }
    public void setSalario(double salario) {
        if (salario >= 1320) {
            this.Salario = salario;
        } else {
            System.out.println("----------AVIISO!!----------");
            System.out.println("O salário mínimo para um funcionário CLT é de R$ 1.320,00 Ajuste O salario de " + this.Nome);
        }
    }

    public String Nome(){
        return this.Nome;
    }
    public String Cpf(){
        return this.Cpf;
    }
    public Double Salario(){
        return this.Salario;
    }
    public Double AuxilioSaude(){
        return 500.0;

    }
    public Double ValeRefeição(){
        return this.Salario * 0.06;
    }
        
}