public class OrdinateurDeBureau extends Ordinateur {

    private String alimentation;
    public OrdinateurDeBureau(String nom, double prix, String alimentation) {
        super(nom, prix);
        this.alimentation=alimentation;
        //TODO Auto-generated constructor stub
    }
    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }
    @Override
    public String getNom() {
        // TODO Auto-generated method stub
        return super.getNom();
    }
    @Override
    public double getPrix() {
        // TODO Auto-generated method stub
        return super.getPrix();
    }
    @Override
    public String getReference() {
        // TODO Auto-generated method stub
        return super.getReference();
    }
    @Override
    public void setNom(String nom) {
        // TODO Auto-generated method stub
        super.setNom(nom);
    }
    @Override
    public void setPrix(double prix) {
        // TODO Auto-generated method stub
        super.setPrix(prix);
    }
    @Override
    public void setReference(String reference) {
        // TODO Auto-generated method stub
        super.setReference(reference);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    public int garantirAppareil() {
        return 1;
    }
    
}
