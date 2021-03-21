package com.cybertek.tests;

import com.cybertek.pages.GasMileageCalculatorPage;
import com.cybertek.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GasMileageCalculator {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    FileInputStream fileInputStream;
    FileOutputStream fileOutputStream;
    GasMileageCalculatorPage gasMileageCalculatorPage=new GasMileageCalculatorPage();



    @Test
    public void gas_mileage_calculation() throws IOException {

        Driver.getDriver().get("https://www.calculator.net/gas-mileage-calculator.html");
        //Get the path from Content Root
        String path="src/test/resources/testData/practice2.xlsx";
        //loading the file into inputStream object
        fileInputStream=new FileInputStream(path);
        //loading the workbook to the class
        workbook=new XSSFWorkbook(fileInputStream);

        //opening sheet
        sheet=workbook.getSheet("Practice2");

        for (int rowNum = 1; rowNum <sheet.getLastRowNum() ; rowNum++) {

            XSSFRow currentRow = sheet.getRow(rowNum);

            //entering current odometer reading
            // double current=123000;
            double current = currentRow.getCell(1).getNumericCellValue();


            //clearing the input box before entering any data
            gasMileageCalculatorPage.inputCurrentOdo.clear();
            //We need to pass 'double' into input box
            gasMileageCalculatorPage.inputCurrentOdo.sendKeys(String.valueOf(current));

            // double previous=122000;
            double previous = currentRow.getCell(2).getNumericCellValue();

            gasMileageCalculatorPage.inputPreviousOdo.clear();
            gasMileageCalculatorPage.inputPreviousOdo.sendKeys(String.valueOf(previous));

            //how many gallons of gas used
            //   double gas=70;
            double gas = currentRow.getCell(3).getNumericCellValue();

            gasMileageCalculatorPage.inputGas.clear();
            gasMileageCalculatorPage.inputGas.sendKeys(String.valueOf(gas));
            //click to calculate button
            gasMileageCalculatorPage.calculateButton.click();

            //how does the calculation of AVG/MPG work
            //(current-previous)/gallons-->avg MPG
            double expectedResult = (current - previous) / gas;

            System.out.println("expectedResult = " + expectedResult);

            //actual result-->14.29-->split" "-->{"14.29","mpg"}
            String[] actualResultArr = gasMileageCalculatorPage.resultInGas.getText().split(" ");
            System.out.println("actualResultArr = " + actualResultArr[0]);

            //Task to round expected result into looking like actual result

            String actual = actualResultArr[0];
            String expected = String.valueOf(expectedResult);

            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String formattedExpected = decimalFormat.format(expectedResult);
            System.out.println("formattedExpected = " + formattedExpected);

            if (currentRow.createCell(4) == null) {
                currentRow.createCell(4);
            }

//passing the 'formattedExpected' into our excel Sheet "Expected"cell
            currentRow.createCell(4).setCellValue(formattedExpected);


            if (currentRow.createCell(5) == null) {
                currentRow.createCell(5);
            }
            currentRow.createCell(5).setCellValue(actual);

            if (currentRow.createCell(6) == null) {
                currentRow.createCell(6);
            }

            if (actual.equals(formattedExpected)) {
                // System.out.println("PASS!");
                currentRow.getCell(6).setCellValue("Pass!");
            } else {
                //  System.out.println("FAIL!");
                currentRow.getCell(6).setCellValue("FAIL!");
            }

            if (currentRow.createCell(7) == null) {
                currentRow.createCell(7);
            }
            DateTimeFormatter DTF = DateTimeFormatter.ofPattern("hh:mm:ss a");
            currentRow.getCell(7).setCellValue(LocalDateTime.now().format(DTF));


        }


//we must write into excel file using .write method

        fileOutputStream =new FileOutputStream(path);
        workbook.write(fileOutputStream);

        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();












    }
}
