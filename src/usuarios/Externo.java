package usuarios;

public class Externo extends Usuarios {



    public String companyId;
    private String companyName;

    public Externo(String nombre, String apellido, String telefono, String email,String companyId,String companyName) {
        super(nombre, apellido, telefono, email,"usuario externo");
        this.companyId = companyId ;
        this.companyName = companyName;
    }


    //GETTER Y SETTER

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
