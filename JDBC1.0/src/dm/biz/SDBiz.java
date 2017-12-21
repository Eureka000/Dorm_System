package dm.biz;

import java.util.List;

import dm.vo.SD;

public interface SDBiz {
	public boolean add(SD s);

	public boolean delete(SD s);

	public boolean update(SD s);

	public SD findById(SD s);

	public List<SD> findAll();

	public List<SD> findByCondition(String condition);

}
