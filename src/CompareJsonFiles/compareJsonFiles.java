package com.dstsystems.Runner;

import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
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
        Type type = new TypeToken<Map<String, Object>>(){}.getType();

        Map<String, Object> leftMap = gson.fromJson(leftJson, type);
        Map<String, Object> rightMap = gson.fromJson(rightJson, type);

        Map<String, Object> leftFlatMap = FlatMapUtil.flatten(leftMap);
        Map<String, Object> rightFlatMap = FlatMapUtil.flatten(rightMap);

        MapDifference<String, Object> difference = Maps.difference(leftFlatMap, rightFlatMap);

        System.out.println("Entries only on the left\n--------------------------");
        difference.entriesOnlyOnLeft()
                .forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("\n\nEntries only on the right\n--------------------------");
        difference.entriesOnlyOnRight()
                .forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("\n\nEntries differing\n--------------------------");
        difference.entriesDiffering()
                .forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
