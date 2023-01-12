import java.util.ArrayList;
public class Stock {
    
    private ArrayList<Element> articleList;


    public Stock() {
        articleList=new ArrayList<Element>();
    }
    public Stock(ArrayList<Element> arrayList){

    }
    public Stock(ArrayList<String> nom, ArrayList<Double> prix, ArrayList<Long> quatite){

    }
    public ArrayList<Element> getArticleList() {
        return articleList;
    }
    public int getArticleNb(){
        return articleList.size();
    }
    public void setArticleList(ArrayList<Element> articleList) {
        this.articleList = articleList;
    }
    public void ajouterArticle(Article article, long quantite){
        Element element=new Element(article, quantite);
        articleList.add(element);

    }
    public void ajouterArticle(String nom, double prix,long quantite){
        Article article =new Article(nom, prix);
        ajouterArticle(article, quantite);
    }
    public void ajouterArticle(String nom, double prix,long quantite, String alimentation){
        OrdinateurDeBureau ordinateurDeBureau=new OrdinateurDeBureau(nom, prix, alimentation);
        ajouterArticle(ordinateurDeBureau, quantite);
    }
    public void ajouterArticle(String nom, double prix,long quantite, Long capacite){
        OrdinateurPortable ordinateurPortable=new OrdinateurPortable(nom, prix, capacite);
        ajouterArticle(ordinateurPortable, quantite);
    }
    public void ajouterArticle(String nom, double prix,long quantite, int capacite){
       ComposantStockage composantStockage=new ComposantStockage(nom, prix, capacite);
       ajouterArticle(composantStockage, quantite);
    }
    /**
     * @param nom
     * @param prix
     * @param quantite
     * @param tech
     */
    public void ajouterArticle(String nom, double prix,long quantite, String tech, String inter){
        Peripherique peripherique=new Peripherique(nom, prix, tech,inter);
        ajouterArticle(peripherique, quantite);
     }
    public Element trouverArticle(String reference){
        Element element=new Element(null, 0);
        for (Element ele : articleList) {
            if(ele.getReference()==reference){
                element=ele;
            }
        }
        return element;


    }
    public void modifierArticle(String reference, String nom, double prix, long quatite){
        for (Element element : articleList) {
            if(element.getReference()==reference){
                element=new Element(nom, prix, quatite);
            }
        }
    }
    public void suprimerArticle(String reference){
        for (Element element : articleList) {
            if(element.getReference()==reference){
                articleList.remove(element);
            }
        }
    }

    public void incrementerQuantiteArticle(String reference, long quantite){

        this.trouverArticle(reference).incrementerQuantiter(quantite);
        /*for (Element element : articleList) {
            if(element.getNomArticle()==reference){
                element.incrementerQuantiter(quantite);
            }*/
        
    }

    public void decrementerQuantiteArticle(String nom, long quantite){

        for (Element element : articleList) {
            if(element.getNomArticle()==nom){
                element.decrementerQuantiter(quantite);
            }
        }
    }
    
    public String toString(){
        String tousleselement="";
        for (Element element : articleList) {
           tousleselement= tousleselement + element.toString();
        }
        return tousleselement;
    }

}
