package dm.biz;

import java.util.List;

import dm.Dao.StudentDao;
import dm.po.Student;

public class StudentBizImpl implements StudentBiz {
	//引入Dao
	StudentDao sdao = new StudentDao();

	
	public boolean add(Student s) {
		String sql = "insert into Student values(?,?,?,?,?)";
		//params中的参数是按顺序逐个给？赋值，因此需要注意数据表顺序
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
