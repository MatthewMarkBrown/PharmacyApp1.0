package ac.ca.cput.Repository;

public interface IRepository<T,ID> {
T create (T t);
T update (T t);
void delete (ID id);
T read(T id);
}
