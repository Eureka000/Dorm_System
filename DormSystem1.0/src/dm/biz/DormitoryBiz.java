package dm.biz;

import java.util.List;

import dm.po.Dormitory;



public interface DormitoryBiz {
	// 1 ��������¥
	public boolean add(Dormitory d);
	
	// 2 ɾ������¥
	public boolean delete(String dno);
	
	// 3 �޸�����¥
	public boolean update(Dormitory d);
	
	// 4��������Ų�������¥
	public Dormitory findById(String dno);
	
	// 5 ��ѯ����
	public List<Dormitory> findAll();
	
	// 6 ģ����ѯ
	public List<Dormitory> findByCondition(String condition);
}
