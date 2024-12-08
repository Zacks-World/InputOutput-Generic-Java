import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ApplicationProduit {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        MetierProduitImpl metierProduit =new MetierProduitImpl("produits.dat");
        List<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choix = 0 ;
        while(choix!=6){
            System.out.print("1. Afficher la liste des produits. \n2. Rechercher un produit par son nom. \n3. Ajouter un nouveau produit dans la liste. \n4. Supprimer un produit par nom. \n5. Sauvegarder les produits. \n6. Quitter ce programme.\nEntrer un choix : ");
            choix=scanner.nextInt();
            switch (choix){
                case 1:
                    produits=null;
                    produits = metierProduit.getAll();
                    produits.stream().map(Produit::toString).toList().forEach(produit -> System.out.println(produit));
                    break;
                case 2:
                    System.out.print("Entrer le nom du produit : ");
                    System.out.println(metierProduit.findByNom(scanner.next()).toString());
                    break;
                case 3:
                    System.out.print("Entrer le nom du produit : ");
                    String Nom = scanner.next();
                    System.out.print("Entrer la marque du produit : ");
                    String Marque = scanner.next();
                    System.out.print("Entrer la description du produit : ");
                    String Description = scanner.next();
                    System.out.print("Entrer le prix du produit : ");
                    float prix = scanner.nextFloat();
                    System.out.print("Entrer le nombre en stock du produit : ");
                    int nbstock = scanner.nextInt();
                    metierProduit.Add(new Produit(Nom,Marque,Description,prix,nbstock));
                    break;
                case 4:
                    System.out.print("Entrer le nom du produit : ");
                    metierProduit.delete(scanner.next());
                    break;
                case 5:
                    metierProduit.saveAll();
                    break;
                default:
                    System.out.println("Choix invalide");
            }
        }
    }
}