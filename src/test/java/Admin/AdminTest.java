import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    public void deveAutorizarUsuario() {
        Admin.getInstance().autorizarUsuario("Fulano");
        assertTrue(Admin.getInstance().isAutorizado("Fulano"));
    }

    @Test
    public void naoDeveAutorizarUsuarioSemCadastro() {
	assertFalse(Admin.getInstance().isAutorizado("Usuario Nao existe");
    }

}
