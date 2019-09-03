package ar.edu.unahur.obj2.ejercicio1.Ejercicio2;
import java.util.Objects;

public class Empleado {
    public int dni;
    public String nombre;
    public String apellido;
    public String email;
    public double sueldoBase;


    public Empleado(int dni, String nombre, String apellido, String email, double sueldoBase){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return dni == empleado.dni &&
                Double.compare(empleado.sueldoBase, sueldoBase) == 0 &&
                Objects.equals(nombre, empleado.nombre) &&
                Objects.equals(apellido, empleado.apellido) &&
                Objects.equals(email, empleado.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido, email, sueldoBase);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public double getSueldoBase() {

        return sueldoBase;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
}
