package ergasia3;

public class Vechicle  {
	
	
	private String fullnameofowner;
	private String arithmoskykloforias;
	int etosKat=0;
	private SystimaDieythynsis sysdief;
	private Mihani eng;
	
	
	public Vechicle(String fullnameofowner, String arithmoskykloforias, int etosKat, SystimaDieythynsis sysdief,
			Mihani eng) {
		super();
		this.fullnameofowner = fullnameofowner;
		this.arithmoskykloforias = arithmoskykloforias;
		this.etosKat = etosKat;
		this.sysdief = sysdief;
		this.eng = eng;
	}
	
	
	public String getArithmoskykloforias() {
		return arithmoskykloforias;
	}


	public void setArithmoskykloforias(String arithmoskykloforias) {
		this.arithmoskykloforias = arithmoskykloforias;
	}


	public void showDetails() {
        System.out.println("Owner " + fullnameofowner);
        System.out.println("year of construction: " + etosKat);
    }
	
	
}
