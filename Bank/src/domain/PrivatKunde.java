package domain;

public class PrivatKunde extends Kunde {
	private String cprnr;

	public PrivatKunde(String name, String cprnr) {
		super(name);
		this.cprnr = cprnr;
	}
	
	public String getCprnr() {
		return cprnr;
	}

	public void setCprnr(String cprnr) {
		this.cprnr = cprnr;
	}

	@Override
	public String toString() {
		return "PrivatKunde [cprnr=" + cprnr + ", name=" + name + "]";
	}

	@Override
	public String getId() {
		return cprnr;
	}
	
	
}
