package com.company;

import java.util.HashMap;
import java.util.List;

public class Results {


    public static void checkMagazine(List<String> magazine, List<String> note) {

        if(note.size() > 0){
            System.out.println("No");
            return;
        }

        if(note.size() > magazine.size()){
            System.out.println("No");
            return;
        }


        HashMap<String, Integer> wordMapCounter= new HashMap<String, Integer>();

        for(int i=magazine.size()-1;i>=0;i--){

            if(wordMapCounter.containsKey(magazine.get(i))){

                wordMapCounter.put(magazine.get(i), wordMapCounter.get(magazine.get(i))+1);

            }else{

                wordMapCounter.put(magazine.get(i),1);
            }
        }

        for(int i=note.size()-1;i>=0;i--){

            if(wordMapCounter.containsKey(note.get(i))){

                wordMapCounter.put(note.get(i), wordMapCounter.get(note.get(i)) - 1);

                if(wordMapCounter.get(note.get(i)) < 0){

                    System.out.println("No");
                    return;
                }
            }else{

                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");

    }

}
