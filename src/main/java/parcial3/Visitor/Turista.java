package parcial3.Visitor;

import java.util.Random;

public class Turista implements IVisitor {

    private String nombre;
    private int montoDinero;
    private int ci;

    public Turista(String nombre, int dinero, int ci) {
        this.nombre = nombre;
        this.montoDinero = dinero;
        this.ci = ci;
    }

    public void visitLaPaz(LaPaz laPaz) {
        System.out.println("Turista visita La Paz");
        Random random = new Random();
        int number = random.nextInt(montoDinero+1);
        System.out.println("Turista gasta " + number + " bs en La Paz");
        montoDinero-=number;
    }

    public void visitSantaCruz(SantaCruz santaCruz) {
        System.out.println("Turista visita Santa Cruz");
        int porcentaje= santaCruz.getProvincias()/2;
        if(porcentaje>montoDinero){
            System.out.println("Turista no pudo visitar Santa Cruz por falta de presupuesto");
        }else {
            System.out.println("Turista gasta " + porcentaje + " bs en Santa Cruz");
            montoDinero-=porcentaje;
        }
    }

    public void visitCochabamba(Cochabamba cochabamba) {
        System.out.println("Turista visita Cochabamba");
        int porcentaje= (int)(cochabamba.getCantidadDeHabitantes()*(10.0f/100.0f));
        if(porcentaje>montoDinero){
            System.out.println("Turista no pudo visitar Cochabamba por falta de presupuesto");
        }else {
            System.out.println("Turista gasta " + porcentaje + " bs en Cochabamba");
            montoDinero-=porcentaje;
        }

    }

    public void showInfo(){
        System.out.println("");
        System.out.println("Nombre: " + nombre);
        System.out.println("Monto de dinero: " + montoDinero);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(int montoDinero) {
        this.montoDinero = montoDinero;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
