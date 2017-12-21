package dm.biz;

import java.util.List;

import dm.vo.DT;

public interface DTBiz {
	public boolean add(DT d);

	public boolean delete(DT d);

	public boolean update(DT d);

	public DT findById(DT d);

	public List<DT> findAll();

	public List<DT> findByCondition(String condition);

}
