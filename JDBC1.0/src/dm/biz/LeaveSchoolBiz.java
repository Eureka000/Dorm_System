package dm.biz;

import java.util.Date;
import java.util.List;

import dm.po.Dormitory;
import dm.po.LeaveSchool;

public interface LeaveSchoolBiz {
	// 1 增加离校信息
	public boolean add(LeaveSchool ls);
	
	// 2 删除离校信息
	public boolean delete(String dno, Date Sltime, Date Sreturn);
	
	
	// 4根据学号查找某学生的离校信息
	public LeaveSchool findById(String sno);
	
	// 5 查询所有
	public List<LeaveSchool> findAll();
	
	// 6 模糊查询
	public List<LeaveSchool> findByCondition(String condition);
}
