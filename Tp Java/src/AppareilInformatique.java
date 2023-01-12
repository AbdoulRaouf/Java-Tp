public abstract class AppareilInformatique extends Article implements Garantissable {
    private double resolutionEcran;
    private String processeur;
    private long ram;
    systemDexploitation systemDexploitation;
    private enum systemDexploitation{
        FreeDos,
        Windows,
        Ubuntu,
        Android,
        IOS

    }

    public AppareilInformatique(String nom, double prix) {
        super(nom, prix);
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
    public String getProcesseur() {
        return processeur;
    }
    public long getRam() {
        return ram;
    }
    public double getResolutionEcran() {
        return resolutionEcran;
    }
    public systemDexploitation getSystemDexploitation() {
        return systemDexploitation;
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
    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }
    public void setRam(long ram) {
        this.ram = ram;
    }
    public void setResolutionEcran(double resolutionEcran) {
        this.resolutionEcran = resolutionEcran;
    }
    public void setSystemDexploitation(systemDexploitation systemDexploitation) {
        this.systemDexploitation = systemDexploitation;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    @Override
     public abstract int garantirAppareil();
}