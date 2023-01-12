public class Article {
    private static int nextId;
    private int id;
    private String nom;
    private String reference;
    private double prix;
    private String genererReference;

    public Article(String nom, double prix) {
        this.id=nextId++;
        this.nom=nom;
        this.prix=prix;
        this.reference=genererReference(nom, id);
      }
    String genererReference(String nom, int id){
        for(int i=0;i<nom.length();i++){
            if(nom.indexOf(i)%5==0){
                if(nom.charAt(i)!=' '){
                    reference=reference+nom.charAt(i);
                }
        }
        }
        reference+=id;
        return reference;
        
    }
    public int getId() {
        return id;
    }
    public String getReference() {
        return reference;
    }
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public void setNom(String nom) {
        genererReference(nom, this.id);
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void Modifier(String parametre){
        genererReference(nom, this.id);
        this.nom=parametre;
        
    }
    public void Modifier(String nom, double prix){
        genererReference = genererReference(nom, this.id);
        this.nom=nom;
        this.prix=prix;
    }
    public String toString(){
        return"Id: "+id+" nom: "+nom+" reference: "+reference+" prix: "+ prix;
    }
}
