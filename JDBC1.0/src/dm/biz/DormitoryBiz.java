package dm.biz;

import java.util.List;

import dm.po.Dormitory;



public interface DormitoryBiz {
	// 1 增加宿舍楼
	public boolean add(Dormitory d);
	
	// 2 删除宿舍楼
	public boolean delete(String dno);
	
	// 3 修改宿舍楼
	public boolean update(Dormitory d);
	
	// 4根据宿舍号查找宿舍楼
	public Dormitory findById(String dno);
	
	// 5 查询所有
	public List<Dormitory> findAll();
	
	// 6 模糊查询
	public List<Dormitory> findByCondition(String condition);
}
