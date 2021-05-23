package DataAccess.Abstracts;

import Entities.Concretes.Gamer;

public interface BaseCrudService<T> {



    void add(T entity) throws Exception;

    void update(T entity);

    void delete(T entity);
}
