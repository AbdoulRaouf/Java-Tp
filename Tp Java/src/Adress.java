public class Adress {
    private String gouvernorat;
    private int codePostal;
    
    public Adress(String gouvernorat, int codepostal){
        this.gouvernorat=gouvernorat;
        this.codePostal=codepostal;
    }
    public String getGouvernorat(){
        return gouvernorat;
    }
    public int getCodePostal(){
        return codePostal;
    }
    public void setGouvernorat(String gouvernorat){
        this.gouvernorat=gouvernorat;
    }
    public void setCodePostal(int codePostal){
        this.codePostal=codePostal;
    }
    public String toString() {
        return "Adress " + "[gouvernorat = " + this.gouvernorat+
           " CodePostal " + this.codePostal + " ]";
     }
     
}
