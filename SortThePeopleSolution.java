public class SortThePeopleSolution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        for(int i = 1; i < names.length; i++) {
            for(int j = 0; j < names.length - i; j++) {
                if(heights[j] < heights[j + 1]) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                    int tem = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = tem;
                }
            }
        }
        return names;
    }
}
