package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {

    /*
    In this test we will be reading from excel file
     */

    @Test
    public void excel_read_test() throws IOException {

String path="PracticeData.xlsx";
//to be able to read from excel file we need to load the file
        FileInputStream fileInputStream=new FileInputStream(path);

        //workbook >sheet>row>cell

        //we created workbook instance and loaded with "practice data"file
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);

        //create the sheet and pass the name of the sheet we want to work on
        XSSFSheet sheet=workbook.getSheet("EmployeePractice");

        //Row->sheet
        System.out.println("sheet.getRow(1).getCell(0) = " + sheet.getRow(1).getCell(0));

       //print out "singer"form excel sheet
        System.out.println("sheet.getRow(3).getCell(2) = " + sheet.getRow(3).getCell(2));

        //returns the count of used cells only
        //if there are cells not used they will not be counted
        //starts from counting 1
        int usedRows=sheet.getPhysicalNumberOfRows();
        System.out.println("usedRows = " + usedRows);

        //returns the count form top to bottom
        //even counts if there are empty cells
        //this starts counting from 0
        int lastUsedRow=sheet.getLastRowNum();
        System.out.println("lastUsedRow = " + lastUsedRow);

        //TODO: 1-CREATE A LOGIC TO PRINT OUT NEENA'S NAME DYNAMICALLY

        for (int rowNum = 0; rowNum <usedRows ; rowNum++) {
            XSSFCell currentCell= sheet.getRow(rowNum).getCell(0);

            // sheet.getRow(4).getCell(0);
          if( currentCell.toString().equals("Neena")){
              System.out.println("current cell = " + currentCell);
          }
        }


       //TODO: 2-create a logic to print out adam sandler's last name dynamically


        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            XSSFCell currentCell1=sheet.getRow(rowNum).getCell(1);
            if(currentCell1.toString().equals("Sandler")){
                System.out.println("currentCell1 = " + currentCell1);
            }
        }

        //TODO: 3- CREATE A LOGIC TO PRINT OUT STEVEN KING'S JOB ID DYNAMICALLY
        // CHECK FOR LAST NAME, IF IT IS KING, PRINT OUT JOB_ID
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            XSSFCell currentCell1=sheet.getRow(rowNum).getCell(1);
                    if(currentCell1.toString().equals("King")){
                        System.out.println("Job ID = " + sheet.getRow(rowNum).getCell(2));
                    }
        }




    }
}
