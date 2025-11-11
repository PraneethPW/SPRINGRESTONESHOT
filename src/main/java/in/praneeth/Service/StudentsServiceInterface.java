package in.praneeth.Service;

import java.util.List;

import in.praneeth.Entity.Students;

public interface StudentsServiceInterface {
    public Students saveData(Students students);
    public List<Students> findAll();
    public String deleteStudentsByname(String name);
    public Students updateSections(Students students);
    
}
