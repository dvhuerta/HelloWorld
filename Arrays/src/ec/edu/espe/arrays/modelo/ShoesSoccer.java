
package ec.edu.espe.arrays.modelo;

public class ShoesSoccer {
    private int id;
    private String marca, color;

    public ShoesSoccer(int id, String marca, String color) {
        this.id = id;
        this.marca = marca;
        this.color = color;
    }

    public ShoesSoccer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
