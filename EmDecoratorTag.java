package assignment6_decoratorPattern;

public class EmDecoratorTag extends TagDecorator {
	
	public EmDecoratorTag(Tag tag) {

		super(tag);
	}
	
	public EmDecoratorTag(String id, String name, Tag tag) {
		super(id, name, tag);
	}
	
	public String getOpenTag() {
		
StringBuilder openTag = new StringBuilder("<em");
		
		if(id != null) {
			
			openTag.append(" id = \"" + id + "\"");
		}
		
		if(name != null) {
			
			openTag.append(" name = \"" + name + "\"");
		}
		
		
		openTag.append(">");  
		
		return openTag.toString() + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</em>";
	}

}
