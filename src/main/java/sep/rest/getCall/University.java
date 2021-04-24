package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name = "university")
public class University {

	@Id
	private String unid;
	
	@Column(name = "uniname")
	private String uniname;
	
	@Column(name = "ranklocal")
	private String ranklocal;
	
	@Column(name = "rankworld")
	private String rankworld;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "status")
	private int status;
	
	public String getUnid() {
		return unid;
	}

	public void setUnid(String unid) {
		this.unid = unid;
	}

	public String getUniname() {
		return uniname;
	}

	public void setUniname(String uniname) {
		this.uniname = uniname;
	}

	public String getRanklocal() {
		return ranklocal;
	}

	public void setRanklocal(String ranklocal) {
		this.ranklocal = ranklocal;
	}

	public String getRankworld() {
		return rankworld;
	}

	public void setRankworld(String rankworld) {
		this.rankworld = rankworld;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public University(String unid, String uniname, String ranklocal, String rankworld, String image, int status) {
		super();
		this.unid = unid;
		this.uniname = uniname;
		this.ranklocal = ranklocal;
		this.rankworld = rankworld;
		this.image = image;
		this.status = status;
	}

	public University() {
		super();

	}

}
