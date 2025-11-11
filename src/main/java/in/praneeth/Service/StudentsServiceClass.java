package in.praneeth.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.praneeth.AssigmentMain.StudentsRepoInterface;
import in.praneeth.Entity.Students;

@Service
public class StudentsServiceClass implements StudentsServiceInterface{
	@Autowired
	private StudentsRepoInterface repo;

	public StudentsServiceClass() {
	  System.out.println("STUDENT SERVICE CLAS CREATED");
	  
	}

	@Override
	public Students saveData(Students students) {
		return repo.save(students);
	}

	@Override
	public List<Students> findAll() {
		return repo.findAll();
	}

	@Override
	public String deleteStudentsByname(String name) {
		repo.deleteById(name);
		return "DELETED SUCCESFULLY";
	}

	@Override
	public Students updateSections(Students students) {
		return repo.save(students);
		
	}

}
