package kodlamaIoMimari.business;

import kodlamaIoMimari.core.logging.Logger;
import kodlamaIoMimari.dataAccess.CourseDao;
import kodlamaIoMimari.entities.Category;
import kodlamaIoMimari.entities.Course;
import kodlamaIoMimari.entities.Instructor;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {

		Course[] courses = { new Course("Java Bootcamp", "Yazılım Geliştirici Yetiştirme Kampı", 40,
				new Category("Programlama"), new Instructor("Engin", "Demiroğ")) };
		for (Course course2 : courses) {
			if (course.getName() == course2.getName()) {
				throw new Exception("Aynı isimde bir kurs zaten var.");
			} else if (course.getPrice() < 0) {
				throw new Exception("Kurs fiyatı 0'dan küçük olamaz.");
			}
		}
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}
}
