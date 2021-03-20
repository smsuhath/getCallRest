package sep.rest.getCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> listAll()
	{
		return repo.findAll();
	}
	
	public void save(User user)
	{
		repo.save(user);
	}
	
	public User get(String userid) {
		return repo.findById(userid).get();
	}
	
	public void delete(String userid) {
		repo.deleteById(userid);
	}

}
