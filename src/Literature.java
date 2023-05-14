public class Literature{
    private long id; // Код
    private String name; // Название
    private String fioAuthor; // ФИО автора
    private String dateOfPublication; // Дата публикации

    public String toString() {
        String str =  "\n\t\t\t\tНазвание: "+this.getName()+
                "\n\t\t\t\tФИО автора: "+this.getFioAuthor()+
                "\n\t\t\t\tДата публикации: "+this.getDateOfPublication();

        return str;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFioAuthor() {
        return fioAuthor;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    
    
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Введите название книги:");
            setName(name);
        } else {
            this.name = name;
        }
    }

    public void setFioAuthor(String fioAuthor) {
        if (fioAuthor.isEmpty()) {
            System.out.println("Введите ФИО преподавателя:");
            setFioAuthor(fioAuthor);
        } else {
            this.fioAuthor = fioAuthor;
        }
    }

    public void setDateOfPublication(String dateOfPublication) {
        if (dateOfPublication.isEmpty()) {
            System.out.println("Введите дату издания книги в формате dd MM yyyy (Пример: 21 06 1997):");
            setDateOfPublication(dateOfPublication);
        } else {
            this.dateOfPublication = dateOfPublication;
        }
    }
}
