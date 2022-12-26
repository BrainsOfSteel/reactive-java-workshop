package io.javabrains.reactiveworkshop;


public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(System.out::println);
        // TODO: Write code here

        // Print numbers from intNumbersStream that are less than 5
        System.out.println("---");
        StreamSources.intNumbersStream().filter(i -> i<5).forEach(System.out::println);
        // TODO: Write code here

        // Print the second and third numbers in intNumbersStream that's greater than 5
        System.out.println("----");
        StreamSources.intNumbersStream().filter(i -> i>5).limit(3).skip(1).forEach(System.out::println);
        // TODO: Write code here

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        System.out.println("----");
        System.out.println(StreamSources.intNumbersStream().filter(i-> i > 5).limit(1).findFirst().orElse(-1).intValue());
        // TODO: Write code here

        // Print first names of all users in userStream
        System.out.println("----");
        StreamSources.userStream().forEach(e -> System.out.println(e.getFirstName()));
        // TODO: Write code here

        // Print first names in userStream for users that have IDs from number stream
        StreamSources.intNumbersStream()
        .flatMap((id -> StreamSources.userStream().filter(u -> (u.getId() == id))))
        .map(value -> value.getFirstName())
        .forEach(System.out::println);        

        // TODO: Write code here

    }

}
