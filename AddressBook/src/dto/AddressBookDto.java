package dto;

public class AddressBookDto {
	
	// 주소록 항목들
	private String name;
	private int age;
	private String phonenumber;
	private String birthday;
	private String memo;
	
	public AddressBookDto(String name, int age, String phonenumber, String birthday, String memo) {
		super();
		this.name = name;
		this.age = age;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
		this.memo = memo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Override
	public String toString() {
		return name + "*" + age + "*" + phonenumber + "*"
				+ birthday + "*" + memo;
	}
	
	public void print() {
		System.out.println("이름: " + name + ", 나이:" + age + ", 전화번호:" + phonenumber + ", 생년월일:"
				+ birthday + ", 메모: " + memo);
	}
	

	
}
