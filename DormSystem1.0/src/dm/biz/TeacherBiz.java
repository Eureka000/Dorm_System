package dm.biz;

import java.util.List;

import dm.po.Teacher;

public interface TeacherBiz {
	// 1 ������ʦ
	public boolean add(Teacher t);
	
	// 2 ɾ����ʦ
	public boolean delete(String tno);
	
	// 3 �޸���ʦ
	public boolean update(Teacher t);
	
	// 4����ѧ�Ų�����ʦ
	public Teacher findById(String tno);
	
	// 5 ��ѯ����
	public List<Teacher> findAll();
	
	// 6 ģ����ѯ
	public List<Teacher> findByCondition(String condition);
}
