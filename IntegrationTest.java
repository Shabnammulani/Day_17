package integration;

import java.io.IOException;
import java.util.List;

public class IntegrationTest {
	public static void main(String[] args)throws IOException {
		//Setup
		
		String testFilePath="test_users.txt";
		UserRepository repo=new UserRepository(testFilePath);
		repo.clear(); //make sure the file is empty before testing
		UserService service=new UserService(repo);
		
		//Test
		service.registerUser("1", "ABC");
		service.registerUser("2", "DEF0");
		
		List<User>users=service.getAllUsers();
		
		assert users.size() ==2 :"Expected 2 users";
		assert users.get(0).getName().equals("ABC");
		assert users.get(1).getName().equals("DEF");
		
		System.out.println("Integration test passed!");
		
		//Clean up
		repo.clear();
	}

	
}
