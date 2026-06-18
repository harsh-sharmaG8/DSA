package Array.Date_15_june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

///            using negation trick
public class find_Missing_nums_448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
/// using set (with no duplicates)
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        int n= nums.length;
//        ArrayList<Integer> list = new ArrayList<>();
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        for(int i=1; i<=n; i++){
//            if(!set.contains(i)){
//                list.add(i);
//            }
//        }
//        return list;
//    }
//}
