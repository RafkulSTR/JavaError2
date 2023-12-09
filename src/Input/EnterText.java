package Input;
import java.util.Scanner;
public class EnterText {
    private String persontext;


    public  EnterText(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Фамилия Имя Отчество датарождения номертелефона пол(f,m): ");
        persontext = scanner.nextLine();
    }

    public String getPersontext() {
        return persontext;
    }

    /*public void CompleteText(String txt){
        persontext = txt;
    }*/
}
