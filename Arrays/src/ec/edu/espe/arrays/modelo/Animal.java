
package ec.edu.espe.arrays.modelo;

public class Animal {
    private int id;
    private String ojos, name;

    public Animal(int id, String ojos, String name) {
        this.id = id;
        this.ojos = ojos;
        this.name = name;
    }

    public Animal() {
        //throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
