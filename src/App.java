import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class App {
    static String st;
    public static void main (String args []) throws JsonParseException, JsonMappingException, IOException
    { 
        Scanner scanner = new Scanner(System.in);
        JsonFile jsonFile = new JsonFile();
        ArrayList<Facultet> facultets = new Facultet().getAll();
        System.out.println("Введите код действия:");
        // System.out.println("1. Вывести все факультеты\n2. Отсортировать факультеты по количеству кафедр\n3. Изменить название факультета\n4. Удалить факультет\n5. Вывести все кафедры выбранного факультета.\n6. Изменить факультет\n7. Удалить факультет\n8. Создать факультет\n9. Вывести все специализации выбранной кафедры\n10. Изменить специальность\n11. Удалить специальность\n12. Создать специальность\n13. Вывести все предметы выбранной специальности\n14. Изменить предмет\n15. Удалить предмет\n16. Создать предмет\n17. Вывести всю литературу выбранного предмета\n18. Изменить литературу\n19. Удалить литературу\n20. Создать литерутуру");
        //Сделать вывод факультетов
        String key = scanner.nextLine();
        switch (key) {
            case "1": // Вывод всех факультетов
                for (Facultet fac : facultets) {
                    System.out.println("\n"+fac.toStringOnly());
                }
                System.out.println("Введите абревиатуру выбранного факультета: ");
                String keyFacultet = scanner.nextLine();
                System.out.println(" "+facultets.get(0).getName());
                System.out.println(keyFacultet);
                System.out.println(" "+facultets.get(0).getName().indexOf(keyFacultet));
                // Facultet facultet = facultets.stream().filter(e -> (e.getName().indexOf(keyFacultet) != -1)).findFirst().orElse(null);
                // System.out.println("1. Отсортировать факультеты по количеству кафедр\n2. Изменить название факультета\n3. Удалить факультет\n6. Вывести все кафедры выбранного факультета.\n7. Изменить факультет\n8. Создать факультет");
                // key = scanner.nextLine();
                switch (key) {
                    case "1":
                        
                        break;
                
                    default:
                        break;
                }
                break;
            case "выход": return;
            default: break;
        }
    }
}
