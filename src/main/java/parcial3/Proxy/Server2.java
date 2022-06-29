package parcial3.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Server2 implements IServer {

    private List<Usuario> usuariosLogeados2=new ArrayList<>();

    @Override
    public void logearUsuarios(Usuario usuario, String userName, String password) {
        usuariosLogeados2.add(usuario);
        System.out.println("                                     ");
        System.out.println("Usuario Logeado: "+usuario.getNombre());
    }

    public void showUsuarios(){
        System.out.println("----------Usuarios Logeados en el Server2---------");
        if(usuariosLogeados2.isEmpty()){
            System.out.println("No hay usuarios Logeados");
        }
        for (Usuario usuario:usuariosLogeados2) {
            usuario.showInfo();
            System.out.println("");

        }
    }
}

