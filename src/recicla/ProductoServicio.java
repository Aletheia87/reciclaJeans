package recicla;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductoServicio {

	Scanner sc = new Scanner(System.in);

	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public ProductoServicio() {

	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void listarProductos() {
		if (listaProductos != null) {

			for (Producto producto : listaProductos) {
				System.out.println("Datos del Producto:");
				System.out.println("Nombre articulo: " + producto.getArticulo());
				System.out.println("Precio: " + producto.getPrecio());
				System.out.println("Descripcion: " + producto.getDescripcion());
				System.out.println("Código: " + producto.getCodigo());
				System.out.println("Talla: " + producto.getTalla());
				System.out.println("Marca: " + producto.getMarca());
				System.out.println("Color: " + producto.getColor());
				System.out.println("---------------------------------");
			}
		} else {
			System.out.println("No se ha podido listar a los productos, aún no carga datos");
		}
	}
	
	public void describirProducto(int indice) {
		System.out.println("1 .-El nombre del articulo actual es: "+listaProductos.get(indice).getArticulo());
		System.out.println("2 .-El código del producto: "+listaProductos.get(indice).getCodigo());
		System.out.println("3 .-El color del producto: "+listaProductos.get(indice).getColor());
		System.out.println("4 .-La descripción del producto: "+listaProductos.get(indice).getDescripcion());
		System.out.println("5 .-La marca del producto: "+listaProductos.get(indice).getMarca());
		System.out.println("6 .-El precio del producto: "+listaProductos.get(indice).getPrecio());
		System.out.println("7 .-La talla del producto: "+listaProductos.get(indice).getTalla()); 
	}
	
	public int buscarProducto(String codigo) {
		int i;
		for(i=0; i<listaProductos.size();i++)
			if(listaProductos.get(i).getCodigo().equals(codigo)) {
				return i;
			}			
		return i;
	}
		
}


