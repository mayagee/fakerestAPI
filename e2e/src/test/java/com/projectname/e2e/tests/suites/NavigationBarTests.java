package com.projectname.e2e.tests.suites;

import com.projectname.e2e.tests.pages.navigation.bar.NavigationBarPage;
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
import com.projectname.e2e.tests.suites.common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationBarTests extends TestBase {

    @Test
    public void verifyDemoButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        DemoPage demoPage = navigationBarPage.openDemoPage();
        Assert.assertTrue(demoPage.isDisplayed());
    }
    @Test
    public void verifyFeaturesButtonIsWorking() {
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
         MainFeatures mainFeatures = navigationBarPage.openMainFeaturesPage();
        Assert.assertTrue(mainFeatures.isDisplayed());
    }
    @Test
    public void verifyIntegrationsButtonIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(),"","","");
        MainIntegrations mainIntegrations = navigationBarPage.openMainIntegrations();
        Assert.assertTrue(mainIntegrations.isDisplayed());
    }
    @Test
    public void verifyPricingButtonIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(),"","","");
        PricingPage pricingPage = navigationBarPage.openPricingPage();
        Assert.assertTrue(pricingPage.isDisplayed());
    }
    @Test
    public void verifyMainFeaturesButtonIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        MainFeatures mainFeatures = navigationBarPage.openMainFeaturesPage();
        Assert.assertTrue(mainFeatures.isDisplayed());
    }

    @Test
    public void verifyHotelModuleButtonIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        HotelModulePage hotelModulePage = navigationBarPage.openHotelModulePage();
        Assert.assertTrue(hotelModulePage.isDisplayed());
    }

    @Test
    public void verifyProvidersBtnIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        ProvidersPage providersPage = navigationBarPage.openProvidersPage();
        Assert.assertTrue(providersPage.isDisplayed());
    }

    @Test
    public void verifyBlogBtnIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        BlogPage blogPage= navigationBarPage.openBlogPage();
        Assert.assertTrue(blogPage.isDisplayed());
    }

    @Test
    public void verifyIntegrationsBtnIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        MainIntegrations mainIntegrations= navigationBarPage.openMainIntegrations();
        Assert.assertTrue(mainIntegrations.isDisplayed());
    }

    @Test
    public void verifyAgodaIntegrationsBtnIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        AgodaHotelsPage agodaHotelsPage= navigationBarPage.openAgodaHotelsPage();
        Assert.assertTrue(agodaHotelsPage.isDisplayed());
    }

    @Test
    public void verifyKiwiFlightsBtnIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        KiwiFlightsPage kiwiFlightsPage= navigationBarPage.openKiwiFlightsPage();
        Assert.assertTrue(kiwiFlightsPage.isDisplayed());
    }

    @Test
    public void verifyAmadeusFlightsBtnIsWorking(){
        NavigationBarPage navigationBarPage = new NavigationBarPage(getDriver(), "", "", "");
        AmadeusFlightsPage amadeusFlightsPage= navigationBarPage.openAmadeusFlightsPage();
        Assert.assertTrue(amadeusFlightsPage.isDisplayed());
    }



}
