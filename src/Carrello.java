import java.util.Scanner;

public class Carrello {

    //ATTRIBUTI
    private Prodotto prodotto;

    private Cuffie cuffie;
    
    private Smartphone smartphone;
    
    private Televisori televisori;
    //

    //Getter e Setter
    public Prodotto getProdotto() {
        return prodotto;
    }
    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public Cuffie getCuffie() {
        return cuffie;
    }
    public void setCuffie(Cuffie cuffie) {
        this.cuffie = cuffie;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }
    public void setSmartphone(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public Televisori getTelevisori() {
        return televisori;
    }
    public void setTelevisori(Televisori televisori) {
        this.televisori = televisori;
    }
    
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli quale prodotto vuoi inserire");
        String scelta = scanner.next();
        Prodotto prodotto = null;
		switch(scelta){
            case "cuffie":
                //Cuffie cuffia = new Cuffie("RGB", 650, 22, true);
                //System.out.println(cuffia);
                prodotto = new Cuffie("RGB", 650, 22, true);
                break;
            case "televisore":
                //Televisori televisore = new Televisori("LG", 250, 22, true);
                //System.out.println(televisore);
                prodotto = new Televisori("LG", 250, 22, true);
                break;
            case "smartphone":
                //Smartphone smartphone = new Smartphone("Oppo", 600, 22, 512);
                //System.out.println(smartphone);
                prodotto = new Smartphone("Oppo", 600, 22, 512);
                break;
            default: System.out.println("Dati non corretti");
        }
        System.out.println(prodotto);
    }
}