package assignment6_decoratorPattern;

public class UDecoratorTag extends TagDecorator {
	
	private Tag tag;
	
	public UDecoratorTag(Tag tag) {

		this.tag = tag;
	}
	
	public String getOpenTag() {
		
		return  "<u>"  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</u>";
	}

}
