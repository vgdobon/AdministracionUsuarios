package usuarios;

import java.util.Base64;

public class Administrador extends Usuarios implements Autenticable{

    public String goldenKey;


    public Administrador(String nombre, String apellido, String telefono, String email,String goldenKey) {
        super(nombre, apellido, telefono, email,"Administrador");
        this.goldenKey = goldenKey;
    }

    @Override
    public String autenticacion() {
        return Base64.getEncoder().encodeToString(("Bearer " + this.goldenKey).getBytes());
    }
}
