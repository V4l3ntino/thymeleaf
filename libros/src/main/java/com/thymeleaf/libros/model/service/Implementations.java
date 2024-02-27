package com.thymeleaf.libros.model.service;

import java.util.List;

public interface Implementations <T>{
    public void createMethod(T obj);
    public void deleteMethod(Integer id);
    public T getMethod(Integer id);
    public List<T> getAllMethod();
}
