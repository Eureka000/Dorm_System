package dm.view;

import java.util.Scanner;

import dm.biz.StudentBizImpl;
import dm.biz.UserBiz;
import dm.biz.UserBizImpl;
import dm.po.Student;
import dm.po.User;

public class Dorm_Manager {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		UserBiz ubiz = new UserBizImpl();
		System.out.println("请输入用户名和密码：");
		String uno = sc.next();
		String pass = sc.next();
		User u = ubiz.findById(uno);
		if(u==null){
			System.out.println("用户名不存在！");
		}
		else {
			if(u.getPass().trim().equals(pass))
				System.out.println("lalala");
			else{
				
				
			}
		}
	}
}
