public abstract class Ordinateur extends AppareilInformatique{

    private String alimentation;


    public Ordinateur(String nom, double prix) {
        super(nom, prix);

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
    }@Override
    public String getReference() {
        // TODO Auto-generated method stub
        return super.getReference();
    }public String getAlimentation() {
        return alimentation;
    }
    @Override
    public void setNom(String nom) {
        // TODO Auto-generated method stub
        super.setNom(nom);
    }@Override
    public void setPrix(double prix) {
        // TODO Auto-generated method stub
        super.setPrix(prix);
    }@Override
    public void setReference(String reference) {
        // TODO Auto-generated method stub
        super.setReference(reference);
    }public void setAlimentation(String alimentation) {
        this.alimentation = alimentation;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    public abstract int garantirAppareil();
   
}
