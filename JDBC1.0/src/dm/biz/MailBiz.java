package dm.biz;

import java.util.List;

import dm.po.*;

public interface MailBiz {
	public boolean add(Mail m);

	public boolean delete(Mail m);

	public boolean update(Mail m);

	public Mail findById(Mail m);

	public List<Mail> findAll();

	public List<Mail> findByCondition(String condition);

}
