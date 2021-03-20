package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseDetails {

	private String courseid;
	private String description;
	private float coursefees;
	private String posturl;
	private int status;
	private String unid;
	private String facid;
	private String userid;

	@Id
	public String getCourseid() {
		return courseid;
	}

	public void setCourseid(String courseid) {
		this.courseid = courseid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getCoursefees() {
		return coursefees;
	}

	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}

	public String getPosturl() {
		return posturl;
	}

	public void setPosturl(String posturl) {
		this.posturl = posturl;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public String getFacid() {
		return facid;
	}

	public void setFacid(String facid) {
		this.facid = facid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public CourseDetails(String courseid, String description, float coursefees, String posturl, int status, String unid,
			String facid, String userid) {
		super();
		this.courseid = courseid;
		this.description = description;
		this.coursefees = coursefees;
		this.posturl = posturl;
		this.status = status;
		this.unid = unid;
		this.facid = facid;
		this.userid = userid;
	}

	public CourseDetails() {
		super();

	}

}
