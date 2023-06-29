public class FuncionarioPj implements Funcionarios{
   private String Nome;
   private String Cpf;
   private String Cnpj;
   private Double Salario;

public FuncionarioPj(String NomeCompleto, String cpf, String cnpj){
    this.Nome = NomeCompleto;
    this.Cpf = cpf;
    this.Cnpj = cnpj;
}
    
    public void setSalario(Double salario) {
        this.Salario = salario;
    }

    public String getCNPJ(){
        return this.Cnpj;
    }

    public String Nome(){
        return this.Nome;
    }
    public String Cpf(){
        return this.Cpf;
    }
    public Double AuxilioSaude(){
        return 500.0;
        
    }
    public Double ValeRefeição(){
        return 0.0;
    }
    public Double Salario(){
        return this.Salario;
    }
}