
package ec.edu.espe.arrays.tipos;

import ec.edu.espe.arrays.modelo.Animal;

public class TestingAnimals {
    public static void main(String[] args) {
        Animal[] animal;
        animal=new Animal[10];
        int i;
        
        for(i=0;i<animal.length;i++)
        {
            animal[i]= new Animal();
            animal[i].setId(i+1);
            if((i%2==0))
            {
                animal[i].setOjos("negro");
            }
            else
            {
                animal[i].setOjos("cafe");
            }
            animal[i].setName("Lucy"+(i+1)+"");
        }
        /*for(Animal animals:animal)
        {
            System.out.println(animals+",");
        }*/
        for(i=0;i<10;i++)
        {
            //animal[i]=new Animal();
            System.out.println("* -El ID del animal es: "+animal[i].getId()+"* -El color de ojos es: "+animal[i].getOjos()+"* -El nombre es: "+animal[i].getName()+"*");
        }
    }
}
