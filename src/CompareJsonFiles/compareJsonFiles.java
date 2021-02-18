package com.dstsystems.Runner;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dt224078 on 2/17/2021.
 */
public class compareJsonFiles {
    //path ="C:\Users\dt224078\Desktop"
    public static void main(String[] args) throws FileNotFoundException {

        String leftJson = new Scanner(new File("C:\\Users\\dt224078\\Desktop\\json1.json")).useDelimiter("\\Z").next();
        String rightJson = new Scanner(new File("C:\\Users\\dt224078\\Desktop\\json2.json")).useDelimiter("\\Z").next();

        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, Object>>() {
        }.getType();

        Map<String, Object> leftMap = gson.fromJson(leftJson, type);
        Map<String, Object> rightMap = gson.fromJson(rightJson, type);

        Map<String, Object> leftFlatMap = FlatMapUtil.flatten(leftMap);
        Map<String, Object> rightFlatMap = FlatMapUtil.flatten(rightMap);

        MapDifference<String, Object> difference = Maps.difference(leftFlatMap, rightFlatMap);

        StringBuilder yourstring = new StringBuilder();

//        System.out.println("Entries only on left\n--------------------------");
//        difference.entriesOnlyOnLeft().forEach((key, value) -> System.out.println(key + ": " + value));

//        System.out.println("\n\nEntries only on right\n--------------------------");
//        difference.entriesOnlyOnRight().forEach((key, value) -> System.out.println(key + ": " + value));

//        System.out.println("\n\nEntries differing\n--------------------------");
//        difference.entriesDiffering().forEach((key, value) -> System.out.println(key + ": " + value));

//        System.out.println("\n\nEntries in common\n--------------------------");
//        difference.entriesInCommon().forEach((key, value) -> System.out.println(key + ": " + value));

        //----------other way tried---------------//
//        for (Map.Entry<String, Object> entry : difference.entriesOnlyOnLeft().entrySet()) {
//            yourstring.append("\n"+entry.getKey()+": "+entry.getValue());
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

        yourstring.append("Entries only on the left\n--------------------------");
        ArrayList<Object> onLeft = new ArrayList<>();
        onLeft.addAll(difference.entriesOnlyOnLeft().entrySet());
        for (Object values : onLeft) {
            yourstring.append("\n"+values);
        }

        yourstring.append("\n\nEntries only on the right\n--------------------------");
        ArrayList<Object> onRight = new ArrayList<>();
        onRight.addAll(difference.entriesOnlyOnRight().entrySet());
        for (Object values : onRight) {
            yourstring.append("\n"+values);
        }
        yourstring.append("\n\nEntries differing\n--------------------------");
        ArrayList<Object> differed = new ArrayList<>();
        differed.addAll(difference.entriesDiffering().entrySet());
        for (Object values : differed) {
            yourstring.append("\n"+values);
        }

        System.out.println(yourstring);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("C:\\Users\\dt224078\\Desktop\\output.txt"));
            writer.write(yourstring.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
