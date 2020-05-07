package com.sonarsource.myfirstplugin;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
 
@RunWith(SWTBotJunit4ClassRunner.class)
public class UITest {
 
	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
	}
 
	@Test
	public void can_open_the_hello_world_dialog() {
		bot.menu("Hello").menu("Hello, world!").click();
		
		SWTBotShell shell = bot.shell("Hello World");
		shell.activate();
		
		bot.button("OK").click();
	}
	
	private static SWTWorkbenchBot bot;
 
}