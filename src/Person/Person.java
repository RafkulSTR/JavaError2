
package Person;

import Error.PersonError;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {
    private String fam;
    private String name;
    private String surname;
    private Date datebird;
    private int telefon;
    private char sex;
    private PersonError personError;

    public Person (String text) throws Exception {

        String[] parse = text.split(" ");

        if (parse.length != 6)  personError.ErrorP(1);
        if (parse.length == 6){
            this.fam = parse[0];
            this.name = parse[1];
            this.surname = parse[2];
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
            try {
            this.datebird =  format.parse(parse[3]);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
            try {
                this.telefon = Integer.parseInt(parse[4]);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            if (parse[5].length() == 1 && (parse[5].equals("f") || parse[5].equals("m") )){
                this.sex = parse[5].charAt(0);
            }
            else throw new Exception("Введено не правильное значение");
        }

    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(this.fam);
        result.append(" ");
        result.append(this.name);
        result.append(" ");
        result.append(this.surname);
        result.append(" ");
        result.append(this.datebird);
        result.append(" ");
        result.append(this.sex);
        return result.toString();

    }

    public String getFam() {
        return fam;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDatebird() {
        return datebird;
    }

    public int getTelefon() {
        return telefon;
    }

    public char getSex() {
        return sex;
    }
}
