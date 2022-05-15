public class Contenedor {




    /// ATRIBUTOS

    int id_almacen;

    /// METODOS

    public void gregarProducto(char nombreProducto) {
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = scanner.nextLine ();
        arraydeproductos += nombreProducto;

    }

    public void quitarProducto(char nombreProducto) {
        System.out.println("Ingrese el nombre del producto que desea quitar");
        nombreProducto = scanner.nextLine ();
        arraydeproductos -= nombreProducto;

    }

    public void enviarAlmacen(int id_almacen) {

    }
}
