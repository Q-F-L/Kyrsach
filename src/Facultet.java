import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Facultet {
    private String name; // Название
    private String fioDekana; // ФИО Декана
    private String phoneNumber; // Номер телефона
    private Kafedra[] kafedra; // Кафедры

    public int counter(){ // Количество элементов в массиве Кафедра
        return kafedra.length;
    }

    public String toStringOnly() {
        String str = "\nНазвание: "+this.getName()+
            "\nФИО Декана: "+this.getFioDekana()+
            "\nНомер телефона: "+this.getPhoneNumber();

        return str;
    }

    public String toString() {
        String str = "\nНазвание: "+this.getName()+
            "\nФИО Декана: "+this.getFioDekana()+
            "\nНомер телефона: "+this.getPhoneNumber()+
            "\nКафедры: "+this.stringKafedra();

        return str;
    }

    public String stringKafedra() {
        String st = "";

        for (Kafedra kaf : kafedra) {
            st += kaf.toString();
        }

        return st;
    }

    /*
     * Вывести все факультеты
     */
    public ArrayList<Facultet> getAll() throws JsonParseException, JsonMappingException, IOException
    {
        JsonFile json = new JsonFile();
        ArrayList<Facultet> facultets = new ArrayList<Facultet>();

        for (int i = 0; i < json.getAll().size(); i++) {
            facultets.add(json.readJson(json.getAll().get(i)));
        }

        return facultets;
    }

    public void createFacultet()
    {
        JsonFile file = new JsonFile();
        file.createFile(name);
        try{
            file.writeJson(this, name);
        } catch(IOException e) {
            System.out.println("Ошибка ввода/вывода.");
            e.printStackTrace();
        };
    }

    public String getName() {
        return name;
    }

    public String getFioDekana() {
        return fioDekana;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Kafedra[] getKafedra() {
        return kafedra;
    }


    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Введите название факультета:");
            setName(name);
        } else {
            this.name = name;
        }
    }

    public void setFioDekana(String fioDekana) {
        if (fioDekana.isEmpty()) {
            System.out.println("Введите ФИО декана:");
            setFioDekana(fioDekana);
        } else {
            this.fioDekana = fioDekana;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()) {
            this.phoneNumber = "Нет номера телефона.";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setKafedra(Kafedra[] kafedra) {
        this.kafedra = kafedra;
    }
}
