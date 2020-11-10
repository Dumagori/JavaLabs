package laba4;

import com.google.gson.Gson;
import laba4.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UniversityWriter {
    Gson gson;

    public UniversityWriter(Gson gson){
        this.gson=gson;
    }

    public void writeToFile(University university) throws IOException{
        String univerJson = gson.toJson((university));
        FileWriter fileWriter = new FileWriter("univer.json");
        fileWriter.write(univerJson);
        fileWriter.flush();
        fileWriter.close();
    }

    public University readFromFile (University university) throws IOException{
        FileReader fileReader = new FileReader("univer.json");
        String univerJson = new Scanner(fileReader).next();
        fileReader.close();

        return gson.fromJson(univerJson, University.class);
    }
}
