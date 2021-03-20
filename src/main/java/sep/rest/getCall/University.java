package sep.rest.getCall;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {

	private String unid;
	private String uniname;
	private String ranklocal;
	private String rankworld;
	private String image;
	private int status;
	
	@Id
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
