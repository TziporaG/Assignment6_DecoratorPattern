package assignment6_decoratorPattern;

public class UDecoratorTag extends TagDecorator {

	public UDecoratorTag(Tag tag) {

		super(tag);
	}
	
	public UDecoratorTag(String id, String name, Tag tag) {
		super(id, name, tag);
	}
	
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<u");
		
		if(id != null) {
			
			openTag.append(" id = \"" + id + "\"");
		}
		
		if(name != null) {
			
			openTag.append(" name = \"" + name + "\"");
		}
		
		openTag.append(">");
		
		return  openTag.toString()  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</u>";
	}

}
