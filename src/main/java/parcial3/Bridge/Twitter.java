package parcial3.Bridge;

public class Twitter implements Integration {

    @Override
    public void publicarInfo() {
        System.out.println("-------Publicando Informacion en Twiter-------");
    }
}
