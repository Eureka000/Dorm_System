package dm.biz;

import java.util.List;

import dm.dao.TeacherDao;
import dm.po.Teacher;


public class TeacherBizImpl {
	//����Dao
	TeacherDao tdao = new TeacherDao();

	
	public boolean add(Teacher t) {
		String sql = "insert into Teacher values(?,?,?)";
		//params�еĲ����ǰ�˳�����������ֵ�������Ҫע�����ݱ�˳��
		Object[] params = {t.getTno(), t.getTname(), t.getTsex()};
		return tdao.update(sql, params);
	}


	public boolean delete(int Tno) {

		String sql = "delete from Teacher where Tno = ?";
		Object[] params = {Tno};
		return tdao.update(sql, params);
		}


	public boolean update(Teacher t) {
		String sql = "update Teacher set Tname = ?, Tsex = ? where Tno = ?";
		Object[] params = {t.getTname(), t.getTsex(),t.getTno()};
		return tdao.update(sql, params);
	}

	public Teacher findByID(int Tno) {
		String sql = "select * from Teacher where Tno = ?";
		Object[] params = {Tno};
		return (Teacher) tdao.get(sql, Teacher.class, params);
	}

	public List<Teacher> findAll() {
		String sql = "select * from Teacher";
		return tdao.query(sql, Teacher.class);
	}
		
	public List<Teacher> findByCondition(String condition) {
		String sql = "select * from Teacher and concat(Tno, Tname, Tsex) like ?";
		Object[] params = {"%"+condition+"%"};
		return tdao.query(sql, Teacher.class, params);
	}
}
