import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationClient{
    public static void main(String[] args) throws IOException {
        MetierClientImpl metierClient =new MetierClientImpl("clients.dat");
        List<Client> clients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choix = 0 ;
        while(choix!=6){
            System.out.print("1. Afficher la liste des clients. \n2. Rechercher un client par son nom. \n3. Ajouter un nouveau client dans la liste. \n4. Supprimer un client par nom. \n5. Sauvegarder les clients. \n6. Quitter ce programme.\nEntrer un choix : ");
            choix=scanner.nextInt();
            switch (choix){
                case 1:
                    clients=null;
                    clients = metierClient.getAll();
                    clients.stream().map(Client::toString).toList().forEach(client -> System.out.println(client));
                    break;
                case 2:
                    System.out.print("Entrer le nom du client : ");
                    System.out.println(metierClient.findByNom(scanner.next()).toString());
                    break;
                case 3:
                    System.out.print("Entrer le nom du client : ");
                    String Nom = scanner.next();
                    System.out.print("Entrer le prenom du client : ");
                    String Prenom = scanner.next();
                    System.out.print("Entrer l\'email du client : ");
                    String Email = scanner.next();
                    System.out.print("Entrer le telephone du client : ");
                    String Tel = scanner.next();
                    System.out.print("Entrer l\'adresse du client : ");
                    String Adresse = scanner.next();
                    metierClient.Add(new Client(Nom,Prenom,Email,Tel,Adresse));
                    break;
                case 4:
                    System.out.print("Entrer le nom du client : ");
                    metierClient.delete(scanner.next());
                    break;
                case 5:
                    metierClient.saveAll();
                    break;
                default:
                    System.out.println("Choix invalide");
                    break;
            }
        }
    }
}

