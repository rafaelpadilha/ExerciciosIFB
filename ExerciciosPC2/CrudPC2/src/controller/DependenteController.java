/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import negocio.Dependente;
import persistence.DependenteDAOImp;

/**
 *
 * @author RAFAEL
 */
public class DependenteController {

    public String inserir(Dependente emp) {
        DependenteDAOImp dao = new DependenteDAOImp();
        return dao.inserir(emp);
    }

    public String alterar(Dependente emp) {
        DependenteDAOImp dao = new DependenteDAOImp();
        return dao.alterar(emp);
    }

    public String excluir(Dependente emp) {
        DependenteDAOImp dao = new DependenteDAOImp();
        return dao.excluir(emp);
    }

    public List<Dependente> listarTodos() {
        DependenteDAOImp dao = new DependenteDAOImp();
        return dao.listarTodos();
    }
}
