package app;

import greeting.GreetingFactory;

public class GreetingInMultipleLanguagesApp {
    public static void main(String[] argumentArray) {
        if (argumentArray.length <= 0) {System.err.println("You did not give your name. " +
                "Hello dummy!");
        }
        String message;
        if (argumentArray.length == 1) {
            message = new GreetingFactory().greeting(argumentArray[0], "hun");
        }
        else {
            message = new GreetingFactory().greeting(argumentArray[0], argumentArray[1]);
        }
            System.out.println(message);
    }
}
