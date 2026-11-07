package Date_10_March;

import java.util.HashMap;

public class Fruits_in_basket {
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> basket = new HashMap<>();
        int right=0;
        int left=0;
        int maxfruits=0;
        for(right=0; right<fruits.length; right++){
            int CurrentCount= basket.getOrDefault(fruits[right],0);
            basket.put(fruits[right], CurrentCount + 1);

            while(basket.size()>2){
                int fruitCount= basket.get(fruits[left])-1;
                if(fruitCount==0){
                    basket.remove(fruits[left]);
                }else{
                    basket.put(fruits[left], fruitCount);
                }
                left++;
            }
            maxfruits= Math.max(maxfruits, right-left +1);
        }
        return maxfruits;
    }

    public static void main(String[] args) {
        int[] fruits= {1,2,2,3,4,4,4};
        System.out.println(totalFruit(fruits));

    }
}
