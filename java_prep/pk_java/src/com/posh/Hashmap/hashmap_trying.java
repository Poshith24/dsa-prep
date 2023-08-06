package com.posh.Hashmap;

import java.util.HashMap;

public class hashmap_trying {


        public static void main(String[] args) {
            int[] arr = {1,2,5,5,3};

            countFreq(arr);

//            String s = "abcabc";
//            System.out.println(countChar(s));

        }

        static void countFreq(int[] arr){
            HashMap<Integer,Integer> result = new HashMap<>();

            for(int i=0;i<arr.length;i++){
                if (result.containsKey(arr[i])){
                    result.put(arr[i],result.get(arr[i])+1);
                }
                else{
                    result.put(arr[i],1);
                }
            }

            for(Integer key: result.keySet()){
                System.out.println(key+" "+result.get(key));
            }
            System.out.println(result);
        }

        static boolean countChar(String s){

            HashMap<Character,Integer> result = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(result.containsKey(ch)){
                    result.put(ch,result.get(ch)+1);
                }
                else{
                    result.put(ch,1);
                }
            }

            for(Character key: result.keySet()){
                if (result.get(key)%2!=0){
                    return false;
                }
            }
            return true;
        }


}
