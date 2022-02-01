package recicla;

import java.util.Scanner;



public class Menu {
	
	Scanner sc = new Scanner(System.in);
	ProductoServicio lista= new ProductoServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	String opcion;
	
	public Menu() {
		desplegarMenu();
	}

	public void desplegarMenu() {
		
		do {
			System.out.println("------------------------------");
			System.out.println("-----Tienda INDIANA Jeans-----");
			System.out.println("1. Listar Producto");
			System.out.println("2. Editar Producto");
			System.out.println("3. Importar Datos");
			System.out.println("4. Salir");
			System.out.println("-----------------------------");
			System.out.println("Ingrese una opción:");
			opcion = sc.nextLine();

			if (opcion.equals("1")) {
				lista.listarProductos();
			} else if (opcion.equals("2")) {
				editarProducto();
			} else if (opcion.equals("3")) {
				System.out.println("Cargar Datos");
				System.out.println("Ingresa la ruta en donde desea exportar el archivo .txt:");
				sc.nextLine();
				lista.setListaProductos(archivoServicio.cargarDatos());
				System.out.println();
			} else if (opcion.equals("4")) {
				Utilidad.limpiarPantalla();
				Utilidad.tiempoEspera();
			} else {
				System.out.println("Ingrese una opcion valida");
			}
		} while (!opcion.equals("4"));
	}

	public void editarProducto() {
		System.out.println("Ingrese el número 1 para editar los datos ingresados del Producto");
		opcion = sc.nextLine();
		if (opcion.equals("1")) {
			System.out.println("Ingrese código del producto:");
			String codigo = sc.nextLine();
			int indice = lista.buscarProducto(codigo);
			lista.describirProducto(indice);
			System.out.println("Ingrese la opción a editar de los datos del producto:");
			opcion = sc.nextLine();
			int data = Integer.parseInt(opcion);
				if(data==1) {
					System.out.println("Ingrese el nuevo nombre del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setArticulo(opcion);
				}else if (data==2) {
					System.out.println("Ingrese el nuevo código del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setCodigo(opcion);
				}else if (data==3) {
					System.out.println("Ingrese el nuevo color del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setColor(opcion);
				}else if (data==4) {
					System.out.println("Ingrese la nueva descripción del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setDescripcion(opcion);
				}else if (data==5) {
					System.out.println("Ingrese la nueva marca del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setMarca(opcion);
				}else if (data==6) {
					System.out.println("Ingrese el nuevo precio del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setPrecio(opcion);
				}else if (data==7) {
					System.out.println("Ingrese la nueva talla del artículo: ");
					opcion = sc.nextLine();
					lista.getListaProductos().get(indice).setTalla(opcion);			
			}
		}
	} 
}
