import java.util.*;

public class five {

    static class Result {
        List<Integer> teamA;
        List<Integer> teamB;
        int diff;

        Result(List<Integer> teamA, List<Integer> teamB, int diff) {
            this.teamA = new ArrayList<>(teamA);
            this.teamB = new ArrayList<>(teamB);
            this.diff = diff;
        }
    }

    static Result bestResult;

    public static void divideTeams(int[] skills) {
        bestResult = new Result(new ArrayList<>(), new ArrayList<>(), Integer.MAX_VALUE);
        helper(skills, 0, new ArrayList<>(), new ArrayList<>());

        System.out.println("Team A: " + bestResult.teamA);
        System.out.println("Team B: " + bestResult.teamB);
        System.out.println("Skill Score Difference: " + bestResult.diff);
    }

    public static void helper(int[] skills, int index, List<Integer> teamA, List<Integer> teamB) {
        if (index == skills.length) {
            if (teamA.size() == teamB.size()) {
                int sumA = teamA.stream().mapToInt(Integer::intValue).sum();
                int sumB = teamB.stream().mapToInt(Integer::intValue).sum();
                int diff = Math.abs(sumA - sumB);
                if (diff < bestResult.diff) {
                    bestResult = new Result(teamA, teamB, diff);
                }
            }
            return;
        }

        if (teamA.size() < skills.length / 2) {
            teamA.add(skills[index]);
            helper(skills, index + 1, teamA, teamB);
            teamA.remove(teamA.size() - 1);
        }

        if (teamB.size() < skills.length / 2) {
            teamB.add(skills[index]);
            helper(skills, index + 1, teamA, teamB);
            teamB.remove(teamB.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] skills = {10, 20, 30, 40};
        divideTeams(skills);
    }
}
