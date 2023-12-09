package Error;

public class PersonError {
    private String errtext;

    public String ErrorP(int errnumber) {
        if (errnumber == 1)
        {
            return "Вы ввели количество данных не совпадающих по количеству";
        }
        return "Ошибок нет";
    }
}
