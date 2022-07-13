package controladores;

import ferramentas.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.Usuario;

/**
 *
 * @author jonasdhein
 */
public class UsuarioController {
    
    public boolean login(String login, String senha){
        try{
            Conexao.abreConexao(); //abre uma conexao de acesso com o banco de dados
            PreparedStatement stmt;
            ResultSet rs;
            
            //Preenche o comando a ser rodado no banco de dados
            String wSql = " SELECT id FROM usuarios WHERE login = ? AND senha = md5(?) ";
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            return rs.next();
            
        }catch(SQLException ex){
            System.out.println("ERRO: " + ex.getMessage());
            return false;
        }
    }
    
    //incluir
    public boolean incluir(Usuario objeto){
        try{
            Conexao.abreConexao(); //abre uma conexao de acesso com o banco de dados
            PreparedStatement stmt;
            
            //Preenche o comando a ser rodado no banco de dados
            String wSql = " INSERT INTO usuarios VALUES(?, ?, md5(?), ?) ";
            stmt = Conexao.con.prepareStatement(wSql);
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getSenha());
            stmt.setString(4, objeto.getLogin());
            
            stmt.executeUpdate();
            
            return true;
            
        }catch(SQLException ex){
            System.out.println("ERRO: " + ex.getMessage());
            return false;
        }
    }
    
    //alterar
    //buscar
    //listar
    //excluir
    
}
