import java.io.IOException;
import java.util.List;

public interface  IMetier <T> {
    public T Add(T Objet);
    public List<T> getAll() throws IOException;
    public T findByNom(String nom);
    public void delete(String nom);
    public void saveAll() throws IOException;



}
