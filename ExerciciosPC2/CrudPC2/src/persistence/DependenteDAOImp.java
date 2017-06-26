package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import negocio.Dependente;

/**
 *
 * @author RAFAEL
 */
public class DependenteDAOImp implements DependenteDAO {

    @Override
    public String inserir(Dependente dep) {
        String sql = "insert into "
                + "dependente(cpfEmpregado,nome,grauParentesco,dataNascimento) "
                + "values(?,?,?,?)";
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, dep.getCpfEmpregado());
            pst.setString(2, dep.getNome());
            pst.setString(3, dep.getGrauParentesco());
            pst.setDate(4, new Date(dep.getDataNascimento().getTime()));
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Falha ao inserir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public String alterar(Dependente dep) {
        String sql = "update dependente "
                + "set grauParentesco=?,"
                + "dataNascimento=?"
                + "where nome=? and cpfEmpregado=?";
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, dep.getGrauParentesco());
            pst.setDate(2, new Date(dep.getDataNascimento().getTime()));
            pst.setString(3, dep.getNome());
            pst.setString(4, dep.getCpfEmpregado());
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public List<Dependente> listarTodos() {
        String sql = "select * from dependente order by nome";
        Connection con = ConnectionFactory.getConnection();
        List<Dependente> lista = new ArrayList<>();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Dependente dep = new Dependente();
                    dep.setCpfEmpregado(rs.getString("cpfempregado"));
                    dep.setNome(rs.getString("nome"));
                    dep.setGrauParentesco(rs.getString("grauparentesco"));
                    dep.setDataNascimento(rs.getDate("datanascimento"));
                    lista.add(dep);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public String excluir(Dependente dep) {
        String sql = "delete from dependente "
                + "where cpfEmpregado=? and nome=?";
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, dep.getCpfEmpregado());
            pst.setString(2, dep.getNome());
            int res = pst.executeUpdate();
            if(res>0){
                return "Excluido com sucesso.";
            }else{
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
                return e.getMessage();
        } finally{
            ConnectionFactory.close(con);
        }
    }
}
