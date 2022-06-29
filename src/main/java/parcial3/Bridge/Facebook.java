package parcial3.Bridge;

public class Facebook implements Integration {

    @Override
    public void publicarInfo() {
        System.out.println("-----Publicando Informacion en Facebook-----");
    }
}
