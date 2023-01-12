public class Administrateur extends Personne{
    private Stock stock;

    public Administrateur() {
        stock=new Stock();
    }

    public Administrateur(String cin, String nom, String prenom, Adress adress, Stock stock) {
        super(cin, nom, prenom, adress);
        this.stock = stock;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    public void AjouterArticle(Article article, Long quatite){
        stock.ajouterArticle(article, quatite);
    }
    public void Modifier(String reference){
        for (Element element:stock.getArticleList()) {
            if(element.getReference()==reference){
                element.Modifier(reference, numbre, numbre);
            }
        } 

    }
    public void SupprimerArticle(String reference){
        for (Element element:stock.getArticleList()) {
            if(element.getReference()==reference){
                stock.suprimerArticle(reference);
            }
            
        }
    }
    public void AfficherStock(){
       for (Element element: stock.getArticleList()) {
        System.out.println(element.toString());
       }
    }
}
