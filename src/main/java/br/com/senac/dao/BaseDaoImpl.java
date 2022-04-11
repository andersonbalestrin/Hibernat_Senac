/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.dao;

import org.hibernate.*;

/**
 *
 * @author SONY
 * @param <T> representa qualquer calsse entidade
 * @param <ID> representa o tipo do id
 */
public abstract class BaseDaoImpl<T, ID> implements BaseDao<T, ID> {

    private Transaction transaction;

    @Override
    public void salvarOuAlterar(T entidade, Session sessao) throws HibernateException {
        transaction = sessao.beginTransaction();
        sessao.saveOrUpdate(entidade);
        transaction.commit();
    }

    @Override
    public void Excluir(T entidade, Session sessao) throws HibernateException {
        transaction = sessao.beginTransaction();
        sessao.delete(entidade);
        transaction.commit();
    }

}
