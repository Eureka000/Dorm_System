package dm.biz;

import java.sql.Date;
import java.util.List;

import dm.po.Dormitory;
import dm.po.LeaveSchool;

public interface LeaveSchoolBiz {

	public boolean add(LeaveSchool ls);
	
	public boolean delete(String Sno, java.sql.Date Sltime);
        
        public boolean update(String Sno, java.sql.Date Sltime,java.sql.Date Sreturn);
	
	public LeaveSchool findById(String sno);

	public List<LeaveSchool> findAll();
	
	public List<LeaveSchool> findByCondition(String condition);
}
