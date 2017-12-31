package dm.biz;

import java.util.List;

import dm.po.Building;

public interface BuildingBiz {  

	public boolean add(Building b);


	public boolean delete(String Bno);


	public boolean update(Building b);


	public Building findById(String Bno);


	public List<Building> findAll();


	public List<Building> findByCondition(String condition);
}
