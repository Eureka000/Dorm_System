package dm.view;

import java.util.Scanner;

import dm.biz.StudentBizImpl;
import dm.po.Student;

public class Dorm_Manager {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StudentBizImpl sbiz = new StudentBizImpl();
		
		System.out.println("连接成功！");
		System.out.println("输入要插入的学生学号 姓名 性别 年级 院系：");

		String Sno = sc.next();
	    String Sname = sc.next();
	    String Ssex = sc.next();
		Integer Sgrade = sc.nextInt();
	    String Sdept = sc.next();
	    Student s = new Student(Sno, Sname, Ssex, Sgrade, Sdept);
	    
	    sbiz.add(s);
	    
	    System.out.println("添加成功！");
	}
}
