package javaCourseSubject2HW1;

public class UserInfoManager {
	

	public void editProfile(UserInfo userInfo) {
		System.out.println("Sn. " + userInfo.fullName + " kullanýcý bilgileriniz güncellenmiþtir.");
	}
	
	public void addToAddress(UserInfo userInfo) {
		System.out.println("Adres bilginiz " + userInfo.address + " olarak deðiþtirilmiþtir.");
	}

}
