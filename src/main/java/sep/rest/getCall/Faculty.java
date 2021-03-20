package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {

	private String facid;
	private String facname;
	private int status;
	private String disid;

	@Id
	public String getFacid() {
		return facid;
	}

	public void setFacid(String facid) {
		this.facid = facid;
	}

	public String getFacname() {
		return facname;
	}

	public void setFacname(String facname) {
		this.facname = facname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDisid() {
		return disid;
	}

	public void setDisid(String disid) {
		this.disid = disid;
	}

	public Faculty(String facid, String facname, int status, String disid) {
		super();
		this.facid = facid;
		this.facname = facname;
		this.status = status;
		this.disid = disid;
	}

	public Faculty() {
		super();

	}

}
