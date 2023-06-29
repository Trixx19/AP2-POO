public class Runner {
    public static void main(String[] args) {
        //-----------Inicializando os funcionários-------------\\
        FuncionarioCLT clt1 = new FuncionarioCLT("João Silva", "12345678900");
        clt1.setSalario(1500.00);
        FuncionarioCLT clt2 = new FuncionarioCLT("Mario Bros", "545525685585");
        clt2.setSalario(2500.00);
        //------Leia o comentario em Gerenciamento de folha mais abaixo---------
        //FuncionarioCLT clt3 = new FuncionarioCLT("Salem Gato feio", "98765432100");
        //clt3.setSalario(1000.00);
        FuncionarioPj pj1 = new FuncionarioPj("Maria Beatriz", "51284865656", "08910266309");
        pj1.setSalario(2500.00);
        FuncionarioPj pj2 = new FuncionarioPj("Margarida Rodrigues de Sousa", "5644876546544", "25978667349");
        pj2.setSalario(2500.00);



        //----------Gerenciando a folha salarial--------------\\
        Folha_de_salario folhaSalarial = new Folha_de_salario();
        folhaSalarial.Adicionar_folha(clt1);
        folhaSalarial.Adicionar_folha(clt2);
       //Quando ele tenta adicionar o funcionario Salem, o progama nao deixa, devido o salario estar abaixo do
       //do salario minimo, deixei comentado para o senhor ver logo o extrato, total de benefícios e valor total.
       // folhaSalarial.Adicionar_folha(clt3);
        folhaSalarial.Adicionar_folha(pj1);
        folhaSalarial.Adicionar_folha(pj2);

    
        folhaSalarial.ExtratoGeral();

        // o valor total da folha\\
        double totalFolha = folhaSalarial.Folha_Total();
        System.out.println("----------VALOR TOTAL DA FOLHA----------\n");
        System.out.println("Valor total da folha: R$" + totalFolha);
        System.out.println(" ");

        
        double totalBeneficios = folhaSalarial.Beneficios_Total();
        System.out.println("----------VALOR TOTAL DOS BENEFÍCIOS----------\n");
        System.out.println("Valor total de benefícios pagos: R$" + totalBeneficios);
        System.out.println(" ");

        
    }      
}