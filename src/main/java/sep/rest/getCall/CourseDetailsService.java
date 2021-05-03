package sep.rest.getCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseDetailsService {
	
	@Autowired
	private CourseDetailsRepository repo;
	
	public List<CourseDetails> listAll()
	{
		return repo.findAll();
	}
	
	public void save(CourseDetails coursedetails)
	{
		repo.save(coursedetails);
	}
	
	public CourseDetails get(String courseid) {
		return repo.findById(courseid).get();
	}
	
	public void delete(String courseid) {
		repo.deleteById(courseid);
	}
	
	public List<CourseDetails> getCourseDetailsByUniId(String uniId) {
		return repo.findByUniId(uniId);
	}
	
	public List<CourseDetails> getByUniIdAndUserId(String uniId, String userId ) {
		return repo.findByUniIdAndUserIdtt(uniId, userId);
	}
	
	public List<CourseDetails> getCourseByFees(float fees){
		return repo.findCourseByFees(fees);
	}

}
