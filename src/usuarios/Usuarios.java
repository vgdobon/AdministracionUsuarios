package usuarios;

public class Usuarios {



    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String tipoDeUsuario;


    public Usuarios(String nombre, String apellido, String telefono, String email,String tipoDeUsuario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String welcomeMessage(){
        return "Bienvenido " + this.nombre +" "+ this.apellido + " eres " + this.tipoDeUsuario;
    }

    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }



}
