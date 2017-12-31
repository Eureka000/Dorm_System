package dm.biz;

import java.util.List;

import dm.dao.SDDao;
import dm.vo.SD;

public class SDBizImpl implements SDBiz {
	SDDao sdao = new SDDao();
	public boolean add(SD s)
	{		
		String sql = "insert into DA values(?,?,?)";

		Object[] params = {s.getSno(), s.getDno(),s.getScin()};
		return sdao.update(sql, params);
		
	}

	public boolean delete(String Sno, String Dno)
	{
		String sql = "delete from DA where Sno = ? AND Dno = ?";
		Object[] params = {Sno,Dno};
		return sdao.update(sql, params);
	}

	public SD findById(String Sno)
	{
		String sql = "select * from SD where Sno = ?";
		Object[] params = {Sno};
		return (SD) sdao.get(sql, SD.class, params);
	}
        
        public SD findByStuId(String Sno)
        {
            String sql = "select * from SD where Sno = ?";
		Object[] params = {Sno};
		return (SD) sdao.get(sql, SD.class, params);
        }

	public List<SD> findAll()
	{
		String sql = "select * from SD";
		return sdao.query(sql, SD.class);
	}

	public List<SD> findByCondition(String condition)
	{
		String sql = "select * from SD and concat(Sno,Dno,Scin) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, SD.class, params);
	}

    @Override
    public boolean update(SD s) {
        String sql = "update SD set Dno = ?, Scin = ? where Sno = ?";
        Object[] params = {s.getDno(),s.getScin(),s.getSno()};
        return sdao.update(sql, params);
    }
}
