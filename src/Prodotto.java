public class Prodotto {
   
    //ATTRIBUTI
    protected int codice;
    protected String nome;
    protected String marca;
    protected double prezzo;
    protected double iva;
    //

}

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