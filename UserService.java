package integration;

import java.io.IOException;
import java.util.List;

public class UserService {

	private UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository=repository;
	}
	
	public void registerUser(String id,String name)throws IOException {
		User user=new User(id,name);
		repository.save(user);
	}
	
	public List<User>getAllUsers()throws IOException{
		return repository.findAll();
	}
}
