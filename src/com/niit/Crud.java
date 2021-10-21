package com.niit;

public interface Crud <T>{
    public void add(T obj);

    public void delete(int id);

    public void update(T obj);

    public void list();
}
