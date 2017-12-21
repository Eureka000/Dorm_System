package dm.biz;

import java.sql.Date;
import java.util.List;

import dm.vo.*;

public interface CurfewBiz {
	public boolean add(Curfew c);

	public boolean delete(Curfew c);

	// 3 修改财产
	public boolean update(Curfew c);

	// 4
	public Curfew findById(Curfew c);


	public List<Curfew> findAll();

	// 6 模糊查询
	public List<Curfew> findByCondition(String condition);

}
