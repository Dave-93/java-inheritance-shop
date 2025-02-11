# esercizio di oggi: Java Shop

Nell’esercizio di oggi riprendiamo Java Shop applicando le proprietà di incapsulamento ed ereditarietà che abbiamo visto nel frattempo.
Bisogna creare un NUOVO repository.

## Consegna:

Nome repo: java-inheritance-shop Nel progetto java-inheritance-shop creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
Buon lavoro!

## Consegna Pt. 2

Integriamo adesso l’override nell’esercizio precedente.
Nota: lavoriamo sulla stessa repo.
Nome repo: java-inheritance-shop
Nel progetto java-inheritance-shop create una classe Carrello con metodo main, in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente utilizzate il costruttore opportuno.
Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe) Buon lavoro!

## Authors

- [@Dave-93](https://www.github.com/Dave-93)