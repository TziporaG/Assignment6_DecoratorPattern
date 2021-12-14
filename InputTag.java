package assignment6_decoratorPattern;

public class InputTag extends Tag {
	
	//enums based on common type and event attributes
	private Type type;
	private Event event;
	
	private String eventAttribute;
	private String value;
	
	//Overloaded Constructors
	public InputTag() {
		super();
			
	}
	
	public InputTag (String id, String name, Type type, Event event, String eventAttribute, String value) {
		super(id, name);
		this.type = type;
		this.event = event;
		this.eventAttribute = eventAttribute;
		this.value = value;
	}
	
	public InputTag (String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public InputTag (String id, String name, Event event, String eventAttribute, String value) {
		this.id = id;
		this.name = name;
		this.event = event;
		this.eventAttribute = eventAttribute;
		this.value = value;
	}
	
	public InputTag (String id, Event event, String eventAttribute, String value) {
		this.id = id;
		this.event = event;
		this.eventAttribute = eventAttribute;
		this.value = value;
	}
	
	public InputTag (String id, Event event, String eventAttribute) {
		this.id = id;
		this.event = event;
		this.eventAttribute = eventAttribute;
	}
	
	
	public InputTag (String id, String name, Event event, String eventAttribute) {
		this.id = id;
		this.name = name;
		this.event = event;
		this.eventAttribute = eventAttribute;
	}
	
	
	public InputTag (String id, String name, Type type, String value) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.value = value;
	}
	
	public InputTag (String id, String name, String value) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	//depending on what attributes have been filled in is what will print
	public String getOpenTag() {
		
		StringBuilder openTag = new StringBuilder("<input");
		
		if(id != null) {
			
			openTag.append(" id = \"" + id + "\"");
		}
		
		if(name != null) {
			
			openTag.append(" name = \"" + name + "\"");
		}
			
		if(type != null) {
			
			openTag.append(" type = \"" + type.toString() + "\"");
		}
		
		if(value != null) {
			
			openTag.append(" value = \"" + value + "\"");
		}
	
		if(event != null) {
			
			openTag.append(" " + event.toString() + "= \"" + eventAttribute + "\"");
		}
		
		openTag.append(">");
		
		return openTag.toString();
	}
	
	public String getCloseTag() {
		
		return "</input>";
	}
	

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public void setType(Type type) {
		this.type = type;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	

	

}
