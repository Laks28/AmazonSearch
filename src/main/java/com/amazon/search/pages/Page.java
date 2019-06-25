package com.amazon.search.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.search.utils.SyncHelper;

public abstract class Page {

    protected WebDriver driver;
    protected static SyncHelper syncHelper;

    /**
     * Constructor injecting the WebDriver interface
     *
     * @param webDriver
     */
    public Page(WebDriver driver) {
    this.driver = driver;
    //syncHelper = new SyncHelper();
    }

    public String getTitle() {
      return driver.getTitle();
  }

    public void scrollToElement(WebElement element){
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}