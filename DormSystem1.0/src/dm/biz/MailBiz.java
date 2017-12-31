package dm.biz;

import java.util.List;

import dm.po.Mail;
import dm.po.MailCount;

public interface MailBiz {

	public boolean add(Mail m);
	

	public boolean delete(String mno);
	

	public boolean update(Mail m);

	public List<Mail> findBySid(String sno);

	public List<Mail> findByMid(String mno);
	
	public List<Mail> findAll();
	
	public List<Mail> findByCondition(String condition);
        
        public List<Mail> findBySidTimeAll(String sno, String st, String ed);
        
        public List<Mail> findBySidTimeAr(String sno, String st, String ed);
        
        public List<Mail> findBySidTimeAc(String sno, String st, String ed);
        public List<MailCount> findBySidCount ();
        
        public boolean findBySno(String sno);
        
        public boolean deleteBySno(String sno);

}
