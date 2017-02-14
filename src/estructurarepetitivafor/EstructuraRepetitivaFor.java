/*
3. Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100 
utilizando la instrucción for.

 */
package estructurarepetitivafor;

/**
 *
 * @author carlosjoseanguiano
 */
public class EstructuraRepetitivaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i < 100; i++) {
            num++;
            System.out.println("Valor : " + num);
        }
    }

}
