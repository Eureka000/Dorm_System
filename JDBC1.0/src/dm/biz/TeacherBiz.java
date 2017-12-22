package dm.biz;

import java.util.List;

import dm.po.Teacher;

public interface TeacherBiz {
	// 1 增加管理老师
	public boolean add(Teacher t);

	// 2 删除管理老师
	public boolean delete(int Tno);

	// 3 修改管理老师
	public boolean update(Teacher t);

	// 4根据学号查找管理老师
	public Teacher findById(int Tno);

	// 5 查询所有
	public List<Teacher> findAll();

	// 6 模糊查询
	public List<Teacher> findByCondition(String condition);
}
