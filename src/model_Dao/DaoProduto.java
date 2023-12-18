package model_Dao;

import connection.Connection_BD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model_Beans.BeansProduto;

public class DaoProduto {

    Connection_BD conexao = new Connection_BD();
    BeansProduto beanProduto = new BeansProduto();
    
    public void Salvar(BeansProduto beanProduto) {
        conexao.Conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("insert into produto(descricao,qnt,preco) values (?,?,?)");
            pst.setString(1, beanProduto.getDescricao());
            pst.setInt(2, beanProduto.getQnt());
            pst.setDouble(3, beanProduto.getPreco());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Suscesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\nErro:" + ex);
        }
        conexao.Desconecta();
    }
    
    public void Atualizar(BeansProduto beanProduto) {
        conexao.Conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("update produto set descricao=?,qnt=?,preco=? where id=?");
            pst.setString(1, beanProduto.getDescricao());
            pst.setInt(2, beanProduto.getQnt());
            pst.setDouble(3, beanProduto.getPreco());
            pst.setInt(4, beanProduto.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Atualizados com Sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados!\nErro:" + ex);
        }
        conexao.Desconecta();
    }
    
    public void Excluir(BeansProduto beanProduto) {
        conexao.Conexao();
        try {
            PreparedStatement pst = conexao.con.prepareStatement("delete from produto where id=?");
            pst.setInt(1, beanProduto.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com Sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!\nErro:" + ex);
        }
        conexao.Desconecta();
    }
}
