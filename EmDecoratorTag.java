package assignment6_decoratorPattern;

public class EmDecoratorTag extends TagDecorator {
	
	private Tag tag;
	
	public EmDecoratorTag(Tag tag) {

		this.tag = tag;
	}
	
	public String getOpenTag() {
		
		return  "<em>"  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</em>";
	}

}
