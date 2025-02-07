public class Cuffie extends Prodotto {
    
    //ATTRIBUTI
    protected String colore;
    protected boolean wireless;
    //

    //COSTRUTTORE con PARAMETRI
    public Cuffie(String nome, double prezzo, double iva, boolean wireless){
        super(nome, prezzo, iva);
    }
    //

    //Getter e Setter
    public String getColore(){
        return colore;
    }
    public void setColore(int colore){
        this.colore = colore;
    }

    public boolean getWireless(){
        return wireless;
    }
    public void setWireless(int wireless){
        this.wireless = wireless;
    }
    //
}