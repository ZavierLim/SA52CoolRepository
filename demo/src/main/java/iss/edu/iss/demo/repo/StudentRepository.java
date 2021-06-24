package iss.edu.iss.demo.repo;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import sg.edu.iss.demo.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;

//this is enough to create a persistence layer. repository.
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	
	//CRUD - find student
	//when you extend jparepository, all the find by id, find by one all settled
	
	//find student by CGPA- queryannotation to create special finder query
		
	//this is using object class and never databasse class. so i use the student class.
	//use class names. so if STUDENT in class, student in db. use STUDENT.
	
	//can use :1 , or ?1 - ?1 is first aguement. better to use :1
//	
//	@Query("SELECT s FROM Student s where s.nickName like %1")
//	List<Student> queryStudentsbyNickName(String nn);
//	
//	@Query("SELECT s FROM Student s where s.nickName like :name")
//	List<Student> queryStudentsbyName(@Param("name") String name);

}
