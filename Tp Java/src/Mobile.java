public class Mobile extends AppareilInformatique {

    private double appareiPhotoArriere;
    private double appareiPhotoFrontal;
    private int nbSim;
    private long capaciteBatterie;

    public Mobile(String nom, double prix,double appareiPhotoArriere,double appareiPhotoFrontal, int nbSim, long capaciteBatterie) {
        super(nom, prix);
        this.appareiPhotoArriere=appareiPhotoArriere;
        this.appareiPhotoFrontal=appareiPhotoFrontal;
        this.nbSim=nbSim;
        this.capaciteBatterie=capaciteBatterie;
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
    public double getAppareiPhotoArriere() {
        return appareiPhotoArriere;
    }
    public double getAppareiPhotoFrontal() {
        return appareiPhotoFrontal;
    }
    public long getCapaciteBatterie() {
        return capaciteBatterie;
    }
    @Override
    public String getReference() {
        // TODO Auto-generated method stub
        return super.getReference();
    }
    public int getNbSim() {
        return nbSim;
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
    public void setAppareiPhotoArriere(double appareiPhotoArriere) {
        this.appareiPhotoArriere = appareiPhotoArriere;
    }
    public void setAppareiPhotoFrontal(double appareiPhotoFrontal) {
        this.appareiPhotoFrontal = appareiPhotoFrontal;
    }
    public void setCapaciteBatterie(long capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }
    public void setNbSim(int nbSim) {
        this.nbSim = nbSim;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    /* (non-Javadoc)
     * @see AppareilInformatique#garantirAppareil()
     */
    @Override
    public int garantirAppareil() {
        
        if(getPrix()>1000){
            return 2;
        }else{
            return 1;
        }
        
    }
}
