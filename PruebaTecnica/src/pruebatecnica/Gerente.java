package pruebatecnica;

import java.util.List;

public class Gerente {

    /*Un gerente de compras debe comprar un número específico de unidades de un 
    artículo para reabastecer el almacén.
    El administrador debe comprar contenedores contiguos, comenzando en el 
    contenedor 0 y continuando hasta que se haya comprado al menos el número deseado. 
    
    Si no hay suficientes unidades disponibles, se deben comprar a otro proveedor.
    Si se deben comprar artículos en exceso, se deben revender.
    
    Determine el número restante de artículos que se comprarán o venderán 
    después de comprarlos al proveedor principal*/
    public static int restock(List<Integer> itemCount, int target) {
        //recorro el vector
        int compra = 0;
        for (Integer item : itemCount) {
            compra += item;
            if (compra >= target) {
                break;
            }
        }
        if (compra > target) {
            return compra - target;
        }
        if (compra < target) {
            return target - compra;
        }
        return 0;
    }
}
