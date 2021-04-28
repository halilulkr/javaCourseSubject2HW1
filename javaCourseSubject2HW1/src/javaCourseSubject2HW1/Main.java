package javaCourseSubject2HW1;

public class Main {

	public static void main(String[] args) {
		
		UserInfo userInfo1 = new UserInfo(1, "Halil Ülker", 12345, "Ankara");
		UserInfo userInfo2 = new UserInfo(2, "Unknown", 67890, "Ankara");
		
		Course course1 = new Course(6, "Java", "Engin Demiroð");
		Course course2 = new Course(7, "C#", "Engin Demiroð");
		
		
		UserInfo[] userInfos = {userInfo1, userInfo2};
		
		Course[] courses = {course1, course2};
		
		System.out.println("Kullanýcýlar : ");
		for (UserInfo userInfo: userInfos) {
			System.out.println(userInfo.fullName);
		}
		
		System.out.println("\n" + "Eðitimler : ");
		for (Course course: courses) {
			System.out.println(course.courseName);
		}
		
		UserInfoManager infoManager = new UserInfoManager();
		CourseManager courseManager = new CourseManager();
		
		System.out.println("\n");
		infoManager.editProfile(userInfo1);
		infoManager.addToAddress(userInfo1);
		
		System.out.println("\n");
		courseManager.signUpCourse(course1);
		courseManager.removeCourse(course2);
	}

}
