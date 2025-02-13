public class Cuffie extends Prodotto {
    
    //ATTRIBUTI
    protected String colore;
    protected boolean wireless;
    //

    //COSTRUTTORE con PARAMETRI
    public Cuffie(String nome, double prezzo, double iva, boolean wireless){
        super(nome, prezzo, iva);
        this.wireless = wireless;
    }
    //

    //Getter e Setter
    public String getColore(){
        return colore;
    }
    public void setColore(String colore){
        this.colore = colore;
    }

    public boolean isWireless(){
        return wireless;
    }
    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }
    //

    @Override
    public String toString() {
        String wireless = isWireless() ? " sono wireless" : " sono wired";
        return  super.toString() + "Cuffie " + getNome() + ", con codice " + getCodice() + wireless + " ed hanno un prezzo comprensivo di IVA di " + prezzoIvato();
    }
}