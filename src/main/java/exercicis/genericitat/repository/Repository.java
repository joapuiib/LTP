package exercicis.genericitat.repository;

public interface Repository<T extends Entity> {
    void insert(T el);
    T select(int id);
    T update(T el);
    T delete(int id);
}
