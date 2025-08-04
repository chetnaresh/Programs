import java.util.*;

public class Team {
    public static void main(String[] args) {
        int[] skills = {10, 20, 30, 40};
        Arrays.sort(skills);
        int n = skills.length;
        List<Integer> teamA = new ArrayList<>();
        List<Integer> teamB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                teamA.add(skills[i]);
            else
                teamB.add(skills[i]);
        }

        System.out.println("Team A: " + teamA);
        System.out.println("Team B: " + teamB);
    }
}
