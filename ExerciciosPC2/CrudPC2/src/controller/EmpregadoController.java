/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import negocio.Empregado;
import persistence.EmpregadoDAOImp;

/**
 *
 * @author RAFAEL
 */
public class EmpregadoController {

    public String inserir(Empregado emp) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.inserir(emp);
    }

    public String alterar(Empregado emp) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.alterar(emp);
    }

    public String excluir(Empregado emp) {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.excluir(emp);
    }

    public List<Empregado> listarTodos() {
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.listarTodos();
    }
    public Empregado pesquisarPorCpf(String cpf){
        EmpregadoDAOImp dao = new EmpregadoDAOImp();
        return dao.pesquisarPorCpf(cpf);
    }
}
