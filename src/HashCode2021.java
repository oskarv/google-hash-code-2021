import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

public class HashCode2021 {

    public static void main(String[] argv) {
        Instant start = Instant.now();
        System.out.println("====================== Google Hash Code 2021. ======================");
        File input = new File("src\\input\\a_example");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            File output = new File("src\\output\\a_example");
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            writer.write("Output File: \n");
            String currentLine;
            while(Objects.nonNull(currentLine = reader.readLine())) {
                System.out.println(currentLine);
                writer.write(currentLine + "\n");
            }

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Instant end = Instant.now();
            System.out.println("Exec time: " + Duration.between(start, end).toSeconds() + " seconds");
        }
    }
}
