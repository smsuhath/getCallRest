package sep.rest.getCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {
	
	@Autowired
	private DistrictRepository repo;
	
	public List<District> listAll()
	{
		return repo.findAll();
	}
	
	public void save(District district)
	{
		repo.save(district);
	}
	
	public District get(String disid) {
		return repo.findById(disid).get();
	}
	
	public void delete(String disid) {
		repo.deleteById(disid);
	}
	

}
