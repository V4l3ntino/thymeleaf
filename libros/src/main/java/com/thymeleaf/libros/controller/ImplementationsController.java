package com.thymeleaf.libros.controller;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ImplementationsController <T>{
    public T getById(@PathVariable String id);
    public String getAll();
    public String createMethod(T obj);
    public String updateMethod(T obj);
    public String deleteMethod(T obj);
}
