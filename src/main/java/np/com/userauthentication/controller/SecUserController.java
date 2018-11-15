package np.com.userauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import np.com.userauthentication.model.SecUser;
import np.com.userauthentication.service.SecUserService;

@RestController
@RequestMapping("/user")
public class SecUserController {

	private SecUserService secUserService;

	@Autowired
	public SecUserController(SecUserService secUserService) {
		this.secUserService = secUserService;
	}
	
	@RequestMapping("/list")
	public List<SecUser> userList() {
		return secUserService.secUserList();
	}
	
	@RequestMapping("/list/{id}")
	public SecUser findOne(@PathVariable Long id) {
		return secUserService.findOne(id);
	}
	
	@RequestMapping("/add")
	public SecUser addSecUser(@RequestBody SecUser secUser) {
		return secUserService.addSecUser(secUser);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteSecUser(@PathVariable Long id) {
		return secUserService.deleteSecUser(id);
	}
}
