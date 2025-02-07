public class Smartphone extends Prodotto{
    
    //ATTRIBUTI
    protected int codiceImei;
    protected int quantitaMemoria;
    //

    //COSTRUTTORE con PARAMETRI
    public Smartphone(String nome, double prezzo, double iva, int quantitaMemoria){
        super(nome, prezzo, iva);
    }
    //

    //Getter e Setter
    public int getCodiceImei(){
        return codiceImei;
    }
    public void setCodiceImei(int codiceImei){
        this.codiceImei = codiceImei;
    }

    public int getQuantitaMemoria(){
        return quantitaMemoria;
    }
    public void setQuantitaMemoria(int quantitaMemoria){
        this.quantitaMemoria = quantitaMemoria;
    }
    //
}