package assignment6_decoratorPattern;

public class DivTag extends Tag {
	
	public DivTag() {
		super();
	}
	
	public DivTag(String id, String name) {
		super(id, name);

	}

	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<div");

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
		
		return "</div>";
	}
	

		
}
