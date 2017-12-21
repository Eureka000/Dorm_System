package dm.biz;

import java.util.List;

import dm.po.*;

import dm.vo.*;
public interface RepairsBiz {
	public boolean add(Repairs r);

	public boolean delete(Repairs r);

	public boolean update(Repairs r);

	public Repairs findById(Repairs r);

	public List<Repairs> findAll();

	public List<Repairs> findByCondition(String condition);

}
