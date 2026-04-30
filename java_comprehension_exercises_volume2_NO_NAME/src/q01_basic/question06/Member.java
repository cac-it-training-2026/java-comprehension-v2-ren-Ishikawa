package q01_basic.question06;

class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member() {

	}

	public Member(int id, String password, String name, int age, int rank) {

	}

	public void buyItem() {
		System.out.println(name + " purchased the item at 50% off ");
	}

	public void showMember() {
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
	}
}
