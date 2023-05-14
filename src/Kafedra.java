public class Kafedra{
    private long id; // Код
    private String name; // Название
    private String fioZavKafedri; // ФИО зам.кафедры
    private String phoneNumber; // Номер телефона
    private int amountPC; // Количество компьютеров
    private Specialnost[] specialnost; // Специальности

    public String toString() {
        String str = "\n\tНазвание: "+this.getName()+
            "\n\tФИО зам.кафедры: "+this.getFioZavKafedri()+
            "\n\tНомер телефона: "+this.getPhoneNumber()+
            "\n\tКоличество компьютеров: "+this.getAmountPC()+
            "\n\tСпециальности: "+this.stringSpecialnost();

        return str;
    }

    public String stringSpecialnost() {
        String st = "";

        for (Specialnost sp : specialnost) {
            st+=sp.toString();
        }

        return st;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFioZavKafedri() {
        return fioZavKafedri;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAmountPC() {
        return amountPC;
    }

    public Specialnost[] getSpecialnost() {
        return specialnost;
    }


    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Введите название кафедры:");
            setName(name);
        } else {
            this.name = name;
        }
    }

    public void setFioZavKafedri(String fioZavKafedri) {
        if (fioZavKafedri.isEmpty()) {
            System.out.println("Введите ФИО зав.кафедры:");
            setFioZavKafedri(fioZavKafedri);
        } else {
            this.fioZavKafedri = fioZavKafedri;
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.isEmpty()) {
            this.phoneNumber = "Нет номера телефона.";
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public void setAmountPC(int amountPC) {
        if (amountPC < 1) {
            this.amountPC = 0;
        } else {
            this.amountPC = amountPC;
        }
    }

    public void setSpecialnost(Specialnost[] specialnost) {
        this.specialnost = specialnost;
    }
}
