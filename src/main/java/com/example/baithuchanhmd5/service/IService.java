package com.example.baithuchanhmd5.service;

public interface IService<T> {
    Iterable<T> findAll();

    T findById(Long id);

    T save(T t);

    void deleteById(Long id);
}
