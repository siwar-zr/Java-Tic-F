package CollectionsApi;

import java.util.*;

public class Demo {

    public static void main(String a[]){

        Set<Integer> nums = new TreeSet<Integer>();


        nums.add(51);
        nums.add(16);
        nums.add(28);
        nums.add(92);
        nums.add(16);

        //System.out.println(nums.indexOf(5));
        //System.out.println(nums.get(2));

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()){
            System.out.println(values.next());
        }

//
//        System.out.println(nums);
//
//        for(int n : nums){
//
//            System.out.println(n*2);
//        }


    }
}
