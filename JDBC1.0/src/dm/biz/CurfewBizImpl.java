package dm.biz;

import java.util.Date;
import java.util.List;

import dm.dao.*;
import dm.vo.Curfew;

public class CurfewBizImpl implements CurfewBiz {
	CurfewDao cdao = new CurfewDao();

	
	public boolean add(Curfew c) {
		String sql = "insert into Curfew values(?,?,?,?,?)"; //�޸�8

		Object[] params = {c.getSno(), c.getNightTime(), c.getNightReason(),c.getTno()}; //�޸�9
		return cdao.update(sql, params);
	}


	public boolean delete(String Sno,String Tno,Date NightTime) {

		String sql = "delete from Curfew where Sno = ? AND Tno = ? AND NightTime = ?";
		Object[] params = {Sno,Tno,NightTime};
		return cdao.update(sql, params);
		}


	public Curfew findById(String Sno) {
		String sql = "select * from Curfew where Sno = ?";
		Object[] params = {Sno};
		return (Curfew) cdao.get(sql, Curfew.class, params);
	}

	public List<Curfew> findAll() {
		String sql = "select * from Curfew";
		return cdao.query(sql, Curfew.class);
	}
		
	public List<Curfew> findByCondition(String condition) {
		String sql = "select * from Curfew and concat(Sno,NightTime,NightReason,Tno) like ?";
		Object[] params = {"%"+condition+"%"};
		return cdao.query(sql, Curfew.class, params);
	}
}
