package ashraf.gymmembership;

public class Solution {

    public static void main(String[] args) {

        GymTracker gym = new GymTracker();

        gym.addMember(1, "John", MembershipType.GOLD);
        gym.addMember(2, "Alice", MembershipType.SILVER);

        gym.addWorkout(1, 30);
        gym.addWorkout(1, 60);
        gym.addWorkout(2, 90);

        System.out.println(gym.getAverageWorkoutDuration(2)); // 60.0
    }
}
