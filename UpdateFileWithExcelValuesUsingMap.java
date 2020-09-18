package com.dstsystems.Runner;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 * Created by dt224078 on 9/16/2020.
 */
public class UpdateFilesWithTags {

    String subFolderPath = "";
    HashMap<String, String> ssncTags = execlRead();
    List<String> dirPath;
    int rowCountToUpdate = 0;

    public HashMap<String, String> execlRead() {

        String execlPath = "C:\\Users\\dt224078\\Desktop\\readTestID.xlsx";

        HashMap<String, String> excelVal = new HashMap<String, String>();
        dirPath = new ArrayList<>();

        try {
            File file = new File(execlPath);
            FileInputStream fis = new FileInputStream(file);

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFSheet sheet1 = wb.getSheetAt(1);
            int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
            int rowCount1 = sheet1.getLastRowNum() - sheet.getFirstRowNum();

            for (int i = 1; i < rowCount + 1; i++) {
                Row row = sheet.getRow(i);
                excelVal.put("@".concat(row.getCell(0).getStringCellValue().trim()), "@".concat(row.getCell(1).getStringCellValue().trim()));
                //excelVal.put(row.getCell(0).getStringCellValue().trim(), row.getCell(1).getStringCellValue().trim());
                System.out.println();
            }

            for (int i = 0; i < rowCount1 + 1; i++) {
                Row row = sheet1.getRow(i);
                dirPath.add(row.getCell(0).getStringCellValue().trim());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return excelVal;
    }

    public void excelWrite(String hsxStatus, String path) throws IOException, InvalidFormatException {
        String execlPath = "C:\\Users\\dt224078\\Desktop\\readTestID.xlsx";
        InputStream inp = new FileInputStream(execlPath);
        Workbook wb = WorkbookFactory.create(inp);
        Sheet sheet = wb.getSheetAt(0);
        rowCountToUpdate++;
        Row row = sheet.getRow(rowCountToUpdate);
        row.createCell(2).setCellValue(hsxStatus);
        row.createCell(3).setCellValue(path);
        FileOutputStream fileOut = new FileOutputStream(execlPath);
        wb.write(fileOut);
        fileOut.close();

    }

    public static void main(String args[]) throws IOException, InvalidFormatException {

        UpdateFilesWithTags lf = new UpdateFilesWithTags();
        System.out.println(lf.ssncTags);

        for (String directories : lf.dirPath) {
//            System.out.println(directories);
            try {
                lf.filesReadWrite(directories);

            } catch (FileNotFoundException e) {
                lf.filesReadWrite(lf.subFolderPath);
            }
        }
    }

    public void filesReadWrite(String foldersPath) throws IOException, InvalidFormatException {
        subFolderPath = "";
        File directoryPath;
        File filesList[];
        boolean tagFound = false;

        try {
            directoryPath = new File(foldersPath);

            //List of all files and directories
            filesList = directoryPath.listFiles();
//            System.out.println("List of files and directories in the specified directory:");
            for (File file : filesList) {

                FileReader reader = new FileReader(file.getAbsolutePath());
                BufferedReader bufferedReader = new BufferedReader(reader);
                StringBuilder buffer = new StringBuilder();
                String line;


                while ((line = bufferedReader.readLine()) != null) {
                    buffer.append(line);
                    buffer.append("\r\n");
                }
                reader.close();

                String toWrite = buffer.toString();
                for (Map.Entry<String, String> entry : ssncTags.entrySet()) {
                    if (toWrite.contains(entry.getKey())) {
                        System.out.println("File path: " + file.getAbsolutePath());
                        toWrite = toWrite.replaceAll(entry.getKey(), entry.getValue());
                        FileWriter writer = new FileWriter(file.getAbsolutePath());
                        writer.write(toWrite);
                        writer.close();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            File folders = new File(foldersPath);
            String[] files = folders.list();

            for (String folder : files) {
//                System.out.println(folder);

                subFolderPath = foldersPath + "\\" + folder + "";
                directoryPath = new File(subFolderPath);

//                List of all files and directories
                filesList = directoryPath.listFiles();
//                System.out.println("List of files and directories in the specified directory:");
                for (File file : filesList) {

                    FileReader reader = new FileReader(file.getAbsolutePath());
                    BufferedReader bufferedReader = new BufferedReader(reader);
                    StringBuilder buffer = new StringBuilder();
                    String line;


                    while ((line = bufferedReader.readLine()) != null) {
                        buffer.append(line);
                        buffer.append("\r\n");
                    }
                    reader.close();

                    String toWrite = buffer.toString();
                    for (Map.Entry<String, String> entry : ssncTags.entrySet()) {
                        if (toWrite.contains(entry.getKey())) {
                            System.out.println("File path: " + file.getAbsolutePath());
                            toWrite = toWrite.replaceAll(entry.getKey(), entry.getValue());
                            FileWriter writer = new FileWriter(file.getAbsolutePath());
                            writer.write(toWrite);
                            writer.close();
                        }
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Occured Null pointer exception");
        }
    }
}
