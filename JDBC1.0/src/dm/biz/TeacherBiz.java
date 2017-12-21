package dm.biz;

import java.util.List;

import dm.po.*;

public interface TeacherBiz {
	public boolean add(Teacher t);

	public boolean delete(Teacher t);

	public boolean update(Teacher t);

	public Teacher findById(Teacher t);

	public List<Teacher> findAll();

	public List<Teacher> findByCondition(String condition);

}
