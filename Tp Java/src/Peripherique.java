public class Peripherique extends AppareilInformatique {
    public Peripherique(String nom, double prix,String technoligie, String interfaceAvecOrdinateur, Peripherique peripherique) {
        super(nom, prix);
        peripherique.technologieDeConnexion=technoligie;
        this.interfaceAvecOrdinateur=interfaceAvecOrdinateur;
        

        //TODO Auto-generated constructor stub
    }
    private String technologieDeConnexion;
    private String interfaceAvecOrdinateur;
    public String getInterfaceAvecOrdinateur() {
        return interfaceAvecOrdinateur;
    }
    public String getTechnologieDeConnexion() {
        return technologieDeConnexion;
    }
    public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
        this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
    }
    public void setTechnologieDeConnexion(String technologieDeConnexion) {
        this.technologieDeConnexion = technologieDeConnexion;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
    public int garantirAppareil() {
        // TODO Auto-generated method stub
        return 0;
    }
}
