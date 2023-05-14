public class Specialnost {
    private long id; // Код
    private String name; // Название
    private double lengthOfStudy; // Длинна обучения
    private Item[] items; // Предметы

    public String toString() {
        String str = "\n\t\tНазвание: "+this.getName()+
            "\n\t\tДлинна обучения: "+this.getLengthOfStudy()+
            "\n\t\tПредметы: "+this.stringItems();

        return str;
    }

    public String stringItems() {
        String st = "";

        for (Item item : items) {
            st += item.toString();
        }

        return st;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public double getLengthOfStudy() {
        return lengthOfStudy;
    }

    public Item[] getItems() {
        return items;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Введите название специальности:");
            setName(name);
        } else {
            this.name = name;
        }
    }

    public void setLengthOfStudy(double lengthOfStudy) {
        if(lengthOfStudy < 1) {
            System.out.println("Введите продолжительность обучения:");
            setLengthOfStudy(lengthOfStudy);
        } else {
            this.lengthOfStudy = lengthOfStudy;
        }
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
}
