package np.com.userauthentication.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class SecRole extends AbstractPersistable<Long>{

	private String name;
	
	@OneToMany(targetEntity=SecUser.class, mappedBy="secRole", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	Set<SecUser> secUsers;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
