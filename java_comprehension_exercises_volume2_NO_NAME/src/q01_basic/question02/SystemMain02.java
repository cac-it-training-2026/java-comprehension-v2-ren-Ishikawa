package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAge(30);
		member.setName("Miura Manabu");
		member.setRank(1);
		member.showMember();
		member.rankUp();

	}
}
