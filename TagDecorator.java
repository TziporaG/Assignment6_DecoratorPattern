package assignment6_decoratorPattern;

public abstract class TagDecorator extends Tag {
	
	 //every decorator needs a tag that is being 'wrapped'
	 Tag tag;
	 
	 public TagDecorator(Tag tag) {
		  this.tag = tag;
	 }
	 
	 public TagDecorator(String id, String name, Tag tag) {
		 
		 super(id, name);
		 this.tag = tag;
	 }
	 
	 public abstract String getOpenTag();
	 public abstract String getCloseTag();

}
