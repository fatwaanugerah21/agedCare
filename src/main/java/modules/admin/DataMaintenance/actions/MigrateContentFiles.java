package modules.admin.DataMaintenance.actions;

//import org.skyve.impl.backup.ContentChecker;
import org.skyve.metadata.controller.ServerSideAction;
import org.skyve.metadata.controller.ServerSideActionResult;
import org.skyve.web.WebContext;

import modules.admin.domain.DataMaintenance;

public class MigrateContentFiles implements ServerSideAction<DataMaintenance> {
	private static final long serialVersionUID = 5585867056479500653L;

	@Override
	public ServerSideActionResult<DataMaintenance> execute(DataMaintenance bean, WebContext webContext) throws Exception {
//		ContentChecker.migrateContentFiles();
		return new ServerSideActionResult<>(bean);
	}
}
