package com.census;

import java.io.FileWriter;
import java.io.IOException;

public class Census {
    public static void main(String[] args) throws IOException {

        String csvFile = "IndiaStateCensus.csv";
        FileWriter writer = new FileWriter(csvFile);

        // Write header of csv file
        writer.append("State");
        writer.append(',');
        writer.append("Population");
        writer.append(',');
        writer.append("Area (sq. km)");
        writer.append(',');
        writer.append("Density (per sq km)");
        writer.append('\n');

        // Write data
        writer.append("Uttar Pradesh");
        writer.append(',');
        writer.append("199,812,341");
        writer.append(',');
        writer.append("243,290");
        writer.append(',');
        writer.append("828");
        writer.append('\n');

        writer.append("Maharashtra");
        writer.append(',');
        writer.append("112,374,333");
        writer.append(',');
        writer.append("307,713");
        writer.append(',');
        writer.append("366");
        writer.append('\n');

        writer.append("Bihar");
        writer.append(',');
        writer.append("103,804,637");
        writer.append(',');
        writer.append("94,163");
        writer.append(',');
        writer.append("1106");
        writer.append('\n');

        writer.flush();
        writer.close();

        System.out.println("CSV File written successfully.");
    }
}
