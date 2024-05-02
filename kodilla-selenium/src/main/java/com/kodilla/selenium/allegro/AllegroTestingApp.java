package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium-drivers\\Chrome\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl/");

        WebElement searchFiled = driver.findElement(By.xpath("//*[@class=m7er_k4 mgn2_14 mp0t_0a m0qj_5r m9tr_5r mli8_k4 mx7m_1 m911_co mnyp_co mdwl_co mlkp_6x mefy_5r mm2b_0 mldj_0 mtag_2 msbw_2 msts_pt mgmw_wo mr3m_1 mli2_1 mh85_0 mjyo_6x mse2_40 mqu1_40 mp4t_0 m3h2_0 mryx_0 munh_0 mvrt_8 mg9e_0 mj7a_0 mh36_0 _535b5_Sviv7]"));
        searchFiled.sendKeys("Mavic mini");

        WebElement categoryChoose = driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div/div[3]/header/div[1]/div/div/div/form/div[3]/div/select"));
        Select categorySelect = new Select(categoryChoose);
        categorySelect.selectByIndex(2);

        WebElement searchbutton = driver.findElement(By.xpath("//html/body/div[2]/div[1]/div/div/div[3]/header/div[1]/div/div/div/form/button/img"));
        searchbutton.submit();
    }
}