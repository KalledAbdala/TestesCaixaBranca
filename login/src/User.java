package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe responsável por realizar a conexão com o banco de dados
 * e verificar a existência de um usuário.
 */
public class User {

    /**
     * Método para conectar ao banco de dados.
     *
     * @return Um objeto Connection caso a conexão seja bem-sucedida, ou null em caso de falha.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver de conexão do MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // URL do banco de dados com credenciais
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Exceções ignoradas neste ponto
            e.printStackTrace(); // Imprime o erro para depuração
        }
        return conn;
    }

    /** Nome do usuário, caso encontrado. */
    public String nome = "";

    /** Indica se o usuário foi encontrado. */
    public boolean result = false;

    /**
     * Verifica se um usuário existe no banco de dados com base no login e senha.
     *
     * @param login O login do usuário.
     * @param senha A senha do usuário.
     * @return true se o usuário for encontrado, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Comando SQL
        Connection conn = conectarBD(); // Obtém a conexão com o banco

        // Monta a consulta SQL
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "' ";
        sql += "and senha = '" + senha + "';";
        try {
            // Executa a consulta no banco de dados
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Imprime o erro para depuração
        }
        return result; // Retorna o resultado
    }
}
