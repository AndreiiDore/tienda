/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Andrei
 */
import enumeraciones.Talla;
import enumeraciones.ClaseE;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Andrei
 *
 */
public class Tienda {
    private ArrayList<Usuario>users=new ArrayList();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);
		Scanner cadenas = new Scanner(System.in);
		
		int opcion = -1;
		
		ArrayList<Articulo> catalogo = new ArrayList<Articulo>();
		inicializaCatalogo(catalogo);
		
		Carrito cesta = new Carrito();
		
		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1. Alta Articulo");
			System.out.println("2. Comprar");
			System.out.println("3. Confirmar compra");
                        System.out.println("4. Leer fichero");
                        System.out.println("5. Guardar fichero");
			System.out.println("0. Salir");
			opcion = numeros.nextInt();
			
			switch(opcion) {
				case 1:
					addArticuloCatalogo(catalogo, cadenas, numeros);
					mostrarCatalogo(catalogo);
					break;
				case 2:
					comprar(catalogo, cesta, cadenas, numeros);
					break;
				case 3:
					break;
                                case 4:loadArticulosFromFile();break;
                                case 5:saveArticulosToFile(catalogo);break;
				case 0:
					System.out.println("Muchas gracias por su compra.");
					break;
				default:
					System.out.println("Opcion incorrecta, lea atentamente.");
					break;
			}
		}while(opcion != 0);

	}
	
	private static void inicializaCatalogo(ArrayList<Articulo> c) {
		c.add(new Electrodomestico(ClaseE.F,"Monitores","0001", "Monitor", 200.00F, 10));
		c.add(new Electrodomestico(ClaseE.D,"Teclado","0002", "Teclado", 10.00F, 100));
		c.add(new Electrodomestico(ClaseE.D,"Cable de Red","0003", "RJ45 2M", 4.50F, 50));
		c.add(new Electrodomestico(ClaseE.D,"Raton","0004", "Raton", 20.00F, 15));
                //c.add(new Ropa ("Rojo",Talla.L,"0005","Camiseta",20.00F,15));
                c.add(new Electrodomestico(ClaseE.A,"Hogar","0006","Lavadora",500.00F,20));
                c.add(new Congelador("Michubishi",30,"",ClaseE.C,"Congelador","0007","Nevera/Congelador",1000.99F,2));
                
        }

	private static void addArticuloCatalogo(ArrayList<Articulo> c, Scanner sc, Scanner sn) {
		System.out.println("Introduce el codigo del nuevo articulo:");
		String codigo = sc.nextLine();
		System.out.println("Introduce el nombre del nuevo articulo:");
		String nombre = sc.nextLine();
		System.out.println("Introduce el precio del nuevo articulo:");
		float precio = sn.nextFloat();
		System.out.println("Introduce el stock del nuevo articulo:");
		int stock = sn.nextInt();
                System.out.println("Dime el consumo enerfetico tiene el electrodomestico tiene");
                System.out.println("1. A \n2. B \n3. C \n4. D \n5. E \n6. F \n");
                ClaseE cons=ClaseE.F;
                int consumoNumero=sn.nextInt();
                if (consumoNumero==1) {
                cons= ClaseE.A;
            }
                if (consumoNumero==2) {
                cons= ClaseE.B;
            }
                if (consumoNumero==3) {
                cons= ClaseE.C;
            }
                if (consumoNumero==4) {
                cons= ClaseE.D;
            }
                if (consumoNumero==5) {
                cons= ClaseE.E;
            }
                if (consumoNumero==6) {
                cons= ClaseE.F;
            }
                System.out.println("Introduce la gama a la que pertenece este electrodomestico:");
                String gama = sc.nextLine();
                
		c.add(new Electrodomestico(cons,gama,codigo,nombre,precio,stock));
	//ClaseE calificacionEnergetica, String gama, String codigo, String nombre, float precio, int stock
        }
	
	private static void mostrarCatalogo(ArrayList<Articulo> c) {
		for (Articulo a: c) {
			System.out.println(a);
		}
	}

	private static Articulo buscarArticuloPorCodigo(ArrayList<Articulo> c, String codigo) {
		int talla_catalogo = c.size();
		int i = 0;
		Articulo a = null;
		boolean found= false;
		
		while(i<talla_catalogo && !(found)) {
			if (c.get(i).getCodigo().equals(codigo))
			{
				a = c.get(i);
				found=true;
			}
			else
				i++;
		}
		
		return a;
		
	}
	
	private static int buscarPosicionArticuloPorCodigo(ArrayList<Articulo> c, String codigo) {
		int talla_catalogo = c.size();
		int i = 0;
		boolean found= false;
		
		while(i<talla_catalogo && !(found)) {
			if (c.get(i).getCodigo().equals(codigo))
				found=true;
			else
				i++;
		}
		if (found)
			return i;
		else
			return -1;
		
	}

	private static void comprar(ArrayList<Articulo> c, Carrito carro, Scanner sc, Scanner sn) {
		int salircomprar = -1;
		do {
			//Mostramos catalogo
			mostrarCatalogo(c);
			System.out.println("Elige un articulo e introduce su codigo: ");
			String codigo = sc.nextLine();
			Articulo a = buscarArticuloPorCodigo(c, codigo);
			if (a != null) {
				System.out.println("Indica la cantidad que quieres: ");
				int cantidad = sn.nextInt();
				//Si no tengo suficiente hare lo mismo que si no hubiera encontrado el articulo
				if (a.disponible(cantidad))
					carro.addArticulo(a, cantidad);
				else
					System.out.println("Articulo no disponible, elija otro o revise la cantidad elegida.");
			}
			else
				System.out.println("Articulo no disponible, elija otro o revise la cantidad elegida.");
			
			System.out.println(carro.mostrarCarrito());
			
			System.out.println("Pulsa 0 si quieres salir de comprar e ir a confirmar. "
					+ "Cualquier otra tecla para seguir comprando.");
			salircomprar= sn.nextInt();
			
		}while(salircomprar !=0);
		
		//Pedimos articulo por codigo, lo buscamos
		//    si existe Pedimos cantidad
		//	  	si hay disponibilidad
		//			Añadimos al carrito
		//mostrar carrito 
		//repetir mientras 
		
	}
	
	private static void modificarStockCatalogo(ArrayList<Articulo> c, Carrito carro) {
		int pos;
		for(ArticuloCarrito ac: carro.pedido) {
			pos = buscarPosicionArticuloPorCodigo(c, ac.elemento.getCodigo());
			if (pos >-1)
				c.get(pos).ajustarStock(-1*ac.cantidad);
		} 
	}
	
	
	private static void confirmarCarrito(ArrayList<Articulo> c, Carrito carro, Scanner sn) {
		//Mostramos carrito articulos+cantidades+ el total y estado
		System.out.println(carro.mostrarCarrito());
		System.out.println("Pulsa 1 si quieres confirmar la compra del carrito. Cualquier otra tecla para seguir comprando.");
		int confirmar = sn.nextInt();
		if(confirmar == 1) {
			modificarStockCatalogo(c, carro);
			carro.confirmado = Carrito.CONFIRMADO;
			System.out.println(carro.mostrarCarrito());
			mostrarCatalogo(c);
			System.out.println("Gracias por su compra. Puede continuar comprando.");
			carro = new Carrito();
		}
		else
			System.out.println("Puede continuar comprando.");
		//Preguntamos confirmacion
		// Si se confirma
		// 		Modificar en el catalogo el stock de los articulos del carrito, restando
		// 		las cantidades al stock
		//		Cambiar estado carrito a confirmado
		//		Mostramos carrito articulos+cantidades+ el total y estado
		//		Mostramos catalogo con el nuevo stock
		//		Mostramos mensaje de despedida y salimos del programa
		//Si no se confirma: Mostramos mensaje de que puede seguir comprando
                
	}
        /**
         * metodo para leer ficheros y cargar los articulos en catalogo
         */
        
        public static void loadArticulosFromFile() {
            File fichero=null;
            FileReader lector =null;
            BufferedReader buffer=null;

            try{
                fichero= new File ("articulos");
                lector = new FileReader(fichero);
                buffer= new BufferedReader(lector);
                String linea=null;
                String [] nuevaRopa;
                while ((linea=buffer.readLine())!=null) {                
                    System.out.println(linea);
                    nuevaRopa=linea.split(",");
                    //nuevaRopa[];
                }
            }catch(FileNotFoundException fnfe){
                fnfe.printStackTrace();
            }catch(IOException ioe){
                ioe.printStackTrace();
            }finally{
                if (buffer!= null) {
                    try{
                        buffer.close();
                    }catch(IOException ioe){
                        ioe.printStackTrace();
                    }
                }
            }
        }
            public static void saveArticulosToFile(ArrayList<Articulo> catalogo){
                FileWriter fichero= null;
                PrintWriter escritor = null;

                try{
                    fichero =new FileWriter("articulos2.txt");
                    escritor=new PrintWriter(fichero);
                    for (Articulo articulo : catalogo) {
                         escritor.println(articulo.toStringFile());
                    }
                   
                }catch(IOException ioe){
                    ioe.printStackTrace();
                }finally{
                    if (fichero!=null) {
                        try {
                            fichero.close();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        }
                    }
            }
        
        }
//crear Usuario
    //DarOpionion

}
