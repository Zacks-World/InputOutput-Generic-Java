import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierClientImpl implements IMetier<Client>{
    private List<Client> Clients;
    private String ClientsFileName;

    public MetierClientImpl(String clientsFileName) {
        Clients = new ArrayList<>();
        ClientsFileName = clientsFileName;
    }

    @Override
    public Client Add(Client Objet) {
        Clients.add(Objet);
        return Objet;
    }

    @Override
    public List<Client> getAll() throws IOException {
        File file = new File("C:\\Users\\Zakaria\\Desktop\\"+ClientsFileName);
        if (file.exists() & file.length()!=0)
        {
            BufferedReader Bf = new BufferedReader(new FileReader(file));
            StringBuilder Content = new StringBuilder();
            String line;
            while ((line = Bf.readLine()) != null) {
                if(!line.isEmpty())
                {String[] Param=line.split(",");
                Clients.add(new Client(Param[0],Param[1],Param[2],Param[3],Param[4]));}
            }
            Bf.close();
            return Clients;
        }
        return null;
    }

    @Override
    public Client findByNom(String nom) {
        return Clients.stream()
                .filter(client -> client.getNom().equals(nom)) // Match the name
                .findFirst() // Return the first match (if any)
                .orElse(null); // Return null if no match is found
    }

    @Override
    public void delete(String nom) {
        Clients.removeIf(client -> client.getNom().equals(nom));

    }

    @Override
    public void saveAll() throws IOException {
        File file = new File("C:\\Users\\Zakaria\\Desktop\\"+ClientsFileName);
        if (file.exists()){
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            for (Client client:Clients)
                bf.write(client.getNom()+","+client.getPrenom()+","+client.getEmail()+","+client.getTel()+","+client.getAdresse()+System.lineSeparator());
            bf.close();

        }

    }
}
