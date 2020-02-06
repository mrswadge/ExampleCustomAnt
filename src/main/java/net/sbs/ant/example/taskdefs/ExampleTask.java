package net.sbs.ant.example.taskdefs;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class ExampleTask extends Task {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void execute() throws BuildException {
		System.out.println( "Name: " + name );
	}
}
