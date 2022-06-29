package parcial3.Bridge;

public class Whatsapp implements Integration {

    @Override
    public void publicarInfo() {
        System.out.println("-------Publicando Informacion en Whatsapp------");
    }
}
