package com.softuni3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pow2 on 22.10.2015 y.
 *
 * Write a program that saves and loads the information from an ArrayList
 * to a file using ObjectInputStream, ObjectOutputStream.
 * Set the name of the new file as doubles.list
 */
public class SaveAnArrayListOfDoubles {

    private static void load() {
        try(
                ObjectInputStream oIS = new ObjectInputStream(new FileInputStream("res/doubles.list"))
        ) {
            while (oIS.available()>0){
                System.out.println(oIS.readDouble());
            }
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void save(List<Double> doublesL) {
        try(
                ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream("res/doubles.list"))
        ) {
            for (Double each : doublesL) {
                oOS.writeDouble(each);
            }
        }
        catch (IOException ioex){
            ioex.printStackTrace();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        List<Double> doublesL = new ArrayList<>();
        doublesL.addAll(Arrays.asList(1.2222222, 2.55555889, 56.554));
        save(doublesL);
        load();
    }
}
