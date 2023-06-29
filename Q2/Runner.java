public class Runner {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.mostrarAgenda();
        
        Contato contato1 = new Contato("Mateus");
        Contato contato2 = new Contato("Ytalo");
        Contato contato3 = new Contato("Beatriz");

        
        contato1.AdicionarTelefone("Casa", "88 99999-8888");
        contato1.AdicionarTelefone("Celular", "999998888");
        contato2.AdicionarTelefone("Trabalho", "(99) 8888-7777");

        
        agenda.Adicionar_Contatos(contato1);
        agenda.Adicionar_Contatos(contato2);


        agenda.mostrarAgenda();

        
        agenda.EditarContato("Mateus", "Porquinho");
        agenda.mostrarAgenda();
        
        agenda.EditarContato("Joao vitor", "Manoel Gomes");

        //removendo Ytalo
        agenda.Remover_Contatos("Ytalo");

        agenda.mostrarAgenda();

        agenda.Adicionar_Contatos(contato3);

    }
}