package dm.biz;

import java.util.List;

import dm.po.*;

public interface LeaveSchoolBiz {
	public boolean add(LeaveSchool ls);

	public boolean delete(LeaveSchool ls);

	public boolean update(LeaveSchool ls);

	public LeaveSchool findById(LeaveSchool ls);

	public List<LeaveSchool> findAll();

	public List<LeaveSchool> findByCondition(String condition);

}
