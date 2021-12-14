package assignment6_decoratorPattern;

public class SmallDecoratorTag extends TagDecorator {
	
	public SmallDecoratorTag(Tag tag) {

		super(tag);
	}
	
	public SmallDecoratorTag(String id, String name, Tag tag) {
		super(id, name, tag);
	}
	
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<small");
		
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
		
		return tag.getCloseTag() + "</small>";
	}
}