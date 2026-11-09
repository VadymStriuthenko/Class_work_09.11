import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Part_1 {
    public static void main(String[] args) {
        Path path = Paths.get("data", "input.txt");

        try {
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }

            System.out.println("Total lines: " + lines.size());
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }
    }
}
