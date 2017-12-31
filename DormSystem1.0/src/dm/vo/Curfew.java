package dm.vo;

import java.util.Date;

public class Curfew {
	private String Sno;
	private Date NightTime;
	private String NightReason;
	private String Tno;
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public Date getNightTime() {
		return NightTime;
	}
	public void setNightTime(Date nightTime) {
		NightTime = nightTime;
	}
	public String getNightReason() {
		return NightReason;
	}
	public void setNightReason(String nightReason) {
		NightReason = nightReason;
	}
	public String getTno() {
		return Tno;
	}
	public void setTno(String tno) {
		Tno = tno;
	}
	public Curfew() {
		super();
	}
	public Curfew(String sno, Date nightTime, String nightReason, String tno) {
		super();
		Sno = sno;
		NightTime = nightTime;
		NightReason = nightReason;
		Tno = tno;
	}
}
