package com.MyFirstGame.Flappy.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Snir Dahan on 19-Apr-16.
 */
public class FileUtils {

    private FileUtils(){

    }

    public static String loadAsString(String file){
        StringBuilder result = new StringBuilder();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String buffer = "";
            while((buffer = reader.readLine()) != null){
                result.append(buffer + '\n');
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return result.toString();
    }
}
