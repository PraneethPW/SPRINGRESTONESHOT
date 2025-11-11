package in.praneeth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.praneeth.Entity.Students;

import in.praneeth.Service.StudentsServiceInterface;

@RestController
@RequestMapping("/users")
public class StudentsControllerClass {
	@Autowired
	private StudentsServiceInterface wired;

	public StudentsControllerClass() {
		System.out.println("CONTROLLER CLASS CREATED SUCCESFULLY");
	}
	@PostMapping("/InsertData")
	public ResponseEntity<Students> saveData(@RequestBody Students students){
		return new ResponseEntity<>(wired.saveData(students) , HttpStatus.OK);
		
	}
	@GetMapping("/GetData")
	public List<Students> findAll(){
		return wired.findAll();
		
	}
	
	@DeleteMapping("/RemoveData")
	public String deleteStudentById(@RequestParam String name) {
		wired.deleteStudentsByname(name);
		return "DELTED SUCCESFULLY WITH NAME" + name;
	}
	@PutMapping("/UpdateData")
	public ResponseEntity<Students> updateSection(@RequestBody Students students){
		return new ResponseEntity<>(wired.updateSections(students) , HttpStatus.OK);
	}

}
