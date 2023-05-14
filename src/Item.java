public class Item {
    private long id; // Код
    private String name; // Название
    private double amountHours; // Количество часов
    private String fioTeacher; // ФИО учителя
    private int semestr; // Семестр
    private Literature[] literature; // Литература

    public String toString() {
        String str = "\n\t\t\tНазвание: "+this.getName()+
                "\n\t\t\tКоличество часов: "+this.getAmountHours()+
                "\n\t\t\tФИО учителя: "+this.getFioTeacher()+
                "\n\t\t\tСеместр: "+this.getSemestr()+
                "\n\t\t\tЛитература: "+this.stringLiterature();

        return str;
    }

    public String stringLiterature() {
        String st = "";

        for (Literature lit : literature) {
            st += lit.toString();
        }

        return st;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmountHours() {
        return amountHours;
    }

    public String getFioTeacher() {
        return fioTeacher;
    }

    public int getSemestr() {
        return semestr;
    }

    public Literature[] getLiterature() {
        return literature;
    }


    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Введите название предмета:");
            setName(name);
        } else {
            this.name = name;
        }
    }

    public void setFioTeacher(String fioTeacher) {
        if (fioTeacher.isEmpty()) {
            System.out.println("Введите ФИО преподавателя:");
            setFioTeacher(fioTeacher);
        } else {
            this.fioTeacher = fioTeacher;
        }
    }

    public void setAmountHours(double amountHours) {
        if (amountHours < 1) {
            System.out.println("Введите колличество часов:");
            setAmountHours(amountHours);
        } else {
            this.amountHours = amountHours;
        }
    }

    public void setSemestr(int semestr) {
        if (semestr < 1) {
            System.out.println("Введите семестр:");
            setSemestr(semestr);
        } else {
            this.semestr = semestr;
        }
    }

    public void setLiterature(Literature[] literature) {
        this.literature = literature;
    }
}
