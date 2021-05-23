package GameProject.DataAccess.Abstracts;

public interface BaseCrudService<T> {



    void add(T entity) throws Exception;

    void update(T entity);

    void delete(T entity);
}
