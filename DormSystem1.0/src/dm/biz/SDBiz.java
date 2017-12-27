package dm.biz;

import java.util.List;

import dm.vo.SD;

public interface SDBiz {
	public boolean add(SD s);

	public boolean delete(String Sno, String Dno);

<<<<<<< HEAD
	public SD findById(String Sno);
=======
        public boolean update(SD s);
        
	public SD findById(String Dno);
>>>>>>> a1e7bf7ae2b29e2bfdbc530b622b3769d9bff5e3

	public List<SD> findAll();

	public List<SD> findByCondition(String condition);

}
