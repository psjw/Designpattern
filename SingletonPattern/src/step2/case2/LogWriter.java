package step2.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {
    private static LogWriter sigleton=new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try {
            bw=new BufferedWriter(new FileWriter("log.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public synchronized void log(String str){
        try {
            bw.write(str+"\n");
            bw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static LogWriter getInstance(){
        return sigleton;
    }

    protected  void finalize(){
        try {
            super.finalize();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }



}
