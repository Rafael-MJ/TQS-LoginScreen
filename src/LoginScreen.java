import java.util.HashMap;
import java.util.Map;

/**
 * @author Rafael Jakubovsky
 * @version 0.1
 * @since Release 0.1
 *
 * Classe simples que contém funcionalidades de login.
 */
public class LoginScreen {
    private Map<String, String> userDatabase; // Simulação de Banco de Dados (usuário, senha)

    /**
     * Inicializa uma "LoginScreen", definindo uma base de dados que armazena os usuários.
     * Cria dois usuários iniciais que podem ser utilizados nos testes.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("Rafael", "password123");
        userDatabase.put("Maria", "abc123");
    }

    /**
     * Método utilizado para validar as informações fornecidas pelo usuário no login.
     *
     * @param user O nome de usuário fornecido.
     * @param pass A senha fornecida.
     * @return {@code true} se o usuário for válido, {@code false} se o usuário for inválido.
     */
    public boolean login(String user, String pass) {

        if (userDatabase.containsKey(user)) {
            String storedPass = userDatabase.get(user);
            if (storedPass.equals(pass)) {
                return true; // Usuário autenticado
            }
        }
        return false; // Falha na autenticação
    }

    /**
     * Método para a adição de um novo usuário na base de dados.
     * Não recomendado o uso em produção por motivos de segurança.
     *
     * @param user O nome de usuário fornecido.
     * @param pass A senha fornecida.
     */
    public void addUser(String user, String pass) {
        userDatabase.put(user,pass);
    }
}
