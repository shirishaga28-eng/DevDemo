package cse_sjc;

public class App {
	public int userLogin(String in_uaer, String in_pwd)
	{
		ResourcrBundle rb=ResourceBundle("config");
		String userName=rb.getString("username");
		String password=rb.getString("password");
		
		if(in_user.equals(username)&& in_pwd.equals(password))
		return 1;
		else return 0;
	}

}
