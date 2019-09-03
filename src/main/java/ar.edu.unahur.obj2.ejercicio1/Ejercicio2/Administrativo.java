package ar.edu.unahur.obj2.ejercicio1.Ejercicio2;

public class Administrativo extends Empleado {
    private double hsExtra ;
    private double hsMes;
    //@Override
   public Administrativo (double hsExtra, double hsMes) {
       // super;
        /*this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;*/
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }

   /*public Administrativo(double hsExtra, double hsMes) {
        this.hsExtra = hsExtra;
        this.hsMes = hsMes;
    }*/

    @Override
    public void setSueldoBase(double sueldoBase) {
        super.setSueldoBase(sueldoBase);
    }
}
