package assignment6_decoratorPattern;

public class ADecoratorTag extends TagDecorator {

	private String href;
	
	public ADecoratorTag(String id, String name, Tag tag) {
		super(id, name, tag);
	}
	
	public ADecoratorTag(Tag tag) {
		super(tag);
	}
	
	public ADecoratorTag(Tag tag, String href) {
		super(tag);
		this.href = href;
	}
	
	//will only print the href attribute if its been filled in  
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<a");
		
		if(href != null) {
			
			openTag.append(" href = \"" + href + "\"");
		}
		
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
		
		return tag.getCloseTag() + "</a>";
	}
}

