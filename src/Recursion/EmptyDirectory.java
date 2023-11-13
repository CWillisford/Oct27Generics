package Recursion;

import java.io.File;

public class EmptyDirectory {
    public static void main(String[] args) {

    }

    public static void findEmptyDirectory(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            if(files != null){
                if(files.length == 0){ //base case
                    System.out.println("This is an empty directory. " + file.getAbsolutePath());
                }
                else{
                    for(File x : files){
                        findEmptyDirectory(file);
                    }
                }
            }
        }
    }
}
