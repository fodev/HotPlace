package com.place.dao;

import java.util.ArrayList;
import java.util.List;

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

				int result=pstmt.executeUpdate();//�����͸� �ִ� �۾�
				if(result!=1){
					throw new Exception();//ȸ�������� �߸��Ǹ� ���� �߻� .
				}


			}
		}.executeJob();
	}

	public void deleteUser(){}
	public void selectUser() throws Exception{		
		String query = "select sysdate from dual";
		//List<UserDomain> list =new ArrayList<>();
		new AbstractExecutor() {

			@Override
			protected void execute() throws Exception {

				pstmt = con.prepareStatement(query);

				rs=pstmt.executeQuery();
				while(rs.next()){
					System.out.println(rs.getString(1));
				}
			}
		}.executeJob();
		//return list;
	}


	public void updateUser(){}
}
