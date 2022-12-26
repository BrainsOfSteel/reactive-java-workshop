package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e),
        err -> System.out.println("error"),
        ()-> System.out.println("Completed"));

        // Get the value from the Mono into an integer variable
        
        // int v= ReactiveSources.intNumberMono().block();
        // System.out.println("val = "+v);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
