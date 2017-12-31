package dm.biz;

import java.util.List;

import dm.vo.DT;

public interface DTBiz {
	public boolean add(DT d);

	public boolean delete(String Bno, String Tno);


	public DT findByBno(String Bno);
        
        public DT findByTno(String Tno);

	public List<DT> findAll();

	public List<DT> findByCondition(String condition);

}
