package dm.biz;

import java.util.List;

import dm.po.Building;

public interface BuildingBiz {  
	// 1 增加宿舍楼
	public boolean add(Building b);

	// 2 删除宿舍楼
	public boolean delete(int Bno);

	// 3 修改宿舍楼
	public boolean update(Building b);

	// 4根据学号查找宿舍楼
	public Building findById(int Bno);

	// 5 查询所有
	public List<Building> findAll();

	// 6 模糊查询
	public List<Building> findByCondition(String condition);
}
