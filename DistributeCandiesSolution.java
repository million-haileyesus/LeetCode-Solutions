public class DistributeCandiesSolution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int result = 0;
        int count = 1;
        for(int i = 0; i < candyType.length - 1; i++) {
            if(candyType[i] != candyType[i + 1]) {
                count++;
            }
        }
        result = count > candyType.length >> 1 ? candyType.length >> 1 : count;
        return result;
    }
}
