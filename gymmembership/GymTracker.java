package ashraf.gymmembership;

import java.util.HashMap;
import java.util.Map;

class GymTracker {

    private Map<Integer, Member> members = new HashMap<>();

    public void addMember(int memberId, String name,
                          MembershipType membershipType) {

        if (members.containsKey(memberId)) {
            System.out.println("Duplicate member.");
            return;
        }

        members.put(memberId,
                new Member(memberId, name, membershipType));
    }

    public void addWorkout(int memberId, int durationInMinutes) {

        Member member = members.get(memberId);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        member.workouts.add(durationInMinutes);
    }

    public double getAverageWorkoutDuration(int memberId) {

        Member member = members.get(memberId);

        if (member == null) {
            throw new IllegalArgumentException("Member not found");
        }

        if (member.workouts.isEmpty())
            return 0.0;

        int sum = 0;

        for (int duration : member.workouts) {
            sum += duration;
        }

        return (double) sum / member.workouts.size();
    }
}

