import java.util.ArrayList;
public class Agenda{
    private ArrayList <Contato> Contatos;

    public Agenda(){
           this.Contatos = new ArrayList<>();
    }

    public void Adicionar_Contatos(Contato contato){
        if (contato.getTelefones().isEmpty()) {
            System.out.printf("\nNão foi possivel adicionar o cotanto"+ contato.getNome());
            System.out.println("\nEsse contato deve conter pelo menos um telefone!!\n");
            return;
        }

        for (Contato aux : Contatos) {
            if (aux.getNome().equals(contato.getNome())) {
                System.out.println("\nJá existe um contato com esse nome na agenda.\n");
                return;
            }
        }

        Contatos.add(contato);
    }

    public void Remover_Contatos(String nome){
        for (int i = 0; i < Contatos.size(); i++) {
            Contato contato = Contatos.get(i);
            if (contato.getNome().equals(nome)) {
                Contatos.remove(i);
                System.out.println("Contato removido!!!\n");
                return;
            }
        }
        System.out.println("Contato não encontrado!!!\n");
    }
    
    public void EditarContato(String Antigo_Nome, String Novo_Nome){
        for(Contato Aux : Contatos){
            if(Aux.getNome().equals(Antigo_Nome)){
                Aux.Alterar_Nome(Novo_Nome);
                System.out.println("Nome do contato foi alterado!\n");
                return;
            }
        }
        System.out.println("\nEsse contato não encontrado na agenda: " + Antigo_Nome);
        System.out.println(" ");
    }

    public void mostrarAgenda() {
        if (Contatos.isEmpty()) {
            System.out.println("\nA agenda está vazia.\n");
            return;
        }

        System.out.println("\nContatos da agenda:\n");
        for (Contato contato : Contatos) {
            contato.ExibirTelefonesContato();
            System.out.println("--------------------\n");
        }
    }

}


