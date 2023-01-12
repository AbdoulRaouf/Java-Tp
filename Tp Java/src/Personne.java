public abstract class Personne {
    private String cin;
    private String nom;
    private String prenom;
    private Adress adress;
    public int numbre;
    
    public Personne(){}
    public Personne(String cin, String nom, String prenom, Adress adress){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adress;
    }
    public Personne(String cin, String nom, String prenom, String gouvernorat, int codePostal){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.adress.setGouvernorat(gouvernorat);
        this.adress.setCodePostal(codePostal);
    }
    public void setCin(String cin){
        this.cin=cin;
    }
    public String getCin(){
        return this.cin;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public Adress getAdress(){
        return this.adress;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public void setAdress(Adress adress){
        this.adress=adress;
    }
    public String toString(){
        return " cin = " +this.cin +" Nom = "+this.nom + " Prenom = "+ this.prenom + " Adress " + "gouvernorat = " + adress.getGouvernorat()+" CodePostal= " + adress.getCodePostal();
    }
}
