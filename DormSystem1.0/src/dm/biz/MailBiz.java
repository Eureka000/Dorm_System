package dm.biz;

import java.util.List;

import dm.po.Mail;

public interface MailBiz {

	public boolean add(Mail m);
	

	public boolean delete(String mno);
	

	public boolean update(Mail m);

	public Mail findBySid(String sno);

	public Mail findByMid(String mno);
	

	public List<Mail> findAll();
	

	public List<Mail> findByCondition(String condition);
}
