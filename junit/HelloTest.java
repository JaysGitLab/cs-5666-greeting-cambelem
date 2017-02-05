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
        h.evaluate();
     //   System.setOut(new PrintStream(outContent));
        
        String expectedOutput = "Hello, World!\n";
        assertEquals(expectedOutput, outContent.toString());
//        assertEquals(expectedOuput, expectedOutput);
    }
}

