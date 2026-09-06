import java.util.*;

class Solution {
    public String rankTeams(String[] votes) {
        int len = votes[0].length();
        int[][] ranks = new int[26][len];

        for (String vote : votes) {
            for (int idx = 0; idx < vote.length(); idx++) {
                int team = vote.charAt(idx) - 'A';
                ranks[team][idx]++;
            }
        }

        Character[] teams = new Character[len];

        for (int i = 0; i < len; i++) {
            teams[i] = votes[0].charAt(i);
        }

        Arrays.sort(teams, (a, b) -> {

            int teamA = a - 'A';
            int teamB = b - 'A';

            for (int pos = 0; pos < len; pos++) {
                if (ranks[teamA][pos] != ranks[teamB][pos]) {
                    return ranks[teamB][pos] - ranks[teamA][pos];
                }
            }

            return a - b;
        });

        StringBuilder ans = new StringBuilder();
        for (char team : teams) {
            ans.append(team);
        }

        return ans.toString();
    }
}