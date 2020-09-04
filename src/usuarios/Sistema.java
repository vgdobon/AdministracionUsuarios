package usuarios;

import java.util.Base64;

public class Sistema extends Usuarios implements Autenticable {

    public String goldenKey;


    public Sistema(String nombre, String apellido, String telefono, String email,String goldenKey) {
        super(nombre, apellido, telefono, email,"Sistema");
        this.goldenKey = goldenKey;
    }


    @Override
    public String autenticacion() {
        return Base64.getEncoder().encodeToString(("Bearer " + this.goldenKey).getBytes());
    }
}
