package javaCourseSubject2HW1;

public class UserInfoManager {
	

	public void editProfile(UserInfo userInfo) {
		System.out.println("Sn. " + userInfo.fullName + " kullanıcı bilgileriniz güncellenmiştir.");
	}
	
	public void addToAddress(UserInfo userInfo) {
		System.out.println("Adres bilginiz " + userInfo.address + " olarak değiştirilmiştir.");
	}

}
