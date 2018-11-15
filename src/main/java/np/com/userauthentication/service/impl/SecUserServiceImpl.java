package np.com.userauthentication.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import np.com.userauthentication.model.SecUser;
import np.com.userauthentication.repository.SecUserRepository;
import np.com.userauthentication.service.SecUserService;

@Service
public class SecUserServiceImpl implements SecUserService {
	
	private SecUserRepository secUserRepository;

	@Autowired
	public SecUserServiceImpl(SecUserRepository secUserRepository) {
		this.secUserRepository = secUserRepository;
	}

	@Override
	public List<SecUser> secUserList() {
		return secUserRepository.findAll();
	}

	@Override
	public SecUser findOne(Long id) {
		return secUserRepository.findById(id).get();
	}

	@Override
	public SecUser addSecUser(SecUser secUser) {
		return secUserRepository.save(secUser);
	}

	@Override
	public String deleteSecUser(Long id) {
		secUserRepository.deleteById(id);
		return "{'message': 'Sec User with id " + id + " has been deleted!'}";
	}

}
