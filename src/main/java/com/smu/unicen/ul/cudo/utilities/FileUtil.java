package com.smu.unicen.ul.cudo.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FileUtil {
	
	
	public static List<CSVRecord> readFile(String inputFilePath, char delimiter) throws Exception {
		Reader in=null;
        
        in = new FileReader(inputFilePath); 
        List<CSVRecord> records = CSVFormat.EXCEL.withDelimiter(delimiter).parse(in).getRecords(); // Get all records from CSV (Excel format)
        if(in!=null) in.close();
        
        return records;
        
    }
}
