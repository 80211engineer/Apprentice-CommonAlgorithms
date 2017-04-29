package common.algorithms.busqueda;

public class LinearSearch {

    /**
     * <p>Busca el elemento <b>target</b> dentro del <b>array</b> utilizando el algoritmo <b>Linear Search</b></p>
     *
     * @param array Array para buscar
     * @param target Elemento a buscar
     * @return Indice del element <b>target</b> si esta contenido en <b>array</b>. De otra manera retorna -1
     */
    public static int buscar(int[] array, int target) {
        for (int i=0; i<array.length; i++) {
            if(target == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
