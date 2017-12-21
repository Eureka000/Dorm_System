package dm.biz;

import java.util.List;

import dm.po.Asset;

public interface AssetBiz {
	// 1 增加学生
	public boolean add(Asset a);

	// 2 删除学生
	public boolean delete(String ano);

	// 3 修改学生
	public boolean update(Asset a);

	// 4根据学号查找学生
	public Asset findById(String ano);

	// 5 查询所有
	public List<Asset> findAll();

	// 6 模糊查询
	public List<Asset> findByCondition(String condition);

}