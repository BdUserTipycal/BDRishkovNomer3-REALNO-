package org.example;

import java.sql.SQLException;
import java.util.List;

public interface IRepository<T> {
    void addObj(T object) throws SQLException;
    void delete(long id) throws SQLException;
    void update(T object) throws SQLException;
    T find(long id) throws SQLException;
    List<T> getAll() throws SQLException;
}
