package feedback;

import java.util.HashMap;

public class idpass {
	HashMap<String,String> login = new HashMap<String,String>();
	idpass()
	{
		login.put("717821e202", "AJAY");
	}
	protected HashMap getLoginInfo()
	{
		return login;
	}
}
