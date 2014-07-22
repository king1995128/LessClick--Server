package com.lessclick.model;

import com.lessclick.utility.LoginMessage;

public class UserJudge {
	
	public LoginMessage judgeuser(String username,String password){
		if(username.equals("test")&&password.equals("1")){
			return LoginMessage.buyer;
		}else{
			return LoginMessage.fail;
		}
		
	}

}
