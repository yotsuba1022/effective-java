package idv.clu.eftvj.ch2.item9;

import java.io.*;

/**
 * @author Carl Lu
 */
public class NewPattern {

    private final static int BUFFER_SIZE = 1024;

    public static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        }
    }

    public static void copy(String src, String dest) throws IOException {
        try (InputStream inputStream = new FileInputStream(src); OutputStream outputStream = new FileOutputStream(dest)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int readCount;
            while (( readCount = inputStream.read(buffer) ) >= 0) {
                outputStream.write(buffer, 0, readCount);
            }
        }
    }

}
