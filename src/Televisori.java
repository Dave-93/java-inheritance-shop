public class Televisori extends Prodotto {
    
    //ATTRIBUTI
    protected int pollici;
    protected boolean smart;
    //

    //COSTRUTTORE con PARAMETRI
    public Televisori(String nome, double prezzo, double iva, boolean smart){
        super(nome, prezzo, iva);
        this.smart = smart;
    }
    //

    //Getter e Setter
    public int getPollici(){
        return pollici;
    }
    public void setPollici(int pollici){
        this.pollici = pollici;
    }

    public boolean isSmart(){
        return smart;
    }
    public void setSmart(boolean smart){
        this.smart = smart;
    }

    @Override
    public String toString() {
        String smart = isSmart() ? " è smart" : " non è smart";
        return super.toString() + "Televisore " + getNome() + ", con codice " + getCodice() + smart + " ed ha un prezzo comprensivo di IVA di " + prezzoIvato();
    }
    //
}