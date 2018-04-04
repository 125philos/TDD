package prog;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteRead {

	private static final StringBuilder builder;

    static {
        builder = new StringBuilder();
    }

    /*
     * Метод, направленный на чтение зашифрованной либо расшифрованной информации из файла.
     * @param fileName - наименование файла, который требуется прочитать, тип String.
     * @return - файл с данными, если не удалось записать, то выйдим по исключению, 
     * иначе вернет считанную информацию из файла.
     * */
    public static String readStringFile(String fileName) {
        builder.setLength(0);
        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(
                    new FileInputStream(fileName));
            while (dataInputStream.available() > 0) {
                builder.append((char)dataInputStream.read());
            }
        } catch (IOException ex) {
            return null;
        }
        return builder.toString();
    }

    /*
     * Метод, направленный на запись зашифрованной либо расшифрованной информации в файл.
     * @param data - строка, которую требуется записать, тип String,
     * @param fileName - наименование файла, в который требуется записать, тип String.
     * @return - файл с данными, если не удалось записать, то выйдим по исключению.
     * */
    public static void writeStringFile(String data, String fileName) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(
                    new FileOutputStream(new File(fileName)));
            for (int i = 0; i < data.length(); i++) {
                dataOutputStream.write(data.charAt(i));
            }
            dataOutputStream.close();
        } catch (IOException ex) { }
    }
}
