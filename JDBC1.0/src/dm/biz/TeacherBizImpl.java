package dm.biz;

import java.util.List;

import dm.Dao.TeacherDao;
import dm.po.Teacher;

<<<<<<< HEAD
=======

>>>>>>> a86ed3f9aba6721054789a53a309665c7e0164c4
public class TeacherBizImpl implements TeacherBiz{
	//引入Dao
	TeacherDao sdao = new TeacherDao();

	
	public boolean add(Teacher t) {
		String sql = "insert into Teacher values(?,?,?)";
		//params中的参数是按顺序逐个给？赋值，因此需要注意数据表顺序
		Object[] params = {t.getTno(), t.getTname(), t.getTsex()};
		return sdao.update(sql, params);
	}


	public boolean delete(String tno) {

		String sql = "delete from Teacher where Tno = ?";
		Object[] params = {tno};
		return sdao.update(sql, params);
		}


	public boolean update(Teacher t) {
		String sql = "update Teacher set Tname = ?, Tsex = ? where Tno = ?";
<<<<<<< HEAD
		Object[] params = {t.getTname(), t.getTsex(), t.getTno()};
		return sdao.update(sql, params);
=======
		Object[] params = {t.getTname(), t.getTsex(),t.getTno()};
		return tdao.update(sql, params);
	}

	public Teacher findById(int Tno) {
		String sql = "select * from Teacher where Tno = ?";
		Object[] params = {Tno};
		return (Teacher) tdao.get(sql, Teacher.class, params);
>>>>>>> a86ed3f9aba6721054789a53a309665c7e0164c4
	}

	public List<Teacher> findAll() {
		String sql = "select * from Teacher";
		return sdao.query(sql, Teacher.class);
	}
		
	public List<Teacher> findByCondition(String condition) {
		String sql = "select * from Teacher and concat(Tno, Tname, Tsex) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, Teacher.class, params);
	}


	@Override
	public Teacher findById(String tno) {
		String sql = "select * from Teacher where Tno = ?";
		Object[] params = {tno};
		return (Teacher) sdao.get(sql, Teacher.class, params);
	}
}
