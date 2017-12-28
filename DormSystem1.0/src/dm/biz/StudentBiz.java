package dm.biz;

import java.util.List;

import dm.po.Student;

public interface StudentBiz {

	public boolean add(Student s);
	
	public boolean delete(String sno);
	
	public boolean update(Student s);

	public Student findById(String sno);
        
        public boolean findStudent(String sno);
        
	public List<Student> findBySname(String Sname);
        
        public List<Student> findBySsex(String Ssex);
        
        public List<Student> findBySgrade(String Sgrade);
        
        public List<Student> findBySdept(String Sdept);

	public List<Student> findAll();
	
        

	public List<Student> findByCondition(String condition);
}
