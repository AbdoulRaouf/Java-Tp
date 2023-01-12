import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;
public class TechStore {
    public static void affichageCroissant(ArrayList<Integer> ID,ArrayList <String> REF,ArrayList<String> NOM ,ArrayList <Double>Prix){

        int taille=Prix.size();
        double tmp =0;
        for(int i=0 ; i <taille ;i++){
            for(int j=1 ;j< (taille-i) ; j++){
                if (Prix.get(j-1)>Prix.get(j)){
                tmp=Prix.get(j-1);
                Prix.set(j-1,Prix.get(j));
                Prix.set(j,tmp);

                    String chaux = NOM.get(j-1);
                    NOM.set(j-1,NOM.get(j));
                    NOM.set(j,chaux);

                    String refaux = REF.get(j-1);
                    REF.set(j-1,REF.get(j));
                    REF.set(j,refaux);

                    int idaux = ID.get(j-1);
                    ID.set(j-1,ID.get(j));
                    ID.set(j,idaux);


                }
            }

        }



    }
    public static void affichageDecroissant(ArrayList<Integer> ID,ArrayList <String> REF,ArrayList<String> NOM ,ArrayList <Double>Prix){
        int taille=Prix.size();
        affichageCroissant(ID,REF,NOM,Prix);
        for(int c=0 ; c<taille/2;c++){
            double tmp=Prix.get(c);
            Prix.set(c,Prix.get(taille-c-1));
            Prix.set(taille-c-1,tmp);

            String chaux = NOM.get(c);
            NOM.set(c,NOM.get(taille-c-1));
            NOM.set(taille-c-1,chaux);

            String refaux = REF.get(c);
            REF.set(c,REF.get(taille-c-1));
            REF.set(taille-c-1,refaux);

            int idaux = ID.get(c);
            ID.set(c,ID.get(taille-c-1));
            ID.set(taille-c-1,idaux);


        }

    }
    public static String generateReference(String name,int id){
        String ref="";
        char ch =' ';
        for(int comp=0;((comp<name.length())&&(Character.compare(name.charAt(comp),ch)==0)) ; comp++){
            if(comp%5==0){
                ref+=name.charAt(comp);
            }
        }
        ref+=id;
        return ref;
    }
    public static void ajouterArticle(String name,Double price,ArrayList <String> REF,ArrayList <Double>Prix,ArrayList<String> NOM ,ArrayList<Integer> ID){
        int id=ID.size();
        NOM.add(name);
        Prix.add(price);
        ID.add(id);
        String newref = generateReference(name,id);
        REF.add(newref);
    }
    public static void supprimerArticle (String ref,ArrayList<Integer> ID,ArrayList <String> REF,ArrayList<String> NOM ,ArrayList <Double>Prix){
        int indexx = REF.indexOf(ref);
        if(indexx<=ID.size()) {
            ID.remove(indexx);
            REF.remove(indexx);
            NOM.remove(indexx);
            Prix.remove(indexx);
        }else System.out.println("cet article ne se trouve pas !");
    }
    public static void affichage(ArrayList<Integer> ID,ArrayList <String> REF,ArrayList<String> NOM ,ArrayList <Double>Prix){
        for(int t=0;t<=ID.size()-1;t++){
            System.out.print("ID="+ ID.get(t)+"\t");
            System.out.print("ref="+ REF.get(t)+"\t");
            System.out.print("Nom="+ NOM.get(t)+"\t");
            System.out.println("prix="+ Prix.get(t));
        }
    }
    public static void modifierArticle(ArrayList <String> REF,String ref,ArrayList <Double>Prix,Double prix){

        int compteur = REF.indexOf(ref);
        Prix.set(compteur,prix);

    }
    public static void main(String[] args) {
        ArrayList<Integer> ID = new ArrayList<Integer>();
        for (int j = 0; j < 5; j++) {
            ID.add(j);
        }
        ArrayList<String> REF = new ArrayList<String>();
        REF.add("Prelt50");
        REF.add("ÉeB21");
        REF.add("SpNo2");
        REF.add("Mu8a3");
        REF.add("SpA4");
        ArrayList<String> NOM = new ArrayList<String>();
        NOM.add("PC DELL");
        NOM.add("JBL");
        NOM.add("infinix");
        NOM.add("casque");
        NOM.add("Nokia");
        ArrayList<Double> Prix = new ArrayList<Double>();
        Prix.add(12.7);
        Prix.add(12.6);
        Prix.add(12.0);
        Prix.add(12.1);
        Prix.add(12.3);

        System.out.println("Soyer les bienvenus !!");
        System.out.println("0: Gerant");
        System.out.println("1: Client");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if (i == 0) {
            System.out.println( "0:ajouter un article\n" +
                    "1: Augmenter la quatité d'un article\n"+
                    "2:Modifier un article\n" + 
                    "3:supprimer un article" + 
                    "4:consulter les articles\n"+
                    "5: Quitter\n");
            int strr = scanner.nextInt();

            switch (strr) {
                case 0:{
                    System.out.println("Nom du produit à ajouter:");
                    String name = scanner.next();
                    System.out.println("Prix:");
                    Double prix = scanner.nextDouble();
                    ajouterArticle(name, prix, REF, Prix, NOM, ID);
                break;}
                case 1:{
                    
                }

                case 2: {
                    System.out.println("Reference du produit à modifier:");
                    String ref = scanner.next();
                    //scanner.next();
                    System.out.println("Prix");
                    Double prixx = scanner.nextDouble();
                    modifierArticle(REF, ref, Prix, prixx);


                    break;
                }
                case 4: {
                    System.out.println("0 : ordre croissant des prix:\n" + "1 :ordre decroissant des prix");
                    int o = scanner.nextInt();
                    if (o == 0) {
                        affichageCroissant(ID, REF, NOM, Prix);
                    } else if (o == 1) {
                        affichageDecroissant(ID, REF, NOM, Prix);
                    } else
                        System.out.println("operation non valide!!");
                    break;
                }
                case 3: {
                    System.out.println("Reference du produit à supprimer:");
                    String reff = scanner.next();
                    supprimerArticle(reff, ID, REF, NOM, Prix);
                    break;
                }
                case 5:{
                System.out.println("reference");
                    break;
                }
                default:
                    System.out.printf("veuillez bien choisir !");
            }
            affichage(ID,REF,NOM,Prix);
        } else if (i == 1) {
            System.out.println("Bonjour cher/chere Client");
        } else
            System.out.println("Cette action n'est pas autorisé");


    }

}