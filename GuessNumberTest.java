import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberTest {

    @Test
    public void testCorrectGuess() {
        String input = "50\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        GuessNumber.main(new String[]{});
        
        // Add assertions to check if the output is as expected
    }

    @Test
    public void testLowGuess() {
        String input = "25\n50\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        GuessNumber.main(new String[]{});
        
        // Add assertions to check if the output is as expected
    }

    @Test
    public void testHighGuess() {
        String input = "75\n50\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        
        GuessNumber.main(new String[]{});
        
        // Add assertions to check if the output is as expected
    }
}