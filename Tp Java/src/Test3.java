import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(){
        ArrayList<String> Nom = new ArrayList<String>();
        Nom.add("PC DELL");
        Nom.add("JBL");
        Nom.add("infinix");
        Nom.add("casque");
        Nom.add("Nokia");
        ArrayList<Double> Prix = new ArrayList<Double>();
        Prix.add(12.7);
        Prix.add(12.6);
        Prix.add(12.0);
        Prix.add(12.1);
        Prix.add(12.3);

        ArrayList<Long> quatite=new ArrayList<Long>();
        quatite.add((long) 1);
        quatite.add((long) 4);
        quatite.add((long) 3);
        quatite.add((long) 2);
        quatite.add((long) 7);
        
        Stock stock=new Stock();
        for(int i=0; i<5; i++){

            Article article=new Article(Nom.get(i),Prix.get(i));
            stock.ajouterArticle(article, quatite.get(i));
        }
        System.out.println("0: Gerant/n 1:client");
        Scanner scanner=new Scanner(System.in);
        int i= scanner.nextInt();
        switch(i){
            case 0:{
                System.out.println("0:ajouter article");
                System.out.println("1:augmenter la quantiter");
                System.out.println("2:moudifier l'article");
                System.out.println("3:supprimmer Article");
                System.out.println("4:Consilter le stock");
                int a=scanner.nextInt();
                switch(a){
                    case 0:{ 
                    System.out.println("le nom article");
                    String nom=scanner.nextLine();
                    System.out.println("prix");
                    double prix =scanner.nextDouble();
                    System.out.println("quatiter");
                    long quan=scanner.nextLong();
                    stock.ajouterArticle(nom, prix, quan);
                    break;
                }
                case 1:{
                    System.out.println("quatiter");
                    long quan=scanner.nextLong();
                    System.out.println("la reference");
                    String ref=scanner.nextLine();
                    stock.incrementerQuantiteArticle(ref, quan);
                    break;
                }
                case 2:{
                    System.out.println("le nom article");
                    String nom=scanner.nextLine();
                    System.out.println("prix");
                    double prix =scanner.nextDouble();
                    System.out.println("quatiter");
                    long quan=scanner.nextLong();
                    
                    System.out.println("la reference");
                    String ref=scanner.nextLine();
                    stock.modifierArticle(ref, nom, prix, quan);
                    break;
                }
                case 3:{
                    System.out.println("la reference");
                    String ref=scanner.nextLine();
                    stock.suprimerArticle(ref);

                    break;
                }
                case 4:{
                    stock.toString();
                    break;
                }
                case 5:{
                    System.out.println("Quitter");
                    
                    break;
                }

                }
                break;
            }
        }
        
    }
    
}
