package wxcloudregistration._priv;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class env

{
	// ---( internal utility methods )---

	final static env _instance = new env();

	static env _newInstance() { return new env(); }

	static env _cast(Object o) { return (env)o; }

	// ---( server methods )---




	public static final void getSystemVariable (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getSystemVariable)>> ---
		// @sigtype java 3.5
		// [i] field:0:required WxCloud_Alias
		// [i] field:0:required WxCloud_URL
		// [i] field:0:required WxCloud_UserName
		// [i] field:0:required WxCloud_Password
		// [i] field:0:required WxCloud_AccountName
		// [i] field:0:required WxCloud_RunAsUser
		// [o] field:0:required WxCloud_Alias
		// [o] field:0:required WxCloud_URL
		// [o] field:0:required WxCloud_UserName
		// [o] field:0:required WxCloud_Password
		// [o] field:0:required WxCloud_AccountName
		// [o] field:0:required WxCloud_RunAsUser
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		String	WxCloud_Alias = IDataUtil.getString( pipelineCursor, "WxCloud_Alias" );
		String	WxCloud_URL = IDataUtil.getString( pipelineCursor, "WxCloud_URL" );
		String	WxCloud_UserName = IDataUtil.getString( pipelineCursor, "WxCloud_UserName" );
		String	WxCloud_Password = IDataUtil.getString( pipelineCursor, "WxCloud_Password" );
		String	WxCloud_AccountName = IDataUtil.getString( pipelineCursor, "WxCloud_AccountName" );
		String	WxCloud_RunAsUser = IDataUtil.getString( pipelineCursor, "WxCloud_RunAsUser" );
		
		String EnvWxCloud_Alias = System.getenv("WxCloud_Alias");
		if (EnvWxCloud_Alias != null) {
			IDataUtil.put( pipelineCursor, "WxCloud_Alias", EnvWxCloud_Alias );
		} else {
			IDataUtil.put( pipelineCursor, "WxCloud_Alias", WxCloud_Alias );
		}
		
		String EnvWxCloud_URL = System.getenv("WxCloud_URL");
		if (EnvWxCloud_URL != null) {
			IDataUtil.put( pipelineCursor, "WxCloud_URL", EnvWxCloud_URL );
		} else {
			IDataUtil.put( pipelineCursor, "WxCloud_URL", WxCloud_URL );
		}
		
		String EnvWxCloud_UserName = System.getenv("WxCloud_UserName");
		if (EnvWxCloud_UserName != null) {
			IDataUtil.put( pipelineCursor, "WxCloud_UserName", EnvWxCloud_UserName );
		} else {
			IDataUtil.put( pipelineCursor, "WxCloud_UserName", WxCloud_UserName );
		}
		
		String EnvWxCloud_Password = System.getenv("WxCloud_Password");
		if (EnvWxCloud_Password != null) {
			IDataUtil.put( pipelineCursor, "WxCloud_Password", EnvWxCloud_Password );
		} else {
			IDataUtil.put( pipelineCursor, "WxCloud_Password", WxCloud_Password );
		}
		
		String EnvWxCloud_AccountName = System.getenv("WxCloud_AccountName");
		if (EnvWxCloud_AccountName != null) {
			IDataUtil.put( pipelineCursor, "WxCloud_AccountName", EnvWxCloud_AccountName );
		} else {
			IDataUtil.put( pipelineCursor, "WxCloud_AccountName", WxCloud_AccountName );
		}
		
		String EnvWxCloud_RunAsUser = System.getenv("WxCloud_RunAsUser");
		if (EnvWxCloud_RunAsUser != null) {
			IDataUtil.put( pipelineCursor, "WxCloud_RunAsUser", EnvWxCloud_RunAsUser );
		} else {
			IDataUtil.put( pipelineCursor, "WxCloud_RunAsUser", WxCloud_RunAsUser );
		}
		
		pipelineCursor.destroy();
		// --- <<IS-END>> ---

                
	}
}

