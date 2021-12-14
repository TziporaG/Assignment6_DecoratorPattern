package assignment6_decoratorPattern;

public class InputTag extends Tag {
	
	//enums based on common type and event attributes
	private Type type;
	private Event event;
	
	private String eventAction;
	private String value;
	
	//Overloaded Constructors
	public InputTag() {
		super();
			
	}
	
	public InputTag (String id, String name, Type type, Event event, String eventAction, String value) {
		super(id, name);
		this.type = type;
		this.event = event;
		this.eventAction = eventAction;
		this.value = value;
	}
	
	public InputTag (String id, String name) {
		super(id, name);
	}
	
	public InputTag (String id, String name, Event event, String eventAction, String value) {
		super(id, name);
		this.event = event;
		this.eventAction = eventAction;
		this.value = value;
	}
	
	public InputTag (String id, Event event, String eventAction, String value) {
		this.id = id;
		this.event = event;
		this.eventAction = eventAction;
		this.value = value;
	}
	
	public InputTag (String id, Event event, String eventAction) {
		this.id = id;
		this.event = event;
		this.eventAction = eventAction;
	}
	
	
	public InputTag (String id, String name, Event event, String eventAction) {
		super(id, name);
		this.event = event;
		this.eventAction = eventAction;
	}
	
	
	public InputTag (String id, String name, Type type, String value) {
		super(id, name);
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
			
			openTag.append(" " + event.toString() + "= \"" + eventAction + "\"");
		}
		
		openTag.append(">");
		
		return openTag.toString();
	}
	
	public String getCloseTag() {
		
		return "</input>";
	}
	

	public void setType(Type type) {
		this.type = type;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	
	public void setEventAttribute(String eventAction) {
		this.eventAction = eventAction;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	

	

}
