package com.rebron.loginSession.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.rebron.loginSession.dao.MessageDao;
import com.rebron.loginSession.domain.Message;
import com.rebron.loginSession.domain.User;
import com.rebron.loginSession.utils.JDBCUtil;

public class MessageDaoImpl implements MessageDao {

	/**
	 * 实现发帖功能
	 */
	public boolean addPost(User user,Message message) throws Exception {
		boolean flag = false;					
		String sql = "INSERT INTO tb_message(uid,mtitle,mPost,writerDate) VALUES(?,?,?,default)";
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, user.getUid());
		pst.setString(2,message.getMtitle());
		pst.setString(3, message.getMpost());
		//pst.setDate(4, (Date) message.getWriterDate());		
		int num = pst.executeUpdate();
		if(num == 1) {
			flag = true;
		}else {
			flag = false;
		}
		JDBCUtil.closeResource(con, pst, null, null);		
		return flag;
	}

	/**
	 * 通过当前用户id查看用户所有发的帖子
	 */
	public List<Object> showMyPostById(User user) throws Exception {
		//User user2 = new User();
		Message Message = new Message();
		ArrayList<Object> messageList = new ArrayList<>();
		String sql = "SELECT mtitle,mpost,writerDate FROM tb_message where uid=?";
		Connection con = JDBCUtil.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, user.getUid());
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {			
			Message.setMtitle(rs.getString("mtitle"));
			Message.setMpost(rs.getString("mpost"));
			Message.setWriterDate(rs.getDate("writerDate"));
			messageList.add(Message);
		}
		JDBCUtil.closeResource(con, pst, null, rs);	
		return messageList;
	}

}
