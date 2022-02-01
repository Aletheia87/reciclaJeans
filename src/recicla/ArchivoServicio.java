package recicla;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicio {
	ProductoServicio productoServicio = new ProductoServicio();

	public ArrayList<Producto> cargarDatos() {
		
		File archivo = new File("src/recursos/ProductosImportados.csv");
		ArrayList<Producto> listaProductos = productoServicio.getListaProductos();
		
		if(archivo.exists()) {
		
			try {
				FileReader fr = new FileReader(archivo);
				BufferedReader br = new BufferedReader(fr);
				String linea= br.readLine();
			
				while(linea!=null) {
					String[] lineaArreglo = linea.split(",");
					Producto producto;
					String articulo = lineaArreglo[0];
					String precio = lineaArreglo[1];
					String descripcion = lineaArreglo[2];
					String codigo = lineaArreglo[3];
					String talla = lineaArreglo[4];
					String marca = lineaArreglo[5];
					String color = lineaArreglo[6];
					producto = new Producto(articulo,precio,descripcion,codigo,talla,marca,color);
					listaProductos.add(producto);
					linea= br.readLine();
					//System.out.println(producto.toString());
			}
				
			br.close();
			System.out.println("Datos cargados correctamente en la lista");
				
		} catch (IOException e) {
			System.out.println("Archivo no fue encontrado");
			//e.printStackTrace();
		}
	}
		return listaProductos;
	}
}
