package Beans;

import java.io.*;

class LogTyper {


    private File logFile;
    private BufferedWriter writer;


    private static LogTyper instance = new LogTyper();

    private LogTyper() {
        try {
            logFile = new File("log.txt");
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static LogTyper getInstance() {
        return instance;
    }

    synchronized void write(String content){
        try {
            writer.write(content);
            writer.newLine();
            writer.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
