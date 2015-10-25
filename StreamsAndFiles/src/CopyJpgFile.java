package com.softuni3;

import java.io.*;

/**
 * Created by pow2 on 22.10.2015 y.
 *
 * Write a program that copies the contents of a .jpg file to another
 * using FileInputStream, FileOutputStream, and byte[] buffer.
 * Set the name of the new file as my-copied-picture.jpg.
 */
public class CopyJpgFile {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("res/mm.jpg");
                FileOutputStream fos = new FileOutputStream("res/my-copied-picture.jpg")
        ){
            byte[] buffer = new byte[512];
            int bytes;
            while (true) {
                bytes = fis.read(buffer, 0, buffer.length);
                if(bytes <= 0) break;
                fos.write(buffer, 0, bytes);
            }
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
