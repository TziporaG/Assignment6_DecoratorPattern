package assignment6_decoratorPattern;

public class SmallDecoratorTag extends TagDecorator {
	
	private Tag tag;
	
	public SmallDecoratorTag(Tag tag) {

		this.tag = tag;
	}
	
	public String getOpenTag() {
		
		return  "<small>"  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</small>";
	}
}