package ec.edu.espe.arrays.primitivos;

public class TestingArrays {

    public static void main(String[] args) {
        int[] enteros = new int[10];
        float[] flotantes = new float[5];
        int i;
        for (i = 0; i < enteros.length ; i++) {
            enteros[i] = i + 1;
        }
        for (i = 0; i < flotantes.length; i++) {
            flotantes[i] = 1+(float)(i+1)/10;
        }
        for (i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i]+",");
        }
        for(int entero:enteros)
        {
            System.out.print(entero+",");
        }
        for (i = 0; i < flotantes.length; i++) {
            System.out.print(flotantes[i]+",");
        }
        for (float flotante: flotantes){
            System.out.print(flotante+",");
        }
        int[] otrosEnteros={8,11,2017};
        for (i = 0; i < otrosEnteros.length; i++) {
            System.out.print(otrosEnteros[i]+",");
        }
    }
}
