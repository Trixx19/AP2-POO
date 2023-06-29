import java.util.ArrayList;
public class Contato{
    private String Nome;
    private ArrayList<Telefone> Telefones;
    
    public Contato(String nome){
        this.Nome = nome;
        this.Telefones = new ArrayList<Telefone>();
    }

    public void AdicionarTelefone(String Tipo_de_Numero, String Novo_numero){
        Telefone telefone = new Telefone(Tipo_de_Numero, Novo_numero);
        Telefones.add(telefone);
    }

    public void ExibirTelefonesContato() {
        System.out.println("Nome: " + this.Nome);
        for (Telefone telefone : Telefones) {
            System.out.println("Telefone: " + telefone.get_tipo() + " - " + telefone.get_numero());
        }
    }

    public String getNome(){
        return this.Nome;
    }

    public void Alterar_Nome(String Nov_Nome){
        this.Nome = Nov_Nome;
    }

    public ArrayList<Telefone> getTelefones(){
        return this.Telefones;
    }
}