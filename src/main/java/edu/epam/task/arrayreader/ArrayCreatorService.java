package edu.epam.task.arrayreader;

import edu.epam.task.array.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.Random;

public class ArrayCreatorService {
    public static Logger logger = LogManager.getLogger(ArrayCreatorService.class);
    private static final int MAX_ARRAY_LENGTH = 100;
    private static final File DEFAULT_FILE =
            new File("data\\data.txt");
    public NumberArray CreateRandomNumberArray(){
        int length = new Random().nextInt(MAX_ARRAY_LENGTH);
        NumberArray result = new NumberArray(length);
        while (result.size()<length){
            result.add(new Random().nextInt());
        }
        return result;
    }

    public NumberArray FileReaderNumberArray(String path){
            NumberArray result = null;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String read;
                read = reader.readLine();
                String [] str = read.split(",");
                result = new NumberArray(str.length*2);
                for(String s: str) {
                    int intA = Integer.parseInt(s);
                    result.add(intA);
                }
            }
            catch (FileNotFoundException e){
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(DEFAULT_FILE));
                    String read;
                    read = reader.readLine();
                    String [] str = read.split(",");
                    result = new NumberArray(str.length*2);
                    for(String s: str) {
                        int intA = Integer.parseInt(s);
                        result.add(intA);
                    }
                } catch (FileNotFoundException e1) {
                    logger.error(e.getMessage());
                }
                catch (IOException e1){
                   logger.error(e.getMessage());
                }
            }
            catch (IOException e){
                logger.error(e.getMessage());
            }
            return result;
    }
}
