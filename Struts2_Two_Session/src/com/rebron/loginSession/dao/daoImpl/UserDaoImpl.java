package com.rebron.loginSession.dao.daoImpl;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rebron.loginSession.dao.UserDao;
import com.rebron.loginSession.domain.User;
import com.rebron.loginSession.utils.JDBCUtil;


public class UserDaoImpl implements UserDao {

	/**
	 * 实现登录方法
	 */
	public User login(User user) throws Exception {			
		User user2 = new User();				
		String sql = "SELECT uid,userName,passWord FROM tb_user WHERE userName=? and passWord=?";
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,user.getUserName());
		pst.setString(2, user.getPassWord());
		ResultSet rs = pst.executeQuery();		
		if(rs.next()) {			
			user2.setUid(rs.getInt("uid"));
			user2.setUserName(rs.getString("userName"));
			user2.setPassWord(rs.getString("passWord"));						
		}
		JDBCUtil.closeResource(con, pst, null, rs);		
		return user2;
	}

	/**
	 * 查询所有用户信息
	 */
	public List<User> searchUserAll() throws Exception {
		List<User> list =new ArrayList<>();
		User user;
		String sql = "SELECT uid,userName,passWord FROM tb_user";
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();	
		while(rs.next()) {
			user = new User();
			user.setUid(rs.getInt("uid"));
			user.setUserName(rs.getString("userName"));
			user.setPassWord(rs.getString("passWord"));
			list.add(user);
		}
		return list;
	}

}
