package dm.biz;

import java.util.List;

import dm.po.Student;

public interface StudentBiz {
	// 1 ����ѧ��
	public boolean add(Student s);
	
	// 2 ɾ��ѧ��
	public boolean delete(String sno);
	
	// 3 �޸�ѧ��
	public boolean update(Student s);
	
	// 4����ѧ�Ų���ѧ��
	public Student findById(String sno);
	
	// 5 ��ѯ����
	public List<Student> findAll();
	
	// 6 ģ����ѯ
	public List<Student> findByCondition(String condition);
}
