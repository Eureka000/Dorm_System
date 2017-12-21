package dm.biz;

import java.util.List;

import dm.po.Asset;

public interface AssetBiz {
	// 1 增加财产
	public boolean add(Asset a);

	// 2 删除财产
	public boolean delete(String Ano);

	// 3 修改财产
	public boolean update(Asset a);

	// 4根据学号查找财产
	public Asset findById(String Ano);

	// 5 查询所有
	public List<Asset> findAll();

	// 6 模糊查询
	public List<Asset> findByCondition(String condition);

}