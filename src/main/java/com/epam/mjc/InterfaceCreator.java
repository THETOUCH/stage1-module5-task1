package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        return x -> {
            int count = 0;
            for (String s : x) {
                if (Character.isUpperCase(s.toCharArray()[0])) {
                    count++;
                }
            }
            return count==x.size() ? true : false;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        return x -> {
            int t = x.size();
            for (int i = 0 ; i < t; i++) {
                if (x.get(i) % 2 == 0) {
                    x.add(x.get(i));
                }
            }
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        return () -> {
            List<String> otvet = new ArrayList<>();
            for (String s : values) {
                if (Character.isUpperCase(s.toCharArray()[0])) {
                    if (s.endsWith(".")) {
                        if (s.split(" ").length > 3) {
                            otvet.add(s);
                        }
                    }
                }
            }
            return otvet;
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        return x -> {
          Map<String, Integer> newMap = new HashMap<>();
          for (String s : x) {
              newMap.put(s, s.length());
          }
          return newMap;
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        return (list1, list2) -> {
            List<Integer> newList = new ArrayList<>(list1);
            newList.addAll(list2);
            return newList;
        };
//        throw new UnsupportedOperationException("You should implement this method.");
    }
//    public Predicate<List<String>> isValuesStartWithUpperCase() {
//        return x -> x.stream().allMatch(word -> Character.isUpperCase(word.toCharArray()[0]));
//    }
//
//    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
//        return x -> x.addAll(x.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));
//    }
//
//    public Supplier<List<String>> filterCollection(List<String> values) {
//        return () -> values.stream()
//                .filter(word -> Character.isUpperCase(word.toCharArray()[0]))
//                .filter(string -> string.endsWith("."))
//                .filter(string -> string.split(" ").length > 3)
//                .collect(Collectors.toList());
//    }
//
//    public Function<List<String>, Map<String, Integer>> stringSize() {
//        return strings -> strings.stream().collect(Collectors.toMap(String::toString, String::length));
//    }
//
//    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
//        return (list1, list2) -> Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
//    }
}
