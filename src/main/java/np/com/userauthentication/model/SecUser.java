package np.com.userauthentication.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class SecUser extends AbstractPersistable<Long>{

	private String userId;
	private String userName;
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "sec_role_id")
	private SecRole secRole;
	
	public SecRole getSecRole() {
		return secRole;
	}

	public void setSecRole(SecRole secRole) {
		this.secRole = secRole;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
