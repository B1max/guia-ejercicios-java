package ar.edu.unahur.obj2.ejercicio1.Ejercicio2;

import java.util.Objects;

public class Administrativo extends Empleado {

    private int horasExtras;
    private int horasMes;

    public Administrativo(String dni, String nombre, String apellido, String email, float sueldoBase, String legajo, int horasExtras, int horasMes) {
        super(dni, nombre, apellido, email, sueldoBase, legajo);
        this.horasExtras = horasExtras;
        this.horasMes = horasMes;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public int getHorasMes() {
        return horasMes;
    }

    @Override
    public float getSueldo() {
        return getSueldoBase() * (horasExtras*1.5f + horasMes)/horasMes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Administrativo that = (Administrativo) o;
        return horasExtras == that.horasExtras &&
                horasMes == that.horasMes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), horasExtras, horasMes);
    }
}