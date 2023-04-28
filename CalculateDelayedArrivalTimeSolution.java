public class CalculateDelayedArrivalTimeSolution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int result = (arrivalTime + delayedTime) % 24;
        return result;
    }
}
