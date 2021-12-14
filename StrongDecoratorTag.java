package assignment6_decoratorPattern;

public class StrongDecoratorTag extends TagDecorator {
	
	private Tag tag;
	
	public StrongDecoratorTag(Tag tag) {

		this.tag = tag;
	}
	
	public String getOpenTag() {
		
		return  "<strong>"  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</strong>";
	}
}
