package sk.kosickaakademia.mizak.programko.File;

import javax.imageio.IIOException;
import java.io.*;


public class FileReader extends Reader {
    public FileReader(String fileName) {
    }
    public FileReader() {
    }
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }
    @Override
    public void close() throws IOException {
    }
    public void FileReaderProgram(String fileName){
        BufferedReader reader;
        try{
            FileReader fr=new FileReader(fileName);
            reader=new BufferedReader(fr);
            String line;
            while((line=reader.readLine())!=null){
                line=line.toUpperCase();
                System.out.println(line);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}