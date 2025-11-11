package in.praneeth.AssigmentMain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import in.praneeth.Entity.Students;
@Repository
public interface StudentsRepoInterface extends MongoRepository<Students, String> {

}
