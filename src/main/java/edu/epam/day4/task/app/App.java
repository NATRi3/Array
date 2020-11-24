package edu.epam.day4.task.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    public static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("LOL");
    }
}
