package assignment6_decoratorPattern;

public class ItalicizeDecoratorTag extends TagDecorator {
	
	private Tag tag;
	
	public ItalicizeDecoratorTag(Tag tag) {

		this.tag = tag;
	}
	
	public String getOpenTag() {
		
		return  "<i>"  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</i>";
	}

}
