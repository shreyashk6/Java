import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in);

        System.out.println("Enter your name: ");

        StringBuilder input = new StringBuilder();
        int ch;

        // Read character by character until user presses Enter (newline)
        while ((ch = reader.read()) != '\n') {
            input.append((char) ch);
        }

        System.out.println(" Hello, " + input.toString() + "!");
    }
}
// 🧩 How this works:
// System.in → gives bytes (keyboard input)
// InputStreamReader → converts bytes to characters
// reader.read() → reads one character at a time (returns an int)
// Loop continues until newline ('\n')
// Append each character to a StringBuilder
// Print the full input