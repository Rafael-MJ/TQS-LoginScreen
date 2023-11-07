import java.util.HashMap;
import java.util.Map;

/**
 * @author Rafael Jakubovsky
 * @version 0.1.1
 * @since Release 0.1
 *
 * Classe simples que contem funcionalidades de login.
 */
public class LoginScreen {
    private Map<String, String> userDatabase; // Simulacao de Banco de Dados (usuario, senha)

    /**
     * Inicializa uma "LoginScreen", definindo uma base de dados que armazena os usuarios.
     * Cria dois usuarios iniciais que podem ser utilizados nos testes.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("Rafael", "password123");
        userDatabase.put("Maria", "abc123");
    }

    /**
     * Utilizado para validar as informacoes fornecidas pelo usuario no login.
     *
     * @param user O nome de usuario fornecido.
     * @param pass A senha fornecida.
     * @return {@code true} se o usuario for valido, {@code false} se o usuario for invalido.
     */
    public boolean login(String user, String pass) {

        if (userDatabase.containsKey(user)) {
            String storedPass = userDatabase.get(user);
            if (storedPass.equals(pass)) {
                return true; // Autenticado com sucesso
            }
        }
        return false; // Falha ao autenticar
    }

    /**
     * Utilizado para adicionar um novo usuario na base de dados.
     * Nao recomendado o uso em producao por motivos de seguranca.
     *
     * @param user O nome de usuario fornecido.
     * @param pass A senha fornecida.
     */
    public void addUser(String user, String pass) {
        userDatabase.put(user,pass);
    }
}