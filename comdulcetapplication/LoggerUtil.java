package comdulcetapplication;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerUtil {
    private static final String LOG_FILE = "application.log";

    public static void log(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Error writing log: " + e.getMessage());
        }
    }
}
