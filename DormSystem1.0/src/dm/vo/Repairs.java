package dm.vo;

import java.sql.Time;

public class Repairs {
	private String Ano;
	private String Dno;
	private Time ReportTime;
	private String ReportReason;
	private Time FixTime;
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	public String getDno() {
		return Dno;
	}
	public void setDno(String dno) {
		Dno = dno;
	}
	public Time getReportTime() {
		return ReportTime;
	}
	public void setReportTime(Time reportTime) {
		ReportTime = reportTime;
	}
	public String getReportReason() {
		return ReportReason;
	}
	public void setReportReason(String reportReason) {
		ReportReason = reportReason;
	}
	public Time getFixTime() {
		return FixTime;
	}
	public void setFixTime(Time fixTime) {
		FixTime = fixTime;
	}
	public Repairs(String ano, String dno, Time reportTime, String reportReason, Time fixTime) {
		super();
		Ano = ano;
		Dno = dno;
		ReportTime = reportTime;
		ReportReason = reportReason;
		FixTime = fixTime;
	}
	public Repairs() {
		super();
	}

}
