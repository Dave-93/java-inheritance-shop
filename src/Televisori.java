public class Televisori extends Prodotto {
    
    //ATTRIBUTI
    protected int dimensione;
    protected boolean smart;
    //

    //COSTRUTTORE con PARAMETRI
    public Televisori(String nome, double prezzo, double iva, boolean smart){
        super(nome, prezzo, iva);
    }
    //

    //Getter e Setter
    public int getDimensione(){
        return dimensione;
    }
    public void setDimensione(int dimensione){
        this.dimensione = dimensione;
    }

    public boolean isSmart(){
        return smart;
    }
    public void setSmart(int smart){
        this.smart = smart;
    }
    //
}