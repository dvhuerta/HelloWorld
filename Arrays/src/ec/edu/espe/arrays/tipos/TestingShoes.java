
package ec.edu.espe.arrays.tipos;
import ec.edu.espe.arrays.modelo.ShoesSoccer;
public class TestingShoes {
    public static void main(String[] args) {
        ShoesSoccer[] shoes;
        shoes=new ShoesSoccer[10];
        int i;
        
        for(i=0;i<shoes.length;i++)
        {
            shoes[i]=new ShoesSoccer();
            
            shoes[i].setId(i+1);
            if((i%2==0))
            {
                shoes[i].setColor("Amarillo");
            }
            else
            {
                shoes[i].setColor("Rojo");
            }
            shoes[i].setMarca("Nike "+(i+1)+"");
           /* for(ShoesSoccer shoes1:shoes)
        {
            System.out.println(shoes+",");
        }*/
        }
            for(i=0;i<10;i++)
            {
            //animal[i]=new Animal();
                System.out.println("* -El ID del zapato es: "+shoes[i].getId()+"* -El color del zapato es: "+shoes[i].getColor()+"* -La marca es: "+shoes[i].getMarca()+"*");
            }
        } 
    } 

