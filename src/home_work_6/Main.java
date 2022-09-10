package home_work_6;

import home_work_6.search_clases.RegExSearch;

import java.io.*;
import java.util.*;

public class Main {

    private static final Set<String> words = new HashSet<>();
    private static final HashMap<String, Integer> wordMap = new HashMap<>();
    private static final LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
    private static final ArrayList<Integer> list = new ArrayList<>();
    private static long countOfWords;
    public static void main(String[] args) {
        String fileName = "Война и мир_книга.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            RegExSearch search = new RegExSearch();
            String line;
            while ((line = reader.readLine()) != null){
                String[] separatedLine = line.split("[^а-яА-Я0-9-]+");
                setWordsAndMap(separatedLine);
            }
            Random random = new Random();
            enterMostPopularWords(random.nextInt(10));
            System.out.println(search.search(fileName, "война"));
            System.out.println(search.search(fileName, "и"));
            System.out.println(search.search(fileName, "мир"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        TreeMap<String, Integer> sortedWords = new TreeMap<>(wordMap);
        Set<Map.Entry<String, Integer>> entries = sortedWords.entrySet();

        Comparator<Map.Entry<String, Integer>> valueComparator
                = Map.Entry.comparingByValue();
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
                countOfWords++;
                continue;
            }
            wordMap.put(separatedLine[i], 1);
            countOfWords++;
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
    private static void enterMostPopularWords(int countOfWords){
        sortMap();
        int count = 1;
        for (Map.Entry<String, Integer> word : sortedMap.entrySet()){
            if (count >= sortedMap.size()-countOfWords){
                System.out.println(word.getKey() + " " + word.getValue());
            }
            count++;
        }
    }
    private static void sortMap(){
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
    }
}
