package parcial3.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Server1 implements IServer {

    private List<Usuario> usuariosLogeados1=new ArrayList<>();

    @Override
    public void logearUsuarios(Usuario usuario, String userName, String password) {
        usuariosLogeados1.add(usuario);
        System.out.println("                                     ");
        System.out.println("Usuario Logeado: "+usuario.getNombre());
    }

    public void showUsuarios(){
        System.out.println("----------Usuarios Logeados en el Server1---------");
        if(usuariosLogeados1.isEmpty()){
            System.out.println("No hay usuarios Logeados");
        }
        for (Usuario usuario:usuariosLogeados1) {
            usuario.showInfo();
            System.out.println("");

        }
    }
}

