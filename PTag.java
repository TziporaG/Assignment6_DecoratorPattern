package assignment6_decoratorPattern;

public class PTag extends Tag {
	
	private String id;
	private String name;
	
	public PTag() {
		
	}
	
	public PTag (String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<p");
		
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
		
		return "</p>";
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
