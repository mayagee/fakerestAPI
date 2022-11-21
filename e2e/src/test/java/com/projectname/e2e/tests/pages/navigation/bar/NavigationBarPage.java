package com.projectname.e2e.tests.pages.navigation.bar;

import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.pages.navigation.bar.company.BlogPage;
import com.projectname.e2e.tests.pages.navigation.bar.company.ProvidersPage;
import com.projectname.e2e.tests.pages.navigation.bar.demo.DemoPage;
import com.projectname.e2e.tests.pages.navigation.bar.features.HotelModulePage;
import com.projectname.e2e.tests.pages.navigation.bar.features.MainFeatures;
import com.projectname.e2e.tests.pages.navigation.bar.integrations.AgodaHotelsPage;
import com.projectname.e2e.tests.pages.navigation.bar.integrations.AmadeusFlightsPage;
import com.projectname.e2e.tests.pages.navigation.bar.integrations.KiwiFlightsPage;
import com.projectname.e2e.tests.pages.navigation.bar.integrations.MainIntegrations;
import com.projectname.e2e.tests.pages.navigation.bar.pricing.PricingPage;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarPage extends PageBase {
    public NavigationBarPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return CheckIfElement.isDisplayed(CustomBy.id("PHPTRAVELS"), driver);
    }

    private WebElement getDemoBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[1]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find demo button on Navigation bar page", e);
        }
    }

    private WebElement getPricingBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[2]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Pricing button on Navigation bar page", e);
        }
    }

    private WebElement getFeaturesBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[3]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Features button on Navigation bar page", e);
        }
    }

    private WebElement getMainFeaturesBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[3]/div/ul/li[2]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find main features button on Features bar page", e);
        }
    }

    private WebElement getHotelModuleFeaturesBtn() {
        getFeaturesBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[3]/div/ul/li[3]/a/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find hotel features button on Features bar page", e);
        }
    }

    private WebElement getIntegrationsBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[4]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Integrations button", e);
        }
    }

    private WebElement getHotelIntegrationsBtn() {
        getIntegrationsBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"menuToggle-2\"]/button"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find hotel  button on Integrations bar page", e);
        }
    }

    private WebElement getAgodaIntegrationsBtn() {
        getIntegrationsBtn().click();
        getHotelIntegrationsBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"menuContent-2\"]/ul/li[3]/a/span"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Agoda hotel  button on Integrations bar page", e);
        }
    }

    private WebElement getFlightsIntegrationsBtn() {
        getIntegrationsBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"menuToggle-3\"]/button"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find flights button on Integrations bar page", e);
        }
    }

    private WebElement getKiwiFlightsBtn() {
        getIntegrationsBtn().click();
        getFlightsIntegrationsBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"menuContent-3\"]/ul/li[2]/a/img"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find kiwi flights button on Integrations bar page", e);
        }
    }

    private WebElement getAmadeusFlightsBtn() {
        getIntegrationsBtn().click();
        getFlightsIntegrationsBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("//*[@id=\"menuContent-3\"]/ul/li[3]/a/img"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find amadeus flights button on Integrations bar page", e);
        }
    }

    private WebElement getCompanyBtn() {
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not Company demo button on Integrations bar page", e);
        }
    }
    private WebElement getBlogBtn() {
        getCompanyBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/div/ul/li[1]/ul/li[2]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Blog button on Company bar page", e);
        }
    }
    private WebElement getProvidersBtn() {
        getCompanyBtn().click();
        try {
            return driver.findElement(CustomBy.xpath("/html/body/div[2]/div/div[3]/ul/li[5]/div/ul/li[1]/ul/li[7]/a"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new AssertionError("Could not find Provider button on Company bar page", e);
        }
    }
    public DemoPage openDemoPage() {
        getDemoBtn();
        return new DemoPage(driver, url, email, password);
    }
    public PricingPage openPricingPage() {
        getPricingBtn();
        return new PricingPage(driver, url, email, password);
    }
    public MainFeatures openMainFeaturesPage() {
        getMainFeaturesBtn().click();
        return new MainFeatures(driver, url, email, password);
    }
    public HotelModulePage openHotelModulePage() {
        getHotelModuleFeaturesBtn().click();
        return new HotelModulePage(driver, url, email, password);
    }
    public MainIntegrations openMainIntegrations() {
        getIntegrationsBtn().click();
        return new MainIntegrations(driver, url, email, password);
    }

    public AgodaHotelsPage openAgodaHotelsPage() {
        getIntegrationsBtn().click();
        getHotelIntegrationsBtn().click();
        getAgodaIntegrationsBtn().click();
        return new AgodaHotelsPage(driver, url, email, password);
    }

    public KiwiFlightsPage openKiwiFlightsPage() {
        getIntegrationsBtn().click();
        getFlightsIntegrationsBtn().click();
        getKiwiFlightsBtn().click();
        return new KiwiFlightsPage(driver, url, email, password);
    }

    public AmadeusFlightsPage openAmadeusFlightsPage() {
        getIntegrationsBtn().click();
        getFlightsIntegrationsBtn().click();
        getAmadeusFlightsBtn().click();
        return new AmadeusFlightsPage(driver, url, email, password);
    }

    public BlogPage openBlogPage() {
        getCompanyBtn().click();
        getBlogBtn().click();
        return new BlogPage(driver, url, email, password);
    }

    public ProvidersPage openProvidersPage() {
        getCompanyBtn().click();
        getProvidersBtn().click();
        return new ProvidersPage(driver, url, email, password);
    }


}

