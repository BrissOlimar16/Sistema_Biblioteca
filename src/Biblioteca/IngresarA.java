package Biblioteca;

public class IngresarA {

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    private String Nombre;
    private String Matricula;
    
    public IngresarA(String nombre, String matricula){
        this.Nombre=nombre;
        this.Matricula=matricula;
    }
}
