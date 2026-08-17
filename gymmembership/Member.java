package ashraf.gymmembership;

import java.util.ArrayList;
import java.util.List;

class Member {
    int memberId;
    String name;
    MembershipType membershipType;
    List<Integer> workouts = new ArrayList<>();

    Member(int memberId, String name, MembershipType membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.workouts = new ArrayList<>();
    }
}
