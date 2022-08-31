package parcial3.Decorator;

public class Client {

    public static void main(String[]args){

        System.out.println("--------------------------------------------------------------------------------");

        ICelular celularSamsung= new CelularSamsung("1 Tera", 1000, 4);

        celularSamsung.showInfo();

        celularSamsung=new MemoriaExterna(celularSamsung,"5 gigabytes", 100);
        celularSamsung=new VidrioTemplado(celularSamsung,100);
        celularSamsung=new Carcasa(celularSamsung,20);

        celularSamsung.operation();
        celularSamsung.showInfo();

        System.out.println("--------------------------------------------------------------------------------");

        ICelular celularApple= new CelularApple("250 gigasbytes", 1000, 4);

        celularApple.showInfo();

        celularApple=new MemoriaExterna(celularApple,"3 gigabytes",30);
        celularApple=new VidrioTemplado(celularApple,500);
        celularApple=new Carcasa(celularApple,150);

        celularApple.operation();
        celularApple.showInfo();
        celularSamsung.showInfo();
        celularApple.showInfo();
djaaa
        eaekhka
        jhzk
        System.out.println("--------------------------------------------------------------------------------");

        ICelular celularXiaomi= new CelularXiaomi("10 gigasbytes", 1000, 4);

        celularXiaomi.showInfo();

        celularXiaomi=new MemoriaExterna(celularXiaomi,"5 gigabytes",50);
        celularXiaomi=new VidrioTemplado(celularXiaomi,50);
        celularXiaomi=new Carcasa(celularXiaomi,10);

        celularXiaomi.operation();
        celularXiaomi.showInfo();






    }
}
