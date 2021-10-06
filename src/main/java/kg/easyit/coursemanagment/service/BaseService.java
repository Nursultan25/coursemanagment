package kg.easyit.coursemanagment.service;

public interface BaseService<T> {
     void save(T type);
     T getOneByID(long id);
     void delete(T type);
}
