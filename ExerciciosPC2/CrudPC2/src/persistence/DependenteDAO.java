/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.util.List;
import negocio.Dependente;

/**
 *
 * @author RAFAEL
 */
public interface DependenteDAO {
    public String inserir(Dependente dep);
    public String alterar(Dependente dep);
    public String excluir(Dependente dep);
    public List<Dependente> listarTodos();
}
