package assignment6_decoratorPattern;

public abstract class Tag {

	String id;
	String name;
	
	public Tag() {
		
	}
	
	public Tag(String id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	//abstract methods to be defined per each class
	public abstract String getOpenTag();
	
	public abstract String getCloseTag();
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}


