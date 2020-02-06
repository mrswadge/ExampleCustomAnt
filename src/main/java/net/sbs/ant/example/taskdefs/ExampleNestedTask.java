package net.sbs.ant.example.taskdefs;

import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.BuildException;

import net.sbs.ant.example.typedefs.Message;
import net.sbs.ant.example.typedefs.MessageImpl;

public class ExampleNestedTask extends ExampleTask {
	private List<Message> messages = new ArrayList<Message>(); 

	/**
	 * Required method to create typedef Message from ant script.
	 * @return Message instance.
	 */
	public Message createMessage() {
		Message msg = new MessageImpl();
		messages.add(msg);
		return msg;
	}
	
	/**
	 * Add a message to the list.
	 * @param message
	 */
	public void addMessage( Message message ) {
		messages.add( message );
	}
	
	@Override
	public void execute() throws BuildException {
		super.execute();
		for ( Message msg : messages ) {
			System.out.println( msg.getText() );
		}
	}
}
