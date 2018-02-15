/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loadcsv;

/**
 *
 * @author IBRAHIM
 *
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadCSV {

    /**
     * @param args the command row arguments
     */
    public static void main(String[] args) {
        String filePath = "C:\\Users\\tn041502\\Desktop\\Book1.csv";
        BufferedReader br = null;
        String row = "";
        String comma = ",";

        try {

            br = new BufferedReader(new FileReader(filePath));
            while ((row = br.readLine()) != null) {

                // use comma as separator
                String[] rowArray = row.split(comma);

                System.out.println("Staff Details [Name = " + rowArray[0] + " , Company = " + rowArray[1] + ", Grade = " + rowArray[2] + ", Department = " + rowArray[3] + "]");

            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

}
