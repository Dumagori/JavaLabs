package laba4;

import com.google.gson.Gson;
import laba3.model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UniversityWriter {


    public void writeToFile(University university){
        Gson gson = new Gson();

        String univerJson = gson.toJson(university);

        try {
            FileWriter fileWriter = new FileWriter("university.json");
            fileWriter.write(univerJson);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public University readFromFile (){
        Gson gson = new Gson();
        try{
            return gson.fromJson(new FileReader("university.json"), University.class);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return null;
    }
}
