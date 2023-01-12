public class ComposantStockage extends AppareilInformatique implements Garantissable {
 
    
    /**
     * @param nom
     * @param prix
     * @param capacite
     */
    public ComposantStockage(String nom, double prix, int capacite) {
        super(nom, prix);
        this.capacite=capacite;
        //TODO Auto-generated constructor stub
    }
    private int capacite;
    
    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public int getCapacite() {
        return capacite;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    public int garantirAppareil() {
        if(capacite<=500){
            return 1;
        }
        else{
            return 2;
        }
    }
    
}
