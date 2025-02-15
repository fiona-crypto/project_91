package org.example.project_9.backend;

/**
 * Custom checked exception to handle parsing errors in WeatherParser.
 */
public class ParsingException extends Exception {
    public ParsingException(String message) {
        super(message);
    }

    public ParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}
