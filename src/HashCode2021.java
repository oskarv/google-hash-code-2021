import model.Car;
import model.Street;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashCode2021 {

    public static void main(String[] argv) {
        Instant start = Instant.now();
        System.out.println("====================== Google Hash Code 2021. ======================");
        File input = new File("src/input/a.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            File output = new File("src/output/a.txt");
            Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
            String currentLine;

            List<Street> streets = new ArrayList<>();
            List<Car> cars = new ArrayList<>();
            int duration, numOfIntersections, numOfStreets, numOfCars, bonus;
            currentLine = reader.readLine();
            String[] firstLineArray = currentLine.split(" ");
            duration =  Integer.parseInt(firstLineArray[0]);
            numOfIntersections =  Integer.parseInt(firstLineArray[1]);
            numOfStreets =  Integer.parseInt(firstLineArray[2]);
            numOfCars =  Integer.parseInt(firstLineArray[3]);
            bonus =  Integer.parseInt(firstLineArray[4]);

            for(int i = 0; i < numOfStreets; i++) {
                currentLine = reader.readLine();
                String[] dataInCurrentLine = currentLine.split(" ");
                Street street = new Street();
                street.setIntersectionsAtStart(Integer.parseInt(dataInCurrentLine[0]));
                street.setIntersectionsAtEnd(Integer.parseInt(dataInCurrentLine[1]));
                street.setName(dataInCurrentLine[2]);
                street.setTravelTime(Integer.parseInt(dataInCurrentLine[3]));
                streets.add(street);
            }

            for(int i = 0; i < numOfCars; i++) {
                currentLine = reader.readLine();
                String[] dataInCurrentLine = currentLine.split(" ");
                Car car = new Car();
                car.setNumOfStreets(Integer.parseInt(dataInCurrentLine[0]));
                List<String> streetsInCarPath = new ArrayList<>(Arrays.asList(dataInCurrentLine).subList(1, dataInCurrentLine.length));
                car.setStreets(streetsInCarPath);
                cars.add(car);
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
