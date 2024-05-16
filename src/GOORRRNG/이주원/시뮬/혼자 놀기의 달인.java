import java.util.*;

class Solution {
    public int solution(int[] cards) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < cards.length; i++) {
            if(cards[i] != 0) {
                int target = cards[i]-1;
                cards[i] = 0;
                int size = 1;
                while(i != target) {
                    size++;
                    int temp = cards[target]-1;
                    cards[target] = 0;
                    target = temp;
                }
                result.add(size);
            }
        }
        int answer = result.size() == 1 ? 0 :
        result
            .stream()
            .sorted((o1, o2) -> o2 - o1)
            .limit(2)
            .reduce(1, (o1, o2) -> o1 * o2);
        
        return answer;
    }
}