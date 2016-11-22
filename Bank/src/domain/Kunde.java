package domain;

public abstract class Kunde {
protected String name;
	
	public Kunde(String name) {
		this.name = name;
	}
	
	public abstract String getId();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
