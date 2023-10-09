// One day Vasya decided to have a look at the results of Berland 1910 Football Championship’s finals. Unfortunately he didn't find the overall score of the match; however, he got hold of a profound description of the match's process. On the whole there are n lines in that description each of which described one goal. Every goal was marked with the name of the team that had scored it. Help Vasya, learn the name of the team that won the finals. It is guaranteed that the match did not end in a tie.

// Input Format

// The first line contains an integer n (1 ≤ n ≤ 100) — the number of lines in the description. Then follow n lines — for each goal the names of the teams that scored it. The names are non-empty lines consisting of uppercase Latin letters whose lengths do not exceed 10 symbols. It is guaranteed that the match did not end in a tie and the description contains no more than two different teams.

// Constraints.

// Output Format

// Print the name of the winning team. We remind you that in football the team that scores more goals is considered the winner.

// Sample Input 0

// 1
// ABC
// Sample Output 0

// ABC
// Sample Input 1

// 5
// A
// ABA
// ABA
// A
// A
// Sample Output 1

// A

import java.util.*;

class problem9 {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    short n = sc.nextShort();
    String team1 = "";
    String team2 = "";
    String input = "";

    short team1Score = 0;
    short team2Score = 0;

    for (int i = 0; i < n; i++) {
        input = sc.next();
        if (team1.equals("")) {
            team1 = input;
            team1Score++;
        } else if (team1.equals(input)) {
            team1 = input;
            team1Score++;
        } else {
            team2 = input;
            team2Score++;
        }
    }

    if (team1Score > team2Score) {
        System.out.println(team1);
    } else {
        System.out.println(team2);
    }
}
}
