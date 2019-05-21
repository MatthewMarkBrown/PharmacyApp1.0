package ac.ca.cput.Repository;

public interface IRepository<T,TD> {
T create (T t);
T update (T t);
void delete (String t);
T read(String id);
}
