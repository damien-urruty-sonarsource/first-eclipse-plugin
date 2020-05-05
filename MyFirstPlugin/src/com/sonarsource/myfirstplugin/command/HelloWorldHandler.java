package com.sonarsource.myfirstplugin.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

public class HelloWorldHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		Shell shell = HandlerUtil.getActiveWorkbenchWindow(event).getShell();
		MessageDialog.openInformation(shell, "Hello World", "Hello World!");
		return null;
	}

}
