package it.unibo.oop.lab.collections1;

import java.util.*;
import java.util.Map.Entry;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {

    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    
    private static int lastElemIndex(final List<Integer> list) {
    	return list.size() - 1;
    }
    
    private static void swapFirstLastElemFromList(final List<Integer> list) {
    	Integer firstInt = list.get(0);
    	list.set(0, list.get(lastElemIndex(list)));
    	list.set(lastElemIndex(list), firstInt);
    }
    
    private static long evalutingListAddingPerformance(final List<? super Integer> list) {
    	long time = System.nanoTime();
    	for (int i = 0; i < ENTRIES; i++) {
    		list.add(0, i);
    	}
    	time = System.nanoTime() - time;
    	return time;
    }
 
    private static int getMiddlePos(final List<?> list) {
    	return (list.size() / 2) + 1;
    }
    
    private static long evalutingListExtractElPerformance(final List<?> list) {
    	int numReading = 1000;
    	long time = System.nanoTime();
    	for (int i = 0; i < numReading; i++) {
    		list.get(getMiddlePos(list));
    	}
    	time = System.nanoTime() - time;
    	return time;
    }   
    
    private static long getWorldPopulation(final Map<? extends String, ? extends Long> map) {
    	long population = 0;
    	for (Entry<? extends String, ? extends Long> entry : map.entrySet()) {
    		population += entry.getValue();
    	}
    	return population;
    }
    
    
    private static final int START = 1_000;
    private static final int STOP = 2_000;
    private static final int ENTRIES = 100_000;
    private static final int TO_MS = 1_000_000;
    
    private static final long AFRICA_POPULATION = 1_110_635_000L;
    private static final long AMERICAS_POPULATION = 972_005_000L;
    private static final long ANTARCTICA_POPULATION = 0L;
    private static final long ASIA_POPULATION = 4_298_723_000L;
    private static final long EUROPE_POPULATION = 742_452_000L;
    private static final long OCEANIA_POPULATION = 38_304_000L;
    
    public static void main(final String... s) {
    	
    	final List<Integer> list = new ArrayList<>();
    	for(int i = START; i < STOP; i++) {
    		list.add(i);
    	}
    	
    	final List<Integer> list2 = new LinkedList<>(list);
    	
    	swapFirstLastElemFromList(list);
    	
    	for(Integer i : list) {
    		System.out.println(i);
    	}
    	
    	System.out.println("Time required to add 100.000 elements to ArrayList: " 
    			+ evalutingListAddingPerformance(list) / TO_MS + "ms");
    	
    	System.out.println("Time required to add 100.000 elements to LinkedList: " 
    			+ evalutingListAddingPerformance(list2) / TO_MS + "ms");
    	
    	System.out.println("Time required to read 1.000 elements to ArrayList: " 
    			+ evalutingListExtractElPerformance(list) / TO_MS + "ms");
    	
    	System.out.println("Time required to read 1.000 elements to LinkedList: " 
    			+ evalutingListExtractElPerformance(list2) / TO_MS + "ms");
    	
    	
    	final Map<String, Long> countries = new HashMap<>();
    	countries.put("Africa", AFRICA_POPULATION);
    	countries.put("Americas", AMERICAS_POPULATION);
    	countries.put("Antartica", ANTARCTICA_POPULATION);
    	countries.put("Asia", ASIA_POPULATION);
    	countries.put("Europe", EUROPE_POPULATION);
    	countries.put("Oceania", OCEANIA_POPULATION);
    	
    	System.out.println("World Population : " + getWorldPopulation(countries));
    	
    	/*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
