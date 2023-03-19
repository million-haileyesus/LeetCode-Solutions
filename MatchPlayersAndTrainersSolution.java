public class MatchPlayersAndTrainersSolution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int result = 0;
        int i = 0; 
        int j = 0;
        for(; i < players.length && j < trainers.length; ) {
            if(players[i] < trainers[j] + 1) {
                result++;
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return result;
    }
}
