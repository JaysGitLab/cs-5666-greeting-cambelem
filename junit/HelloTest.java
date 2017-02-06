import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import p1.Hello;

public class HelloTest {
    
//    public static void main(String[] args){
//       Hello h = new Hello();
//       h.evaluate();
//    }

    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void evaluatesHello() {
        Hello h = new Hello();
        String[] x = new String[5];
        x[0] = "test";
        h.evaluate(x);
     //   System.setOut(new PrintStream(outContent));
        
        String expectedOutput = "Hello, Eric!\n";
        assertEquals(expectedOutput, outContent.toString());
//        assertEquals(expectedOuput, expectedOutput);
    }

    public void evaluatesHello2() {
        Hello h = new Hello();
        //h.evaluate(System.getProerty("num"));


    }
}

