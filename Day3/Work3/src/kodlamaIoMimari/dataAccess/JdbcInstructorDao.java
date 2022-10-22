package kodlamaIoMimari.dataAccess;

import kodlamaIoMimari.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi : " + instructor.getFirstName() + instructor.getLastName());		
	}

}
