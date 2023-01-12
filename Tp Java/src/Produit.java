public class Produit {

    static int iddddd;

    int ID;
    String Reference;
    String nom;
    double prix;
    public Produit(){
        iddddd++;

        this.ID= iddddd;

    }

    public Produit(String nom, double prix){
        iddddd++;

        this.ID= iddddd;
        this.nom= nom;
        this.prix= prix;

    }



    public int getID() {
        return ID;
    }
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public String getReference() {
        return Reference;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setReference(String reference) {
        Reference = reference;
    }
    String genererReference(String nom, int id){

        for(int i=0;i<nom.length();i++){
            if(nom.indexOf(i)%5==0){
                if(nom.charAt(i)!=' '){
                    Reference=Reference+nom.charAt(i);
                }
        }
        }
        Reference+=id;
        return Reference;
        
    }

   public String toString(){
        return "Produit [ id="+this.ID+" ; nom: "+nom+" ; prix= "+prix+" ; Ref= "+Reference+" ]";
    }

}
