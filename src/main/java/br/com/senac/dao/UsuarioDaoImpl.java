/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.dao;

import br.com.senac.entidade.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author SONY
 */
public class UsuarioDaoImpl extends BaseDaoImpl<Usuario, Long> implements  UsuarioDao{

    @Override
    public Usuario pesquisarPorId(Long id, Session sessao) throws HibernateException {
        //Usuario usuario = sessao.get(Usuario.class, id);
        //return usuario;
        return sessao.get(Usuario.class, id);//assim fica mais curto. e funciona igual.
    }

}
