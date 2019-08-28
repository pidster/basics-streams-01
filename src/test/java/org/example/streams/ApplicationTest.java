package org.example.streams;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.io.PrintStream;

public class ApplicationTest {

    @Test
    public void test() {

        PrintStream out = mock(PrintStream.class);
        System.setOut(out);

        var arguments = "-a=b --arg=val --flag -v".split(" ");
        Application.main(arguments);

        verify(out, times(4)).println(any(Argument.class));
    }

}
