package com.kickstarter.entitiesRepositories;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;
import sun.net.TelnetInputStream;

import javax.annotation.Resource;
import javax.persistence.Entity;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@Transactional
public abstract class RepositoryBase<TEntity> {

    final Class<TEntity> typeParameterClass;

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;


    public RepositoryBase(Class<TEntity> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    @SuppressWarnings("unchecked")
    public TEntity getById(Integer id) {
        return (TEntity) sessionFactory
                .openSession()
                .get(typeParameterClass, id);
    }

    @SuppressWarnings("unchecked")
    public List<TEntity> getAll() {
        return (List<TEntity>)sessionFactory
                .openSession()
                .createCriteria(typeParameterClass)
                .list();
    }

    public void add(TEntity entity) {
        sessionFactory
                .openSession()
                .save(entity);
    }

    public void update(TEntity entity) {
        sessionFactory
                .openSession()
                .update(entity);
    }

    public void delete(TEntity entity) {
        sessionFactory
                .openSession()
                .delete(entity);
    }
}
