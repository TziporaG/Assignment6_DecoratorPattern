package assignment6_decoratorPattern;

public class ADecoratorTag extends TagDecorator {
	
	private Tag tag;
	private String href;
	
	public ADecoratorTag(Tag tag) {

		this.tag = tag;
	}
	
	public ADecoratorTag(Tag tag, String href) {

		this.tag = tag;
		this.href = href;
	}
	
	//will only print the href attribute if its been filled in  
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<a");
		
		if(href != null) {
			
			openTag.append(" href = \"" + href + "\"");
		}
		
		openTag.append(">");
		
		return  openTag  + tag.getOpenTag();
	}
	

	public String getCloseTag() {
		
		return tag.getCloseTag() + "</a>";
	}
}

