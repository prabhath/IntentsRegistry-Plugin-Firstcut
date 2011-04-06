package test.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class TestHandler extends AbstractHandler {
	

	public Object execute(ExecutionEvent event) throws ExecutionException {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			MessageDialog.openInformation(
					window.getShell(),
					"About",
					"Created By-P.P.P.S Pathirana\nThis plugin is not at deployment state. This is a test only.");		
		return null;
	}

}
