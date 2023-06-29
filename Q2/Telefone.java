public class Telefone{
    private String Tipo;
    private String Numero;

    public Telefone(String tipo, String numero){
        this.Tipo = tipo;
        this.Numero = numero;
    }

    public String get_tipo(){
        return this.Tipo;
    }

    public String get_numero(){
        return this.Numero;
    }
}