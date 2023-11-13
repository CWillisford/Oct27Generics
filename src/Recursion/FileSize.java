package Recursion;

import java.io.File;

public class FileSize {
    public static long getSize(File file){
        int total = 0;
        if(file.isDirectory()) {
            File[] fileList = file.listFiles(); //returns all list of files
            //iterate array
            for(int i=0; i < fileList.length; i++){
                total += getSize(fileList[i]);
            }
        }
        else {
            total += file.length();
        }
        return total;
    }
}
