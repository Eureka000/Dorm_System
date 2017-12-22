package dm.biz;

import java.util.List;

import dm.po.Teacher;

public interface TeacherBiz {
	// 1 增加老师
	public boolean add(Teacher t);
	
	// 2 删除老师
	public boolean delete(String tno);
	
	// 3 修改老师
	public boolean update(Teacher t);
	
	// 4根据学号查找老师
	public Teacher findById(String tno);
	
	// 5 查询所有
	public List<Teacher> findAll();
	
	// 6 模糊查询
	public List<Teacher> findByCondition(String condition);
}
