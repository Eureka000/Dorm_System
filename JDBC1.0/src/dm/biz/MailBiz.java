package dm.biz;

import java.util.List;

import dm.po.Mail;

public interface MailBiz {
	// 1 ���ӿ��
	public boolean add(Mail m);
	
	// 2 ɾ�����
	public boolean delete(String mno);
	
	// 3 �޸Ŀ��
	public boolean update(Mail m);
	
	// 4����ѧ�Ų��ҿ��
	public Mail findBySid(String sno);
	
	// 4���ݿ���Ų��ҿ��
	public Mail findByMid(String mno);
	
	// 5 ��ѯ����
	public List<Mail> findAll();
	
	// 6 ģ����ѯ
	public List<Mail> findByCondition(String condition);
}
