package assignment6_decoratorPattern;

public class StrongDecoratorTag extends TagDecorator {

	public StrongDecoratorTag(Tag tag) {

		super(tag);
	}
	
	public StrongDecoratorTag(String id, String name, Tag tag) {
		super(id, name, tag);
	}
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<strong");
		
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
		
		return tag.getCloseTag() + "</strong>";
	}
}
