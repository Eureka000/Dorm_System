package dm.biz;

import java.util.Date;
import java.util.List;

import dm.vo.*;

public interface CurfewBiz {
	public boolean add(Curfew c);

	public boolean delete(String Sno,String Tno,Date NightTime);

	

	public Curfew findBySId(String Sno);


	public List<Curfew> findAll();

	// 6 模糊查询
	public List<Curfew> findByCondition(String condition);

}
