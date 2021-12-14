package assignment6_decoratorPattern;

public class Main {
	
	public static void main(String [] args) {
		                        //id,   name,      event,        eventAttribute
		Tag tag1 = new InputTag("yes", "giraffe", Event.onblur, "alert('No')");
		tag1 = new StrongDecoratorTag(tag1);
		tag1 = new UDecoratorTag(tag1);
		tag1 = new ADecoratorTag(tag1, "www.school.com");
		System.out.println(tag1.getOpenTag() + "Touro" + tag1.getCloseTag());
		
		Tag tag2 = new PTag("hello", "hi");
		tag2 = new EmDecoratorTag(tag2);
		tag2 = new ItalicizeDecoratorTag("test", "no", tag2);
		tag2 = new SmallDecoratorTag(tag2);
		System.out.println(tag2.getOpenTag() + "Computer" + tag2.getCloseTag());
		
		Tag tag3 = new InputTag("yellow", "name", Type.button, "green");
		tag3 = new ADecoratorTag(tag3);
		System.out.println(tag3.getOpenTag() + "School" + tag3.getCloseTag());
		
		Tag tag4 = new DivTag();
		tag3 = new UDecoratorTag(tag4);
		System.out.println(tag4.getOpenTag() + "Fourth Tag" + tag4.getCloseTag());
		
		Tag tag5 = new HTag(1);
		tag5 = new SmallDecoratorTag(tag5);
		System.out.println(tag5.getOpenTag() + "5th Tag" + tag5.getCloseTag());
		
		
		

	}
}
