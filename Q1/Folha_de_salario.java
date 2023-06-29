import java.util.ArrayList;

public class Folha_de_salario{
    private ArrayList<Funcionarios> Lista_Fucionarios;

    public Folha_de_salario(){
        this.Lista_Fucionarios = new ArrayList<>();
    }

    public void Adicionar_folha(Funcionarios funci){
        Lista_Fucionarios.add(funci);
    }

    public void ExtratoGeral() {
        System.out.println("----------EXTRATO GERAL----------");
        for (Funcionarios funcionario : Lista_Fucionarios) {
            System.out.println("Nome: "+ funcionario.Nome());
            System.out.println("CPF: " + funcionario.Cpf());
            System.out.println("Salário: R$" + funcionario.Salario());
            System.out.println("Benefícios:");
            System.out.println("- Vale-refeição: R$" + funcionario.ValeRefeição());
            System.out.println("- Auxílio-saúde: R$" + funcionario.AuxilioSaude());
            System.out.println();
        }
    }

    public Double Folha_Total(){
        
        Double TotalFolha = 0.0;

        for(Funcionarios funcionario : Lista_Fucionarios){
            TotalFolha += funcionario.Salario();
        }

        return TotalFolha;

    }

    public Double Beneficios_Total(){
        Double TotalBeneficios = 0.0;
        for(Funcionarios fucionario : Lista_Fucionarios){
            TotalBeneficios += fucionario.ValeRefeição();
            TotalBeneficios += fucionario.AuxilioSaude();
        }

        return TotalBeneficios;
    }

    
}