
package Biblioteca;

public class IngresarL {
    private String titulo;
    private String autor;
    private String fecha;
    private String editorial;
    private String tipo;
    private String estado;
    private String matri;

    public String getMatri() {
        return matri;
    }

    public void setMatri(String matri) {
        this.matri = matri;
    }
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public IngresarL(String tipo, String titulo,String autor, String fecha,String editorial,String estado,String matri){
        this.tipo = tipo;
        this.titulo=titulo;
        this.autor=autor;
        this.fecha=fecha;
        this.editorial=editorial;
        this.estado=estado;
        this.matri=matri;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString(){
        return "Tipo: "+tipo+"\nTitulo: "+titulo+ "\nAutor: "+autor+"\nFecha: "+fecha+"\nEditorial: "+editorial+"\nEstado: "+estado;
    } 
}
