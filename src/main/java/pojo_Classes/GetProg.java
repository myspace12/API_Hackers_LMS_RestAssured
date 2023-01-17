package pojo_Classes;

import io.cucumber.messages.TimeConversion;

public class GetProg {
	
	private int progId;
	private String progNm;
	private String progDesc;
	private String progStatue;
	private TimeConversion creationTime;
	private TimeConversion lastModTime;
		
	public int getProgId() {
		return progId;
	}
	public void setProgId(int progId) {
		this.progId = progId;
	}
	public String getProgNm() {
		return progNm;
	}
	public void setProgNm(String progNm) {
		this.progNm = progNm;
	}
	public String getProgDesc() {
		return progDesc;
	}
	public void setProgDesc(String progDesc) {
		this.progDesc = progDesc;
	}
	public String getProgStatue() {
		return progStatue;
	}
	public void setProgStatue(String progStatue) {
		this.progStatue = progStatue;
	}
	public TimeConversion getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(TimeConversion creationTime) {
		this.creationTime = creationTime;
	}
	public TimeConversion getLastModTime() {
		return lastModTime;
	}
	public void setLastModTime(TimeConversion lastModTime) {
		this.lastModTime = lastModTime;
	}

}
