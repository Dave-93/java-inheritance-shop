import java.util.Random;

public class Prodotto {
   
    //ATTRIBUTI
    protected int codice;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected double iva;
    //

    //COSTRUTTORE con PARAMETRI
    public Prodotto(String nome, double prezzo, double iva){
        codiceRandom();
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }   
    //

    //Getter e Setter
    public int getCodice(){
        return codice;
    }
    public void setCodice(int codice){
        this.codice = codice;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public double getIva(){
        return iva;
    }
    public void setIva(double iva){
        this.iva = iva;
    }
    //

    //METODI
    public void codiceRandom (){
        Random numero = new Random();
        this.codice = numero.nextInt(100, 900);//
    } 
   
    public void prezzoBase(){
        this.prezzo = prezzo;
        System.out.println(String.format("Il prezzo base del prodotto %s è: %f", nome, prezzo));
    }

    public double prezzoIvato(){
        double prezzoIvato = prezzo + (prezzo * iva)/100 ;
        return prezzoIvato;
        //System.out.println(String.format("Il prezzo ivato del prodotto %s è %f", nome, prezzoIvato));
    }

    public String nomeEsteso(){
        String codiceConvertitaInString = Integer.toString(codice);//codice + ""; aggiungendo la stringa vuota trasformo l'int in string
        String nomeConcatenato = codiceConvertitaInString.concat("-").concat(nome);//concatena una o più stringhe partendo da quella iniziale
        return nomeConcatenato;
    }
    //
}