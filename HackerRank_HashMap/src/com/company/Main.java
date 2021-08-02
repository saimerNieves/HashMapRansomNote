package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //Inputing numbers separted by space
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        //Assigning numbers to variables
        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);


        List<String> magazine =
                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(Collectors.toList());

        List<String> note =
                Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).collect(Collectors.toList());

        Results.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
