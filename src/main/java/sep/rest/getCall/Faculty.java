package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "faculty")
public class Faculty {

	@Id
	private String facid;
	
	@Column(name = "facname")
	private String facname;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "disid")
	private String disid;

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
