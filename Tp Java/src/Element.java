public class Element {

    private Article article;
    private long quantite;

    public Element() {
    }
    public Element(Article article, long quantite){
        this.article=article;
        this.quantite=quantite;
    }
    public Element(String nom, double prix, long quantite){
        this.article.setNom(nom);
        this.article.setPrix(prix);
        this.quantite=quantite;
    }

    public Article getArticle() {
        return article;
    }
    public long getQuantite() {
        return quantite;
    }
    public String getReference(){
        return this.article.getReference();
    }
    public String getNomArticle(){
      return  this.article.getNom();
    }
    public double getPrixArticle(){
        return this.article.getPrix();
    }
    public void setArticle(Article article) {
        this.article = article;
    }
    public void incrementerQuantiter(long quantite){
        this.quantite=this.quantite+quantite;
    }
    public void decrementerQuantiter(long quantite){
        this.quantite=this.quantite-quantite;
    }

    public void Modifier(String nom, double prix, long quantite){
        Article article=new Article(nom, prix);
        this.article=article;
        this.quantite=quantite;
    }
    public boolean equals(String reference){
        return this.article.getReference()==reference;
    }
    public boolean equals(Article article){
        return this.article==article;
    }
    

    
    public String toString() {
        return "Element [ article: id = "+"<" +this.article.getId()+">, nom= <"+this.article.getNom()+"> ,reference= <"+this.getReference()+">, prix= <"+ this.article.getPrix()+">, quatite= <"+this.quantite+">";
    }
    
}
