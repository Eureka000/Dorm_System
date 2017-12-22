package dm.biz;

import java.util.Date;
import java.util.List;

import dm.Dao.LeaveSchoolDao;
import dm.po.Asset;
import dm.po.LeaveSchool;

public class LeaveSchoolBizImpl implements LeaveSchoolBiz {
	//引入Dao
	LeaveSchoolDao sdao = new LeaveSchoolDao();

	
	public boolean add(LeaveSchool ls) {
		String sql = "insert into LeaveSchool values(?,?,?)";
		//params中的参数是按顺序逐个给？赋值，因此需要注意数据表顺序
		Object[] params = {ls.getSno(), ls.getSltime(), ls.getSreturn()};
		return sdao.update(sql, params);
	}


	public boolean delete(String dno, Date Sltime, Date Sreturn) {

		String sql = "delete from LeaveSchool where Sno = ? and Sltime = ? and Sreturn = ?";
		Object[] params = {dno, Sltime, Sreturn};
		return sdao.update(sql, params);
		}

	public List<LeaveSchool> findAll() {
		String sql = "select * from LeaveSchool";
		return sdao.query(sql, LeaveSchool.class);
	}
		
	public List<LeaveSchool> findByCondition(String condition) {
		String sql = "select * from LeaveSchool and concat(Sno, Sltime, Sreturn) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, LeaveSchool.class, params);
	}


	public LeaveSchool findById (String sno) {
		String sql = "select * from LeaveSchool where Sno = ?";
		Object[] params = {sno};
		return (LeaveSchool) sdao.get(sql, Asset.class, params);
	}
}
