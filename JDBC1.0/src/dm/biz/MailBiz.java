package dm.biz;

import java.util.List;

import dm.po.Mail;

public interface MailBiz {
	// 1 增加快件
	public boolean add(Mail m);
	
	// 2 删除快件
	public boolean delete(String mno);
	
	// 3 修改快件
	public boolean update(Mail m);
	
	// 4根据学号查找快件
	public Mail findBySid(String sno);
	
	// 4根据快件号查找快件
	public Mail findByMid(String mno);
	
	// 5 查询所有
	public List<Mail> findAll();
	
	// 6 模糊查询
	public List<Mail> findByCondition(String condition);
}
