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
        String filePath = "C:\\Users\\Kolade\\Downloads\\slatecode test.csv";
        BufferedReader br = null;
        String row = "";
        String comma = ",";

        try {

            br = new BufferedReader(new FileReader(filePath));
            while ((row = br.readLine()) != null) {

                // use comma as separator
                String[] rowArray = row.split(comma);

                System.out.println("Row Details [col A = " + rowArray[0] + " , Col B = " + rowArray[1] + ", Col C = " + rowArray[2] + ", Col D = " + rowArray[3] + ", Col E = " + rowArray[4] +", Col F = " + rowArray[5] +",Col G = " + rowArray[6] +", Col H = " + rowArray[7] +",Col I = " + rowArray[8] +",Col J = " + rowArray[9] +"]");

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
