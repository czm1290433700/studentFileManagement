package serviceImpl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.OperationService;
import daoImpl.UserDao;
import entity.User;

public class UserService implements OperationService {
	private UserDao userDao = new UserDao();
	/**
	 * ͨ���ֻ��Ų����Ƿ���ڶ�Ӧ���û�
	 * @param phone �ַ������͵��ֻ���
	 * @return �Ѵ��ڷ����棬�����ڷ��ؼ�
	 */
	public Boolean searchUserByPhone(String phone){
		if((userDao.findObjectByPhone(phone)).isEmpty()){
			return false;
		}else{
			return true;
		}
	}
	@Override
	/**
	 * ����user��¼�����ݿ�
	 * ������user����
	 * ����ֵ�����ӳɹ������棬����ʧ�ܷ��ؼ�
	 */
	public Boolean add(Object o) {
		User user = (User)o;
		if(userDao.addObject(user)){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean modify(Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	public User findUserByPhone(String phone) {
		List<User> list = (List<User>)userDao.findObjectByPhone(phone);	
		return list.get(0);
	}
	/**
	 * ���ݵ绰��������û����
	 * @param phone
	 * @return �����û����
	 */
	public int findUserIdByPhone(String phone) {
		return 0;
		//return userDao.findUserIdByPhone(phone);
	}

}