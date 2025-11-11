// actividad 11
public interface Entregable {
    
    // Marca el objeto como entregado
    void entregar();
    
    // Marca el objeto como no entregado
    void devolver();
    
    // Verifica si el objeto está entregado
    boolean isEntregado();
    
    // Compara el objeto actual con otro (por número de temporadas, horas, etc.)
    int compareTo(Object a);
}
