package dm.biz;

import java.util.List;

import dm.vo.*;

public interface DABiz {
	public boolean add(DA d);

	public boolean delete(DA d);

	public boolean update(DA d);

	public DA findById(DA d);

	public List<DA> findAll();

	public List<DA> findByCondition(String condition);

}
