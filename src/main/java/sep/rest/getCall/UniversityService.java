package sep.rest.getCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository repo;
	
	public List<University> listAll()
	{
		return repo.findAll();
	}
	
	public void save(University university)
	{
		repo.save(university);
	}
	
	public University get(String unid) {
		return repo.findById(unid).get();
	}
	
	public void delete(String unid) {
		repo.deleteById(unid);
	}
	

}
