package com.example.demo.repository.baseRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public abstract class BaseRepositoryImpl<T> implements CreateRepository<T>, UpdateRepository<T>, GetRepository<T>, DeleteRepository {
  @PersistenceContext
  private EntityManager entityManager;

  private final Class<T> domainClass;

  public BaseRepositoryImpl(Class<T> domainClass) {
    this.domainClass = domainClass;
  }

  @Transactional
  @Override
  public Optional<T> findById(int id) {
    return Optional.ofNullable(entityManager.find(domainClass, id));
  }

  @Transactional
  @Override
  public List<T> findAll() {
    return entityManager.createQuery(domainClass.getName(), domainClass).getResultList();
  }

  @Transactional
  @Override
  public T save(T value) {
    entityManager.persist(value);
    return value;
  }

  @Transactional
  @Override
  public void update(T value) {
    entityManager.merge(value);
  }

  @Transactional
  @Override
  public void delete(int id) {
    Optional<T> value = findById(id);
    if (!value.isPresent()) {
      // TODO: Написать кастомную ошибку
      throw new RuntimeException("Entity not found with id: " + id);
    }
    entityManager.remove(value);
  }

  protected EntityManager getEntityManager() {
    return entityManager;
  }

  protected Class<T> getDomainClass() {
    return domainClass;
  }
}
