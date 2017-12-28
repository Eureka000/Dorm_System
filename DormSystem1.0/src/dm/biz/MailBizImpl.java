package dm.biz;

import java.util.List;

import dm.dao.MailDao;
import dm.po.Mail;

public class MailBizImpl implements MailBiz{

	MailDao sdao = new MailDao();

	
	public boolean add(Mail m) {
		String sql = "insert into Mail values(?,?,?,?)";

		Object[] params = {m.getMno(), m.getSno(), m.getMarrive(), m.getMaccept()};
		return sdao.update(sql, params);
	}


	public boolean delete(String mno) {

		String sql = "delete from Mail where Mno = ?";
		Object[] params = {mno};
		return sdao.update(sql, params);
		}


	public boolean update(Mail m) {
		String sql = "update Mail set Sno = ?, Marrive = ?, Maccept = ? where Mno = ?";
		Object[] params = {m.getSno(), m.getMarrive(), m.getMaccept(), m.getMno()};
		return sdao.update(sql, params);
	}
	
	public List<Mail> findAll() {
		String sql = "select * from Mail";
		return sdao.query(sql, Mail.class);
	}
		
	public List<Mail> findByCondition(String condition) {
		String sql = "select * from Mail and concat(Sno, Sname, Ssex, Sdept) like ?";
		Object[] params = {"%"+condition+"%"};
		return sdao.query(sql, Mail.class, params);
	}

	public Mail findBySid(String sno) {
		String sql = "select * from Mail where Sno = ?";
		Object[] params = {sno};
		return (Mail) sdao.get(sql, Mail.class, params);
	}
	
	public Mail findByMid(String mno) {
		String sql = "select * from Mail where Sno = ?";
		Object[] params = {mno};
		return (Mail) sdao.get(sql, Mail.class, params);
	}

}
