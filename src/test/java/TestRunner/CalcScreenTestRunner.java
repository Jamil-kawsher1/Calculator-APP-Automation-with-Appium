package TestRunner;

import Screen.CalcScreen;
import Setup.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class CalcScreenTestRunner extends Setup {
    @Test(priority = 1, description = "DO Sum of Two Numbers", enabled = true)
    public void doSum () throws InterruptedException {
        Thread.sleep(3000);
        CalcScreen calcScreen = new CalcScreen(driver);
        String sum = calcScreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum, "14");
    }

    @Test(priority = 2, description = "Do Sub Of Two numbers", enabled = true)
    public void doSub () throws InterruptedException {
        Thread.sleep(3000);
        CalcScreen calcScreen = new CalcScreen(driver);
        String sub = calcScreen.doSub();
        System.out.println(sub);
        Assert.assertEquals(sub, "5");
    }

    @Test(priority = 3,description = "Do multiply of Result of Sum and Subtraction ")
    public void doMultiplication () throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        Thread.sleep(2000);
       String multi= calcScreen.doMultiplication();
        Assert.assertEquals(multi, "70");

    }

    @Test(priority = 4,description = " Divide the result of multiplication with 10")
    public void  doDivision () throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        Thread.sleep(2000);
        String div= calcScreen.doDivision();
        Assert.assertEquals(div, "7");

    }
    @Test(priority = 5,description = "Solve this series (100+200-100*2/5)")
    public void  doSolveTheSeries () throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        Thread.sleep(2000);
        String series= calcScreen.doSolveTheSeries();
        Assert.assertEquals(series, "260");

    }




}

