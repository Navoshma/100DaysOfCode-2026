public class Main {

    static final int STADIUMS = 3;
    static final int MAX_GOALS = 100;
    static final int PLAYERS = 10;

    static int[][] goals = new int[STADIUMS][MAX_GOALS];
    static int[] goalCount = new int[STADIUMS];
    static int[] playerGoals = new int[PLAYERS];

    static void addGoalToStadium2(int minute, int playerID) {
        if (goalCount[2] >= MAX_GOALS) {
            System.out.println("Stadium 2 is full");
            return;
        }

        goals[2][goalCount[2]] = minute;
        playerGoals[playerID]++;
        goalCount[2]++;
    }

    static int totalGoals() {
        int total = 0;

        for (int s = 0; s < STADIUMS; s++) {
            total += goalCount[s];
        }

        return total;
    }

    static int topScorer() {
        int maxG = playerGoals[0];
        int winner = 0;

        for (int p = 1; p < PLAYERS; p++) {
            if (playerGoals[p] > maxG) {
                maxG = playerGoals[p];
                winner = p;
            }
        }

        return winner;
    }

    static void displayStadium(int stadium) {
        for (int i = 0; i < goalCount[stadium]; i++) {
            System.out.print(goals[stadium][i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        goals[0][0] = 15;
        goals[0][1] = 42;
        goalCount[0] = 2;

        goals[1][0] = 8;
        goals[1][1] = 67;
        goalCount[1] = 2;

        goals[2][0] = 23;
        goals[2][1] = 55;
        goals[2][2] = 80;
        goalCount[2] = 3;

        playerGoals[0] = 2;
        playerGoals[1] = 2;
        playerGoals[2] = 3;

        System.out.println("Total Goals: " + totalGoals());
        System.out.println("Top Scorer: Player " + topScorer());

        System.out.print("Stadium 0 goals: ");
        displayStadium(0);

        System.out.print("Stadium 1 goals: ");
        displayStadium(1);

        System.out.print("Stadium 2 goals: ");
        displayStadium(2);
    }
}
