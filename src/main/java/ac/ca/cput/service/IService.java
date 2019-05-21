package ac.ca.cput.service;

public interface IService <T,TD>{
    T create(T type);

    T update(T type);

    void delete(String id);

    T read(String id);
}
