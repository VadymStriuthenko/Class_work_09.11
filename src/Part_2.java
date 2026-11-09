import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Part_2 {
    public static void main(String[] args) {
        Path path = Paths.get("data", "output.txt");

        List<String> lines = Arrays.asList(
                "First line of text",
                "Second line of text",
                "Third line of text"
        );

        try {
            Files.createDirectories(path.getParent()); // make sure data/ exists
            Files.write(path, lines);
        } catch (IOException e) {
            System.err.println("Could not write file: " + e.getMessage());
        }
    }
}