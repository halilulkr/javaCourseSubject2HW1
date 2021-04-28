package javaCourseSubject2HW1;

public class CourseManager {

	public void signUpCourse(Course course) {
		System.out.println(course.courseName + " kursuna kaydýnýz alýnmýþtýr.");
	}
	
	public void removeCourse(Course course) {
		System.out.println(course.courseName + " kursundan kaydýnýz silinmiþtir.");
	}
}
