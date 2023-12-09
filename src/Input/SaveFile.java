package Input;
import Person.Person;

import java.io.*;

public class SaveFile {
    private String namefile;

    public SaveFile(Person person) throws IOException {
        namefile = person.getFam() + ".txt";
        NewSaveFile(person);
    }

    public void NewSaveFile(Person person) throws IOException {
        String str = "<"+person.getFam()+">"+
        "<"+person.getName()+">"+
        "<"+person.getSurname()+">"+
        "<"+person.getDatebird()+">"+
        "<"+person.getTelefon()+">"+
        "<"+person.getSex()+">";
        File file = new File(namefile);
        if (file.exists()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            try {
                bw.write(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                bw.close();
            }
        }else{
            PrintWriter pw = new PrintWriter(file);
            try {
                pw.println(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                pw.close();
            }
        }
    }
}
