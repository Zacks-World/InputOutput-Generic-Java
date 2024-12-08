import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit>{
    private List <Produit> Produits;
    String ProduitsFileName;

    public MetierProduitImpl(String produitsFileName) {
        Produits = new ArrayList<>();
        ProduitsFileName = produitsFileName;
    }

    @Override
    public Produit Add(Produit Objet) {
        Produits.add(Objet);
        return Objet;
    }

    @Override
    public List<Produit> getAll() throws IOException {
        File file = new File("C:\\Users\\Zakaria\\Desktop\\"+ProduitsFileName);
        if (file.exists() & file.length()!=0)
        {
            BufferedReader Bf = new BufferedReader(new FileReader(file));
            String line;
            while ((line = Bf.readLine()) != null) {
                if (!line.isEmpty())
                {String[] Param=line.split(",");
                Produits.add(new Produit(Param[0],Param[1],Param[2],Float.parseFloat(Param[3]),Integer.parseInt(Param[4])));}
            }
            Bf.close();
            return Produits;
        }
        return null;

    }

    @Override
    public Produit findByNom(String nom) {
        return Produits.stream()
                .filter(produit -> produit.getNom().equals(nom))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(String nom) {
        Produits.removeIf(produit -> produit.getNom().equals(nom));

    }

    @Override
    public void saveAll() throws IOException {
        File file = new File("C:\\Users\\Zakaria\\Desktop\\"+ProduitsFileName);
        if (file.exists()){
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            for (Produit produit:Produits)
                bf.write(produit.getNom()+","+produit.getMarque()+","+produit.getDescription()+","+produit.getPrix()+","+produit.getNbStock()+System.lineSeparator());
            bf.close();

        }

    }
}
