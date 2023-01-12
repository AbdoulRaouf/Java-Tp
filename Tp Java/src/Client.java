import java.util.ArrayList;

import javax.crypto.AEADBadTagException;

public class Client extends Personne {
    private ArrayList<Element> panier;

    public Client(ArrayList<Element> panier) {
        this.panier = panier;
    }

    public Client(String cin, String nom, String prenom, Adress adress, ArrayList<Element> panier) {
        super(cin, nom, prenom, adress);
        this.panier = panier;
    }

    public Client(String cin, String nom, String prenom, String gouvernorat, int codePostal,
            ArrayList<Element> panier) {
        super(cin, nom, prenom, gouvernorat, codePostal);
        this.panier = panier;
    }

    public ArrayList<Element> getPanier() {
        return panier;
    }

    public void setPanier(ArrayList<Element> panier) {
        this.panier = panier;
    }
    public Element trouverArticle(String reference){
        Element el=new Element();
        for (Element element : panier) {
            if(element.getReference()==reference){
                el=element;
                return el;
            }else{
                el=null;
            }
        }
        return el;
    }

    public void AjouterAuPanier(Stock stock, String reference, long quantite){

         
    }
    }

}
