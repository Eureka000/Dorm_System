package dm.biz;

import java.util.List;

import dm.po.Student;

public interface StudentBiz {
	// 1 增加学生
	public boolean add(Student s);
	
	// 2 删除学生
	public boolean delete(String sno);
	
	// 3 修改学生
	public boolean update(Student s);
	
	// 4根据学号查找学生
	public Student findById(String sno);
	
	// 5 查询所有
	public List<Student> findAll();
	
	// 6 模糊查询
	public List<Student> findByCondition(String condition);
}
