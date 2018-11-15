package np.com.userauthentication.service;

import java.util.List;

import np.com.userauthentication.model.SecUser;

public interface SecUserService {

	List<SecUser> secUserList();
	
	SecUser findOne(Long id);
	
	SecUser addSecUser(SecUser secUser);
	
	String deleteSecUser(Long id);
	
}
