//        1- Todos los usuarios tienen nombre, apellido, telefono y email.
//        2- Hay usuarios base, administradores, sistema y externos.
//        3- Los usuarios administradores y de sistema tienen un atributo goldenKey y los externos tienen un atributo companyId.
//        4- Todos los usuarios tienen un método welcomeMessage que devuelve el siguiente mensaje "Bienvenido {nombre} {apellido}, eres {tipoDeUsuario}"
//        5- Los usuarios administradores y de sistema tienen un método autenticarSuperUsuario que devuelve la siguiente cadena en base64 "Bearer {goldenKey}"
//        6- Los usuarios externos tienen un método que devuelve el nombre de la compañía a la que pertenecen.
//        7- Se quiere implementar un componente que reciba usuarios y muestre por pantalla el mensaje de bienvenida.
//        7- Se quiere implementar un componente que reciba usuarios con privilegios y su autenticación de administradores (autenticarSuperusuario).
//        8- Se quiere implementar un componente que reciba usuarios externos y en función de la compañía


import usuarios.Administrador;
import usuarios.WelcomeComponent;

public class Main {

    public static void main(String[] args) {
        Administrador admin = new Administrador("Javier","García","600987654321","@gmail.com","1");
        System.out.println(admin.autenticacion());
        WelcomeComponent.showMesage(admin);
    }
}
