package com.amazon.search.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.amazon.search.objectrepo.ObjectRepo;

public class ProductDetailsPage extends Page{

    @FindBy(xpath = ObjectRepo.ProductDetailPage.PRODUCT_TITLE)
    @CacheLookup
    private WebElement productTitle;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle(){
        return productTitle.getText();
    }
}