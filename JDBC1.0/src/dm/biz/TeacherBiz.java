package dm.biz;

import java.util.List;

import dm.po.Teacher;

public interface TeacherBiz {
	// 1 ���ӹ�����ʦ
	public boolean add(Teacher t);

	// 2 ɾ��������ʦ
	public boolean delete(int Tno);

	// 3 �޸Ĺ�����ʦ
	public boolean update(Teacher t);

	// 4����ѧ�Ų��ҹ�����ʦ
	public Teacher findById(int Tno);

	// 5 ��ѯ����
	public List<Teacher> findAll();

	// 6 ģ����ѯ
	public List<Teacher> findByCondition(String condition);
}
