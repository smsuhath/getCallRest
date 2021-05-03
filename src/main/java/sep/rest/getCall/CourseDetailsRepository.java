package sep.rest.getCall;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDetailsRepository extends JpaRepository<CourseDetails, String> {
  
  @Query("SELECT b FROM CourseDetails b where b.unid = ?1")
	List<CourseDetails> findByUniId(String uniId);
	
	@Query("SELECT b FROM CourseDetails b where b.unid = ?1 AND b.userid = ?2")
	CourseDetails findByUniIdAndUserId(String uniId, String userId);
	
	@Query("SELECT b FROM CourseDetails b where b.unid = ?1 AND b.userid = ?2")
	List<CourseDetails> findByUniIdAndUserIdtt(String uniId, String userId);
	
	@Query("SELECT b FROM CourseDetails b WHERE b.coursefees <= ?1")
	List<CourseDetails> findCourseByFees(float fees);
	

}
