package br.com.caelum.empresa.modelo;

import java.util.List;


import org.hibernate.jpa.internal.EntityManagerImpl;
import org.hsqldb.jdbc.JDBCUtil;






public class GastoDAO {
	
	private final EntityManagerImpl entityManager =  new JDBCUtil().getEntityManager();
    private Class<Gasto> classe = Gasto.class;

    public void adiciona(Gasto entity) {
        entityManager.persist(entity);
    }

    public Gasto atualiza(Gasto entity) {
        return entityManager.merge(entity);
    }

    public void remove(Gasto entity) {
        entityManager.remove(entity);
    }

    public Gasto buscaPorId(Long id) {
        return entityManager.find(classe, id);
    }

    public List<Gasto> buscaTodos() {
        Query query = entityManager
                .createQuery("from " + classe.getName());
        return query.getResultList();
    }

}
