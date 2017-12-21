package at.aau.itec.esop17.lesson11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ReadFromFile {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("./assets/names.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        LinkedList listOfNames = new LinkedList();
        while (line!=null) {
            listOfNames.add(line);
            line = br.readLine();
        }
        // Sort
        Collections.sort(listOfNames);
        // print to stdout
        for (Iterator iterator = listOfNames.iterator(); iterator.hasNext(); ) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
    }
}
