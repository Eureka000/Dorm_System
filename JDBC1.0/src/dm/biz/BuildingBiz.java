package dm.biz;

import java.util.List;

import dm.po.Building;

public interface BuildingBiz {  
	// 1 ��������¥
	public boolean add(Building b);

	// 2 ɾ������¥
	public boolean delete(int Bno);

	// 3 �޸�����¥
	public boolean update(Building b);

	// 4����ѧ�Ų�������¥
	public Building findById(int Bno);

	// 5 ��ѯ����
	public List<Building> findAll();

	// 6 ģ����ѯ
	public List<Building> findByCondition(String condition);
}
