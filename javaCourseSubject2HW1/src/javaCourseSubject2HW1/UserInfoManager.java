package javaCourseSubject2HW1;

public class UserInfoManager {
	

	public void editProfile(UserInfo userInfo) {
		System.out.println("Sn. " + userInfo.fullName + " kullan�c� bilgileriniz g�ncellenmi�tir.");
	}
	
	public void addToAddress(UserInfo userInfo) {
		System.out.println("Adres bilginiz " + userInfo.address + " olarak de�i�tirilmi�tir.");
	}

}
