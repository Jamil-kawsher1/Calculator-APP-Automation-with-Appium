package Screen;

import Setup.Setup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_0")
    AndroidElement btn0;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_1")
    AndroidElement btn1;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_2")
    AndroidElement btn2;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_3")
    AndroidElement btn3;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_4")
    AndroidElement btn4;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_5")
    AndroidElement btn5;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_6")
    AndroidElement btn6;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_7")
    AndroidElement btn7;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_8")
    AndroidElement btn8;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_9")
    AndroidElement btn9;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = Setup.PACKAGE_ID + ":id/eq")
    AndroidElement btnEqual;

    @FindBy(id = Setup.PACKAGE_ID + ":id/result_final")
    AndroidElement resultFinal;
    @FindBy(id = Setup.PACKAGE_ID + ":id/clr")
    public AndroidElement btnClear;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_sub")
    public AndroidElement btnSub;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_mul")
    public AndroidElement btnMul;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_div")
    public AndroidElement btnDiv;
    @FindBy(id = Setup.PACKAGE_ID + ":id/formula")
    public AndroidElement formulaScreen;
    @FindBy(id = Setup.PACKAGE_ID + ":id/parens")
    public AndroidElement leftRightParenthisis;


    public static String sumResult;
    public static String subResult;
    public static String multiResult;

    public CalcScreen (AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }

    public String doSum () {
        btn9.click();
        btnPlus.click();
        btn5.click();
        btnEqual.click();
        sumResult = resultFinal.getText();
        return sumResult;
    }

    public String doSub () {
        btn8.click();
        btnSub.click();
        btn3.click();
        btnEqual.click();
        subResult = resultFinal.getText();
        return subResult;
    }

    public String doMultiplication () {
        btnClear.click();
        String[] arr = sumResult.split("");
        String[] subArr = subResult.split("");
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "0":
                    btn0.click();
                    break;
                case "1":
                    btn1.click();
                    break;
                case "2":
                    btn2.click();
                    break;
                case "3":
                    btn3.click();
                    break;
                case "4":
                    btn4.click();
                    break;
                case "5":
                    btn5.click();
                    break;
                case "6":
                    btn6.click();
                    break;
                case "7":
                    btn7.click();
                    break;
                case "8":
                    btn8.click();
                    break;
                case "9":
                    btn9.click();
                    break;
            }
        }
        //clicking on Multiplication
        btnMul.click();
        for (int i = 0; i < subArr.length; i++) {
            switch (subArr[i]) {
                case "0":
                    btn0.click();
                    break;
                case "1":
                    btn1.click();
                    break;
                case "2":
                    btn2.click();
                    break;
                case "3":
                    btn3.click();
                    break;
                case "4":
                    btn4.click();
                    break;
                case "5":
                    btn5.click();
                    break;
                case "6":
                    btn6.click();
                    break;
                case "7":
                    btn7.click();
                    break;
                case "8":
                    btn8.click();
                    break;
                case "9":
                    btn9.click();
                    break;
            }
        }
//clicking on Equal
        btnEqual.click();

multiResult=resultFinal.getText();
        return multiResult;
    }

    public String doDivision () {
        btnClear.click();
        String[] arr = multiResult.split("");

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "0":
                    btn0.click();
                    break;
                case "1":
                    btn1.click();
                    break;
                case "2":
                    btn2.click();
                    break;
                case "3":
                    btn3.click();
                    break;
                case "4":
                    btn4.click();
                    break;
                case "5":
                    btn5.click();
                    break;
                case "6":
                    btn6.click();
                    break;
                case "7":
                    btn7.click();
                    break;
                case "8":
                    btn8.click();
                    break;
                case "9":
                    btn9.click();
                    break;
            }
        }
        //clicking on Division
        btnDiv.click();
        btn1.click();
        btn0.click();

//clicking on Equal
        btnEqual.click();


        return resultFinal.getText();
    }

    public String doSolveTheSeries() throws InterruptedException {
Thread.sleep(2000);
leftRightParenthisis.click();
        btn1.click();
        btn0.click();
        btn0.click();
btnPlus.click();

        btn2.click();
        btn0.click();
        btn0.click();

        btnSub.click();

        btn1.click();
        btn0.click();
        btn0.click();

        btnMul.click();

        btn2.click();
        btnDiv.click();
        btn5.click();

        leftRightParenthisis.click();

        btnEqual.click();

        return  resultFinal.getText();
    }
}
