package com.place.dao;

import com.place.domain.UserDomain;

public class UserDao {
	
	public void insertUser(UserDomain user) throws Exception{

		String query = "insert into user16.tbl_user(PK_USERID, USERPW, USERNAME, GENDER) values (?, ? ,? ,?)";
		new AbstractExecutor() {
		
			@Override
			protected void execute() throws Exception {
				
				pstmt = con.prepareStatement(query);
				int idx=1;
				pstmt.setString(idx++, user.getUserId());
				pstmt.setString(idx++, user.getPwd());
				pstmt.setString(idx++, user.getName());
				pstmt.setString(idx++, user.getGender());
				
				int result=pstmt.executeUpdate();//데이터를 넣는 작업
				if(result!=1){
					throw new Exception();//회원가입이 잘못되면 예외 발생 .
				}
				
			
			}
		}.executeJob();
	}
	
	public void deleteUser(){}
	public void selectUser(){}
	
	
	public void updateUser(){}
}
