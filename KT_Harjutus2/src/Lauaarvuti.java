import java.time.LocalDateTime;


public class Lauaarvuti extends Arvuti{

	private boolean koosMonitoriga;
	

	public Lauaarvuti(String tootja, String mudel, String opSüsteem,
			String kiirtöö, LocalDateTime registreerimisAeg, String koosMonitoriga) {
		super(tootja, mudel, opSüsteem, kiirtöö, registreerimisAeg);
		if (koosMonitoriga == "monitoriga")
			this.koosMonitoriga = true;
		else 
			this.koosMonitoriga = false;
	}
	
	public boolean onKoosMonitoriga() {
		return koosMonitoriga;
	}
	
}
