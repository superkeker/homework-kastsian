package home_work_6.search_clases;

import home_work_6.api.ISearchEngine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class RegExSearch implements ISearchEngine {

    private static final Set<String> words = new HashSet<>();
    private static final HashMap<String, Integer> wordMap = new HashMap<>();

    @Override
    public long search(String text, String word) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(text));
            String line;
            while ((line = reader.readLine()) != null){
                String[] separatedLine = line.split("[^à-ÿÀ-ß0-9-]+");
                setWordsAndMap(separatedLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return theWordCount(word);
    }

    private static long theWordCount(String word) {
        for (Map.Entry<String, Integer> wordOfTxt : wordMap.entrySet()){
            if(Objects.equals(wordOfTxt.getKey(), word)){
                return wordOfTxt.getValue();
            }
        }
        return 0;
    }

    private static void setWordsAndMap(String[] separatedLine){
        for (int i = 0; i <= separatedLine.length-1; i++) {

            if(separatedLine[i].contains("-")){
                separatedLine[i] = specialChanges(separatedLine[i]);
            }
            if(separatedLine[i].isEmpty()){
                continue;
            }
            words.add(separatedLine[i]);

            if(wordMap.containsKey(separatedLine[i])){
                int countOfKey = wordMap.get(separatedLine[i]);
                countOfKey++;
                wordMap.put(separatedLine[i], countOfKey);
                continue;
            }
            wordMap.put(separatedLine[i], 1);
        }
    }
    private static String specialChanges(String word) {
        while(word.startsWith("-") || word.endsWith("-")){
            if(word.startsWith("-")){
                word = word.replaceFirst("-", "");
            }
            if (word.endsWith("-")) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(sb.length()-1);
                word = sb.toString();
            }
        }
        return word;
    }
}
