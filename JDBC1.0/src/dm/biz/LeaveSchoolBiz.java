package dm.biz;

import java.util.Date;
import java.util.List;

import dm.po.Dormitory;
import dm.po.LeaveSchool;

public interface LeaveSchoolBiz {
	// 1 ������У��Ϣ
	public boolean add(LeaveSchool ls);
	
	// 2 ɾ����У��Ϣ
	public boolean delete(String dno, Date Sltime, Date Sreturn);
	
	
	// 4����ѧ�Ų���ĳѧ������У��Ϣ
	public LeaveSchool findById(String sno);
	
	// 5 ��ѯ����
	public List<LeaveSchool> findAll();
	
	// 6 ģ����ѯ
	public List<LeaveSchool> findByCondition(String condition);
}
