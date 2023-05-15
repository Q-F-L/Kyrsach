import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonFile {
    String path = "src/dataBase/"; // Путь к базе данных
    ObjectMapper mapper = new ObjectMapper ();
    Facultet facultet;

    /*
     * Вывести все названия фалов в дикертории path
     */
    public ArrayList<String> getAll()
    {
        File myObj = new File(path);
        ArrayList<String> array = new ArrayList<String>();

        for (String string : myObj.list()) {
            array.add(string);
        }

        return array;
    }

    /*
     * Показать все названия фалов в дикертории path без расширения
     */
    public void viewAll()
    {
        File myObj = new File(path);
        
        for (String string : myObj.list()) {
            System.out.print(string.substring(0, string.length()-5)+"\n");
        }
    }

    /*
     * Создание файла
     */
    public void createFile(String fileName)
    {
        try {
            File myObj = new File(path+fileName+".json");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
     * Удаление файла
     */
    public void deleteFile(String fileName)
    {
        File myObj = new File(path+fileName+".json");
        if (myObj.delete()) {
            System.out.println("File delete: " + myObj.getName());
        } else {
            System.out.println("File already noexists.");
        }
    }

    /*
    * Запись в файл
    */
    public void writeJson(Facultet facultet, String fileOutput) throws IOException, StreamReadException, DatabindException
    {
        ObjectMapper mapper = new ObjectMapper ();	
        mapper.writeValue(new File(path+fileOutput), facultet);
    }

    /*
     * Чтение файла
     */
    public Facultet readJson(String fileInput) throws JsonParseException, JsonMappingException, IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        Facultet facultet = mapper.readValue(new File(path+fileInput), Facultet.class);
        return facultet;
    }
}
