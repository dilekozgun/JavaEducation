package kodlamaIoMimari;

import kodlamaIoMimari.business.CategoryManager;
import kodlamaIoMimari.business.CourseManager;
import kodlamaIoMimari.business.InstructorManager;
import kodlamaIoMimari.core.logging.DatabaseLogger;
import kodlamaIoMimari.core.logging.FileLogger;
import kodlamaIoMimari.core.logging.Logger;
import kodlamaIoMimari.core.logging.MailLogger;
import kodlamaIoMimari.dataAccess.HibernateCourseDao;
import kodlamaIoMimari.dataAccess.HibernateInstructorDao;
import kodlamaIoMimari.dataAccess.JdbcCategoryDao;
import kodlamaIoMimari.entities.Category;
import kodlamaIoMimari.entities.Course;
import kodlamaIoMimari.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		Course course = new Course("JavaScript Bootcamp","Yazılım Geliştirici Yetiştirme Kampı",20, new Category("Programlama"), new Instructor("Engin", "Demiroğ"));
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		
		Category category = new Category("Yabancı Dil Eğitimi");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		Instructor instructor = new Instructor("Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		
		
	}

}
