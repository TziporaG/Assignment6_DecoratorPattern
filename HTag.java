package assignment6_decoratorPattern;

public class HTag extends Tag {
	
	private int size;
	
	//must specifies a sizes
	public HTag(int size) {
		super();
		
		if(size != 1 || size != 2 || size != 3 || size != 4 || size != 5 || size != 6 ) {
			this.size = 1;
		}
		
		else {
		this.size = size;
		}
		
		
	}
	
	public HTag (String id, String name, int size) {
		
		super(id, name);
		if(size != 1 || size != 2 || size != 3 || size != 4 || size != 5 || size != 6 ) {
			this.size = 1;
		}
		
		else {
		this.size = size;
		}
	
	}

	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<h" + size);
		
		if(id != null) {
			
			openTag.append(" id = \"" + id + "\"");
		}
		
		if(name != null) {
			
			openTag.append(" name = \"" + name + "\"");
		}
			
		
		openTag.append(">");
		
		return openTag.toString();
	}
	
	public String getCloseTag() {
		
		return "</h" + size + ">";
	}
	
	public void setSize(int size) {
		this.size = size;
	}
}
	
	