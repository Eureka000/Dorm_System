package dm.biz;

import java.util.List;

import dm.po.*;

public interface DormitaryBiz {
	public boolean add(Dormitory d);

	public boolean delete(Dormitory d);

	public boolean update(Dormitory d);

	public Dormitory findById(Dormitory d);

	public List<Dormitory> findAll();

	public List<Dormitory> findByCondition(String condition);

}
