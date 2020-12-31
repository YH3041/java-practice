package chap26;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String args[]) {
        ManageObject manager = new ManageObject();
        String fullPath = "c://" + "basicjava" + separator + "text" + separator + "serial.obj";

        SerialDTO dto = new SerialDTO("JavabasicBook", 1, true, 100);
        manager.saveObject(fullPath, dto);
    }

    public void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutput oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("Write Success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
