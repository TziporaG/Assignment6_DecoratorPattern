package assignment6_decoratorPattern;

public abstract class TagDecorator extends Tag {
	
	 //every decorator needs a tag that is being 'wrapped'
	 Tag tag;
	 
	 public abstract String getOpenTag();
	 public abstract String getCloseTag();

}
