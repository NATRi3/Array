package edu.epam.day4.task.service;

import edu.epam.day4.task.app.App;
import edu.epam.day4.task.array.NumberArray;

import java.io.*;
import java.util.Random;

public class ArrayCreatorService {
    private static final int MAX_ARRAY_LENGTH = 100;
    private static final File DEFAULT_FILE =
            new File("C:\\Users\\User\\Documents\\GitHub\\Array\\Array\\data\\data.txt");
    public NumberArray CreateRandomNumberArray(){
        int length = new Random().nextInt(MAX_ARRAY_LENGTH);
        NumberArray result = new NumberArray();
        while (result.length()<length){
            result.add(new Random().nextInt());
        }
        return result;
    }

    public NumberArray FileReaderNumberArray(String path){
            NumberArray result = null;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String read;
                while ((read = reader.readLine()) != null) {
                    result.add(Integer.parseInt(read));
                }
            }
            catch (FileNotFoundException e){
                try {
                   BufferedReader reader = new BufferedReader(new FileReader(DEFAULT_FILE));
                    String read;
                    while ((read = reader.readLine()) != null) {
                        result.add(Integer.parseInt(read));
                    }
                } catch (FileNotFoundException e1) {
                    App.logger.error(e.getMessage());
                }
                catch (IOException e1){
                    App.logger.error(e.getMessage());
                }
            }
            catch (IOException e){
                App.logger.error(e.getMessage());
            }
            return result;
    }
}
