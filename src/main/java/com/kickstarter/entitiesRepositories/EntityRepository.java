package com.kickstarter.entitiesRepositories;

import org.hibernate.*;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
public class EntityRepository<TEntity> extends RepositoryBase<TEntity>{

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public EntityRepository(){
        super("");
    }

    public EntityRepository(String typeParameter){
        super(typeParameter);
    }

    @SuppressWarnings("unchecked")
    public TEntity getById(Integer id) {
        return (TEntity) sessionFactory
                .getCurrentSession()
                .get(typeParameterClass, id);
    }

    @SuppressWarnings("unchecked")
    public List<TEntity> getAll() {
        return (List<TEntity>)sessionFactory
                .getCurrentSession()
                .createCriteria(typeParameterClass)
                .list();
    }

    public void add(TEntity entity) {
        sessionFactory
                .getCurrentSession()
                .save(entity);
    }

    public void update(TEntity entity) {
        sessionFactory
                .getCurrentSession()
                .update(entity);
    }

    public void delete(TEntity entity) {
        sessionFactory
                .getCurrentSession()
                .delete(entity);
    }
}
