public class Materia {
    public String nombre;
    public  int id;

    public Materia(){

    }
    public Materia(String nombre, int id){
        this.id=id;
        this.nombre =nombre;

    }


    public String getNombre() {
        return nombre;
    }

    public int getId() {

        return id;
    }

    public void setNombre(String nombre)

    {
        this.nombre = nombre;
    }

    public void setNumeroId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Materia" + "id:" + id + ", nombre:'" + nombre + '\'' ;
    }
}