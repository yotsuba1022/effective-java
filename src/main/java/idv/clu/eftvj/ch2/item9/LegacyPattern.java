package idv.clu.eftvj.ch2.item9;

import java.io.*;

/**
 * @author Carl Lu
 */
public class LegacyPattern {

    private final static int BUFFER_SIZE = 1024;

    public static String firstLineOfFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            return bufferedReader.readLine();
        } finally {
            bufferedReader.close();
        }
    }

    public static void copy(String src, String dest) throws IOException {
        InputStream inputStream = new FileInputStream(src);
        try {
            OutputStream outputStream = new FileOutputStream(dest);
            try {
                byte[] buffer = new byte[BUFFER_SIZE];
                int readCount;
                while (( readCount = inputStream.read(buffer) ) >= 0) {
                    outputStream.write(buffer, 0, readCount);
                }
            } finally {
                outputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

}
