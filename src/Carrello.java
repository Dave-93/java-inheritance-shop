
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
    
    public String toString() {
        return "Il prodotto selezionato è ";
    }
    
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scegli quale prodotto vuoi inserire");
        String scelta = scanner.next();
		switch(scelta){
            case "cuffie": Cuffie cuffia = new Cuffie("RGB", 650, 22, true);
                System.out.println(cuffia);
                break;
            case "televisore": Televisori televisore = new Televisori("LG", 250, 22, true);
                System.out.println(televisore);
                break;
            case "smartphone": Smartphone smartphone = new Smartphone("Oppo", 600, 22, 512);
                System.out.println(smartphone);
                break;
            default: System.out.println("Dati non corretti");
        }            
    }
}