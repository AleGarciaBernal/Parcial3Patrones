package parcial3.Proxy;

public class Usuario {

    private String nombre;
    private int id;
    private String userName;
    private String password;

    public Usuario(String nombre, int id, String userName, String password) {
        this.nombre = nombre;
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+ id);
        System.out.println("UserName: "+userName);
        System.out.println("Password: "+password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
