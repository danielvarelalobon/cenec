
import java.util.Timer;

public class MainScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer=new Timer();
		TareaLecturaFichero tarea=new TareaLecturaFichero();
		timer.schedule(tarea,0,1000);
		//Set miconjunto=new HashSet();

	}

}
