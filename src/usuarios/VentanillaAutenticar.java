package usuarios;

import usuarios.Autenticable;

class VentanillaAutenticar {
    public void autenticar(Autenticable autenticable){
        System.out.println(autenticable.autenticacion());
    }
}
