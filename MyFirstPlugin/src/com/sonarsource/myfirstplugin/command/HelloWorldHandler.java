package com.sonarsource.myfirstplugin.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import io.vavr.collection.List;

public class HelloWorldHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		MessageDialog.openInformation(shell, "Hello World", sayHelloTo(List.of("world")));
		return null;
	}
	
	private String sayHelloTo(List<String> people) {
		return "Hello, " + people.mkString(", ") + "!";
	}

}
