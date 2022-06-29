package parcial3.Proxy;
public class Client {

    public static void main(String[] args) {


        Usuario usuario1 = new Usuario("Juan", 13, "juan", "123");
        Usuario usuario2 = new Usuario("Pedro", 9, "pedro", "123");
        Usuario usuario3 = new Usuario("Maria", 7, "maria", "123");
        Usuario usuario4 = new Usuario("Nico", 52, "nico", "123");
        Usuario usuario5 = new Usuario("Mica", 52, "mica", "123");

        Server1 s1=new Server1();
        Server2 s2=new Server2();

        Proxy proxy=new Proxy(s1,s2);

        s1.showUsuarios();
        s2.showUsuarios();
        System.out.println("----------------------------------------------------");

        proxy.logearUsuarios(usuario1, "juan", "123");
        proxy.logearUsuarios(usuario2, "pedro", "123");
        proxy.logearUsuarios(usuario3, "maria", "123");
        proxy.logearUsuarios(usuario4, "nico", "123");
        proxy.logearUsuarios(usuario5, "mica", "1234");

        s1.showUsuarios();
        s2.showUsuarios();
        proxy.showTotalUsuariosNoLogeados();
        proxy.showTotalUsuarios();

    }
}
