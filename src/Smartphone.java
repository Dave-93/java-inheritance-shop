public class Smartphone extends Prodotto{
    
    //ATTRIBUTI
    protected String codiceImei;
    protected int quantitaMemoria;
    //

    //COSTRUTTORE con PARAMETRI
    public Smartphone(String nome, double prezzo, double iva, int quantitaMemoria){
        super(nome, prezzo, iva);
    }
    //

    //Getter e Setter
    public String getCodiceImei(){
        return codiceImei;
    }
    public void setCodiceImei(String codiceImei){
        this.codiceImei = codiceImei;
    }

    public int getQuantitaMemoria(){
        return quantitaMemoria;
    }
    public void setQuantitaMemoria(int quantitaMemoria){
        this.quantitaMemoria = quantitaMemoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone " + getNome() + ", con codice " + getCodice() + " ed ha un prezzo comprensivo di IVA di " + prezzoIvato();
    }
    //
}