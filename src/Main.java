import Input.EnterText;
import Input.SaveFile;
import Person.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //EnterText et = new EnterText();
        Person p1 = new Person("Петров Андрей Сидорович 2001.11.01 123 m");
        SaveFile sf1 = new SaveFile(p1);
        Person p2 = new Person("Сидоров Андрей Сидорович 2001.11.01 124 m");
        SaveFile sf2 = new SaveFile(p2);
        Person p3 = new Person("Ананьев Андрей Сидорович 2001.11.01 125 m");
        SaveFile sf3 = new SaveFile(p3);
        Person p4 = new Person("Курылев Андрей Сидорович 2001.11.01 126 m");
        SaveFile sf4= new SaveFile(p4);
        System.out.println(p1);

    }
}