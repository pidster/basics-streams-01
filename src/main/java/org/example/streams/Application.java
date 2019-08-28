package org.example.streams;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        /*
         * Process all of the arguments and print
         * a description of them out to the console
         * in the form:
         *
         *   name: <name>
         *  value: <value>
         *   type: <type>
         *
         * using the supplied type "org.example.streams.Argument"
         *
         * Double points for using a Stream, Functions
         * and Lambas.
         *
         */

        List.of(args)
            .stream()
            .map(Application::convert)
            .forEach(System.out::println);
    }

    private static Argument convert(String argument) {

        String[] pair = argument.split("=");

        String name = pair[0].replaceAll("^-+", "");
        Object value = Boolean.TRUE;
        Class<?> type = Boolean.class;

        if (pair.length == 2) {
            value = pair[1];
            type = String.class;
        }

        return new Argument(name, value, type);
    }


}
