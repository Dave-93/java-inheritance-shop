public class Main {
    
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Oppo", 500.5, 22, 512);
        Smartphone smartphone2 = new Smartphone("Iphone", 1190.9, 22, 256);

        Televisori tv1 = new Televisori("LG", 850, 22, false);
        Televisori tv2 = new Televisori("Samsung", 999.9, 22, true);

        Cuffie cuffia1 = new Cuffie("Sennheiser", 450.5, 22, true);
        Cuffie cuffia2 = new Cuffie("Bose", 250.9, 22, false);
        
        System.out.println(String.format("L'articolo %s con prezzo %f e codice %s ha un costo comprensivo di IVA di %f", smartphone1.getNome(), smartphone1.getPrezzo(), smartphone1.nomeEsteso(), smartphone1.prezzoIvato()));
        System.out.println(String.format("L'articolo %s con prezzo %f e codice %s ha un costo comprensivo di IVA di %f", smartphone2.getNome(), smartphone2.getPrezzo(), smartphone2.nomeEsteso(), smartphone2.prezzoIvato()));
        
        System.out.println(String.format("L'articolo %s con prezzo %f e codice %s ha un costo comprensivo di IVA di %f", tv1.getNome(), tv1.getPrezzo(), tv1.nomeEsteso(), tv1.prezzoIvato()));
        System.out.println(String.format("L'articolo %s con prezzo %f e codice %s ha un costo comprensivo di IVA di %f", tv2.getNome(), tv2.getPrezzo(), tv2.nomeEsteso(), tv2.prezzoIvato()));
        
        System.out.println(String.format("L'articolo %s con prezzo %f e codice %s ha un costo comprensivo di IVA di %f", cuffia1.getNome(), cuffia1.getPrezzo(), cuffia1.nomeEsteso(), cuffia1.prezzoIvato()));
        System.out.println(String.format("L'articolo %s con prezzo %f e codice %s ha un costo comprensivo di IVA di %f", cuffia2.getNome(), cuffia2.getPrezzo(), cuffia2.nomeEsteso(), cuffia2.prezzoIvato()));
    }
}