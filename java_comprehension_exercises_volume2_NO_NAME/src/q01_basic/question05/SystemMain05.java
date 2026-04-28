package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];
		AbstMember nonmember = new NonMember("Sato Kensuke");
		AbstMember member = new Member(1, "PasswOrd", "Miura Manabu", 28, 2);
		members[0] = nonmember;
		members[1] = member;
		MemberManager.showAllMembers(members);

	}

}
