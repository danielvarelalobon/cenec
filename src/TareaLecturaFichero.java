import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

public class TareaLecturaFichero extends TimerTask {

	List <String>listaActualFicheros  = new ArrayList <String>();
	
	@Override
	public void run() {
		File directorio=new File("C:\\Users\\Ana\\workspace\\ServiciosyProcesos\\paco");
		File[] listaFicheros=directorio.listFiles();//en un array me guarda el fichero
		
		Set <String> conjunto=new HashSet<String>();//meter la lista en un conjunto
		
		conjunto.addAll(listaActualFicheros);//meter la lista en el conjunto

		System.out.println("Ficheros que aparecen");
		for(File file: listaFicheros){
			
			String nombreFichero=file.getName();
			if(conjunto.add(nombreFichero)){
				System.out.println(nombreFichero);
			}
			
		}
		Set <String> conjunto2=new HashSet<String>();//conjunto de ficheros
		for (File file : listaFicheros) {
			conjunto2.add(file.getName());//meter la lista en el onjunto
		}
		


		System.out.println("Ficheros que desaparecen");
		for(String nombreFichero: listaActualFicheros){
			
			if(conjunto2.add(nombreFichero)){
				System.out.println(nombreFichero);
			}
			
		}
		
		listaActualFicheros.clear();
		for (File file : listaFicheros) {
			listaActualFicheros.add(file.getName());
			
		}
		
		
		
		
		System.out.println("***************"+new Date()+"*******************");
		for (File file : listaFicheros) {
			System.out.println(file.getName());
		}
		
	}
	
	

}
