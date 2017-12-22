package dm.biz;

import java.util.List;

import dm.Dao.BuildingDao;
import dm.po.Building;

public class BuildingBizImpl implements BuildingBiz{
	//引入Dao
	BuildingDao bdao = new BuildingDao();

	
	public boolean add(Building b) {
		String sql = "insert into Building values(?,?,?)";
		//params中的参数是按顺序逐个给？赋值，因此需要注意数据表顺序
		Object[] params = {b.getBno(), b.getBblock(), b.getBtime()};
		return bdao.update(sql, params);
	}


	public boolean delete(int Bno) {

		String sql = "delete from Building where Bno = ?";
		Object[] params = {Bno};
		return bdao.update(sql, params);
		}


	public boolean update(Building b) {
		String sql = "update Building set Bblock = ?, Btime = ? where Bno = ?";
		Object[] params = {b.getBblock(), b.getBtime(),b.getBno()};
		return bdao.update(sql, params);
	}


	public List<Building> findAll() {
		String sql = "select * from Building";
		return bdao.query(sql, Building.class);
	}
		
	public List<Building> findByCondition(String condition) {
		String sql = "select * from Building and concat(Bno, Bblock, Btime) like ?";
		Object[] params = {"%"+condition+"%"};
		return bdao.query(sql, Building.class, params);
	}


	@Override
	public Building findById(int Bno) {
		String sql = "select * from Building where Bno = ?";
		Object[] params = {Bno};
		return (Building) bdao.get(sql, Building.class, params);
	}
}
