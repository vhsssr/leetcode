//package vhsssr.leetcode;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Flowerbed {
//
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        return asdf(flowerbed, n);
//    }
//
//    private boolean asdf(int[] flowerbed, int n) {
//        List<Integer> list = Arrays.stream(flowerbed).map(Integer::valueOf).toArray();
//        List<Integer> sequence = Stream.generate(( )-> {
//            Integer a = Integer.valueOf(0);
//            return a;
//        }).limit(n+2).collect(Collectors.toList());
//
//        for (int i = 1; i < sequence.size(); i +=2) sequence.get(i) = 1;
//
//
//        return list.contains(sequence);
//    }
//}
