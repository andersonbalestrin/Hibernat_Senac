/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.senac.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author SONY
 */
public interface BaseDao<T, ID> {
//public abstrat já tem por defull, não precisa colocar na assinatura, isso se chama clean cod.
    void salvarOuAlterar(T entidade, Session sessao) throws HibernateException; // metodo abstrato é um método sem corpo. apenas aparece o metodo.
// se tivesse corpo, alem da assinatura não acabar com ; ele teria que ter {}.
    void Excluir(T entidade, Session sessao) throws HibernateException;

    T pesquisarPorId(ID id,Session sessao) throws HibernateException;
}
