package dm.biz;

import java.util.List;

import dm.Dao.StudentDao;
import dm.po.Student;

<<<<<<< HEAD
public class StudentBizImpl implements StudentBiz {
=======
public class StudentBizImpl implements StudentBiz{
>>>>>>> a86ed3f9aba6721054789a53a309665c7e0164c4
	//����Dao
	StudentDao sdao = new StudentDao();

	
	public boolean add(Student s) {
		String sql = "insert into Student values(?,?,?,?,?)";
		//params�еĲ����ǰ�˳�����������ֵ�������Ҫע�����ݱ�˳��
		Object[] params = {s.getSno(), s.getSname(), s.getSsex(), s.getSgrade(), s.getSdept()};
		return sdao.update(sql, params);
	}


	public boolean delete(String Sno) {

		String sql = "delete from Student where Sno = ?";
		Object[] params = {Sno};
		return sdao.update(sql, params);
		}


	public boolean update(Student s) {
		String sql = "update Student set Sname = ?, Ssex = ?, Sgrade = ?, Sdept = ? where Sno = ?";
		Object[] params = {s.getSname(), s.getSsex(), s.getSgrade(), s.getSdept(), s.getSno()};
		return sdao.update(sql, params);
	}

<<<<<<< HEAD
=======
	public Student findById(String Sno) {
		String sql = "select * from Student where Sno = ?";
		Object[] params = {Sno};
		return (Student) sdao.get(sql, Student.class, params);
	}
>>>>>>> a86ed3f9aba6721054789a53a309665c7e0164c4

	public List<Student> findAll() {
		String sql = "select * from Student";
		return sdao.query(sql, Student.class);
	}
		
	public List<Student> findByCondition(String condition) {
		String sql = "select * from Student and concat(Sno, Sname, Ssex, Sdept) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, Student.class, params);
	}


	@Override
	public Student findById(String sno) {
		String sql = "select * from Student where Sno = ?";
		Object[] params = {sno};
		return (Student) sdao.get(sql, Student.class, params);
	}

}
