package net.sbs.ant.example.typedefs;

public class MessageImpl implements Message {
	private String text;
	
	public void addText(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
