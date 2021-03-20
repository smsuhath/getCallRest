package sep.rest.getCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {
	
    @Autowired
	private FacultyRepository repo;
	
	public List<Faculty> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Faculty faculty)
	{
		repo.save(faculty);
	}
	
	public Faculty get(String facid) {
		return repo.findById(facid).get();
	}
	
	public void delete(String facid) {
		repo.deleteById(facid);
	}

}
