package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Connection_BD {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver = "com.mysql.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/MercadinhoGosling";
    private final String usuario = "root";
    private final String senha = ""; //
    public Connection con;

    public void Conexao() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n" + ex.getMessage());
        }
    }

    public void executaSql(String sql) {
        try {
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ExecutaSql:\n" + ex.getMessage());
        }
    }

    public void Desconecta() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com BD:/n" + ex.getMessage());
        }
    }
}
