import java.io.IOException;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class App {
    static String st;
    public static void main (String args []) throws JsonParseException, JsonMappingException, IOException
    { 
        Scanner scanner = new Scanner(System.in);
        JsonFile jsonFile = new JsonFile();
        Facultet facultet = new Facultet();
        System.out.println("Введите код действия:");
        System.out.println("1. Вывести все факультеты\n2. Отсортировать факультеты по количеству кафедр\n3. Изменить название факультета\n4. Удалить факультет\n5. Вывести все кафедры выбранного факультета.\n6. Изменить факультет\n7. Удалить факультет\n8. Создать факультет\n9. Вывести все специализации выбранной кафедры\n10. Изменить специальность\n11. Удалить специальность\n12. Создать специальность\n13. Вывести все предметы выбранной специальности\n14. Изменить предмет\n15. Удалить предмет\n16. Создать предмет\n17. Вывести всю литературу выбранного предмета\n18. Изменить литературу\n19. Удалить литературу\n20. Создать литерутуру");
        //Сделать вывод факультетов
        String key = scanner.nextLine();
        switch (key) {
            case "1": // Вывод всех факультетов
                for (Facultet fac : facultet.getAll()) {
                    System.out.println("\n"+fac.toString());
                }
                break;
            case "2": // Отсортировать факультеты по количеству кафедр
                
                break;
            case "3":
                
                break;
            case "4":
                
                break;
            default:
                break;
        }
    }
}
