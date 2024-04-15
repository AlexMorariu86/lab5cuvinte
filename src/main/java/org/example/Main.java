package org.example;

import java.io.*;
import java.util.*;

public class Main {

    public void main(String[] args) throws IOException {

        Map<String, Integer> wordCounts = new HashMap<>();


        BufferedReader reader = new BufferedReader(new FileReader("cuvinte.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");

            for (String word : words) {

                word = word.toLowerCase();

                if (wordCounts.containsKey(word)) {
                    int count = wordCounts.get(word);
                    wordCounts.put(word, count + 1);
                } else {
                    wordCounts.put(word, 1);

                }
            }
        }
        reader.close();
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}