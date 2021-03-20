package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {

	private String disid;
	private String disname;
	
	@Id
	public String getDisid() {
		return disid;
	}

	public void setDisid(String disid) {
		this.disid = disid;
	}

	public String getDisname() {
		return disname;
	}

	public void setDisname(String disname) {
		this.disname = disname;
	}

	public District(String disid, String disname) {
		super();
		this.disid = disid;
		this.disname = disname;
	}

	public District() {
		super();

	}

}
