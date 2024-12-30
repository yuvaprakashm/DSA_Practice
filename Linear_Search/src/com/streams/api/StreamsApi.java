package com.streams.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApi {
	public static void main(String[] args) {
		List<String> name = Arrays.asList("John", "Alice", "Bob", "Jane");
		String names = name.stream()
				.collect(Collectors.joining(", "));
		System.out.println(names);
		
		List<String> list1 = Arrays.asList("grape", "banana", "orange");
		List<String> list2 = Arrays.asList("grape", "melon", "pineapple");
		Stream<String> s1 = list1.stream();
		Stream<String> s2 = list2.stream();
		Stream<String> c = Stream.concat(s1, s2);
		c.forEach(System.out::println);
		
		Random r = new Random();
		Stream<Integer> randomNumbers = Stream.generate(r::nextInt);
//		randomNumbers.forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		double average = numbers.stream()
				.filter(n -> n % 2 == 0)
				.mapToDouble(n -> n * 2.0)
				.average()
				.orElse(0);
		System.out.println(average);
		
		Stream.Builder<Integer> builder = Stream.builder();
		builder.add(1);
		builder.add(2);
		builder.add(3);
		Stream<Integer> stream = builder.build();
		stream.forEach(System.out::println);
		
		
		List<String> n = Arrays.asList("john", "alice", "bob", "jane");
		Map<Integer, Long> countByNameLength = n
				.stream()
				.collect(Collectors.groupingBy(String::length, Collectors.counting()));
		countByNameLength.forEach((key, value) -> System.out.println(key + ": " + value));
		
		
		List<String> list = Arrays.asList("apple", null, "banana", null, "orange");
		List<String> filteredList = list.stream().map(s -> {
			if(s == null) {
				return "N/A";
			}
			return s.toUpperCase();
		})
		.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
		
		
		List<String> list11 = Arrays.asList("apple", null, "banana", null, "orange");
		List<Optional<String>> optionalList = list11.stream().map(Optional::ofNullable)
				.collect(Collectors.toList());
		optionalList.forEach(System.out::println);
		
		String name1 = null;
		Stream<String> stream1 = Stream.ofNullable(name1);
		stream1.forEach(System.out::println);
		
		
		int[] numbers1 = {1,2,3,4,5};
		Stream<Integer> stream11 = Arrays.stream(numbers1).boxed();
		stream11.forEach(System.out::println);
		
		Stream<String> emptyStream = Stream.empty();
		emptyStream.s
		emptyStream.forEach(System.out::println);
	}
}
