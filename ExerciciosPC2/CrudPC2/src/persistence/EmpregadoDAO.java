/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;
import java.util.List;
import negocio.Empregado;

/**
 *
 * @author RAFAEL
 */
public interface EmpregadoDAO {

    public String inserir(Empregado emp);

    public String alterar(Empregado emp);

    public String excluir(Empregado emp);

    public List<Empregado> listarTodos();

    public Empregado pesquisarPorCpf(String cpf);
}
