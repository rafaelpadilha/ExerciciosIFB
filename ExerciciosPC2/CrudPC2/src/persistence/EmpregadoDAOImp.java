package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Empregado;

public class EmpregadoDAOImp implements EmpregadoDAO {

    @Override
    public String inserir(Empregado emp) {
        String sql = "insert into "
                + "empregado(cpf,nome,idade,salario) "
                + "values(?,?,?,?)";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emp.getCpf());
            pst.setString(2, emp.getNome());
            pst.setInt(3, emp.getIdade());
            pst.setDouble(4, emp.getSalario());
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public String alterar(Empregado emp) {
        String sql = "update empregado "
                + "set nome=?,idade=?,salario=? "
                + "where cpf = ?";
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNome());
            pst.setInt(2, emp.getIdade());
            pst.setDouble(3, emp.getSalario());
            pst.setString(4, emp.getCpf());
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }
    }

    @Override
    public String excluir(Empregado emp) {
        String sql = "delete from empregado where cpf = ?";
        Connection con = ConnectionFactory.getConnection();

        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, emp.getCpf());
            int res = pst.executeUpdate();
            if (res > 0) {
                return "Excluido com sucesso.";
            } else {
                return "Falha ao tentar excluir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        } finally {
            ConnectionFactory.close(con);
        }

    }

    @Override
    public List<Empregado> listarTodos() {
        String sql = "select * from empregado";
        Connection con = ConnectionFactory.getConnection();
        List<Empregado> lista = new ArrayList<>();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs != null){
                while(rs.next()){
                    Empregado ep = new Empregado();
                    ep.setCpf(rs.getString("cpf"));
                    ep.setNome(rs.getString("nome"));
                    ep.setIdade(rs.getInt("idade"));
                    ep.setSalario(rs.getDouble("salario"));
                    lista.add(ep);
                }
                return lista;
            }else{
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
    public Empregado pesquisarPorCpf(String cpf) {
        String sql = "select * from empregado where cpf = ?";
        Connection con = ConnectionFactory.getConnection();
        
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                Empregado ep = new Empregado();
                ep.setCpf(rs.getString("cpf"));
                ep.setNome(rs.getString("nome"));
                ep.setIdade(rs.getInt("idade"));
                ep.setSalario(rs.getDouble("salario"));
                return ep;
            }else {
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        } finally {
            ConnectionFactory.close(con);
        }
    }
}
