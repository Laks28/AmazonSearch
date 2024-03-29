package com.amazon.search.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.search.objectrepo.ObjectRepo;

public class HomePage extends Page
{
	@FindBy(id = ObjectRepo.HomePage.SEARCH_BOX)
    @CacheLookup
    private WebElement searchBox;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    /**
     * Enters ProductKeyword and submits form.
     *
     * @param productKeyWord
     * @return ProductListPage (containing list of products)
     */
    public ProductListPage search_product(String productKeyWord){
        this.searchBox.sendKeys(productKeyWord);
        this.searchBox.submit();
        return PageFactory.initElements(driver, ProductListPage.class);
    }

    /**
     * Returns True if SearchBox is visible
     * @return True if SearchBox is visible else False
     */
    public boolean isSearchBoxVisible(){
        return this.searchBox.isDisplayed();
    }

}
