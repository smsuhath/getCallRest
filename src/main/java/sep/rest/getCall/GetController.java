package sep.rest.getCall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
	
	@Autowired
	private DistrictService disservice;
	
	@Autowired
	private FacultyService facservice;
	
	@Autowired
	private UniversityService uniservice;
	
	@Autowired
	private UserService userservice;
	
	@Autowired
	private CourseDetailsService cdservice;
	
	@GetMapping("/district")
	public List<District> list(){
		return disservice.listAll();
	}
	
	@GetMapping("/district/{disid}")
	public District get(@PathVariable String disid) {
		return disservice.get(disid);
	}
	
	@GetMapping("/faculty")
	public List<Faculty> faclist(){
		return facservice.listAll();
	}
	
	@GetMapping("/faculty/{facid}")
	public Faculty getFac(@PathVariable String facid) {
		return facservice.get(facid);
	}
	
	@GetMapping("/university")
	public List<University> unilist(){
		return uniservice.listAll();
	}
	
	@GetMapping("/university/{unid}")
	public University getUni(@PathVariable String unid) {
		return uniservice.get(unid);
	}
	
	@GetMapping("/user")
	public List<User> userlist(){
		return userservice.listAll();
	}
	
	@GetMapping("/user/{userid}")
	public User getUser(@PathVariable String userid) {
		return userservice.get(userid);
	}

	@GetMapping("/coursedetails")
	public List<CourseDetails> coursedetailslist(){
		return cdservice.listAll();
	}
	
	@GetMapping("/coursedetails/{courseid}")
	public CourseDetails getCourseDetails(@PathVariable String courseid) {
		return cdservice.get(courseid);
	}
	
	
	@GetMapping("coursedetails/unid")
	public List<CourseDetails> getCourseDetailsByUniId(@RequestParam("unid") String unid){
		return cdservice.getCourseDetailsByUniId(unid);
	}
	
	@GetMapping("/coursedetails/unidanduserid")
	public List<CourseDetails> getCourseDetailsByUniIdAndUserId(@RequestParam("unid") String unid, @RequestParam("userId") String userId ) {
		return cdservice.getByUniIdAndUserId(unid,userId);
	}
	
	@GetMapping("/coursedetails/coursefees")
	public List<CourseDetails> getCourseByFees(@RequestParam("fees") float fees){
		return cdservice.getCourseByFees(fees);
	}
	
	
	@PostMapping("/coursedetails")
	public void add(@RequestBody CourseDetails coursedetails) {
		cdservice.save(coursedetails);
	}

}
