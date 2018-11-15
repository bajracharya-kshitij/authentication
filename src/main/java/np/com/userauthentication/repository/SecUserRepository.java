package np.com.userauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import np.com.userauthentication.model.SecUser;

public interface SecUserRepository extends JpaRepository<SecUser, Long>{

}
