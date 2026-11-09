import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Part_3 {
    public static void main(String[] args) {

        // 1. Get the current date and time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);

        // 2. Build the log line: [timestamp] message
        String logLine = "[" + timestamp + "] Application started";

        // 3. Open log.txt in append mode (true = add to the end of the file)
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write(logLine + "\n");  // 4. Write the line and move to a new line
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }
    }
}