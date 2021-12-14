package assignment6_decoratorPattern;

public class ItalicizeDecoratorTag extends TagDecorator {
	
	public ItalicizeDecoratorTag(Tag tag) {

		super(tag);
	}
	
	public ItalicizeDecoratorTag(String id, String name, Tag tag) {
		super(id, name, tag);
	}
	
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<i");

		if(id != null) {
			
			openTag.append(" id = \"" + id + "\"");
		}
		
		if(name != null) {
			
			openTag.append(" name = \"" + name + "\"");
		}
		
		
		openTag.append(">");
		
		return  openTag.toString() + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</i>";
	}

}
