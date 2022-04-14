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
public abstract class BaseDaoImpl<T, ID> implements BaseDao<T, ID> { // se a clase tem abstract ela da certeza que é uma classe pai

    private Transaction transacao;

    @Override
    public void salvarOuAlterar(T entidade, Session sessao) throws HibernateException {
        transacao = sessao.beginTransaction();
        sessao.saveOrUpdate(entidade);
        transacao.commit();
    }

    @Override
    public void Excluir(T entidade, Session sessao) throws HibernateException {
        transacao = sessao.beginTransaction();
        sessao.delete(entidade);
        transacao.commit();
    }

}
