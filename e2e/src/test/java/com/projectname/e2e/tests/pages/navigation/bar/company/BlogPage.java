package com.projectname.e2e.tests.pages.navigation.bar.company;

import com.projectname.e2e.tests.pages.common.PageBase;
import com.projectname.e2e.tests.selectors.CustomBy;
import com.projectname.e2e.tests.utils.CheckIfElement;
import com.projectname.e2e.tests.webdriver.CustomWebDriver;

public class BlogPage extends PageBase {
    public BlogPage(CustomWebDriver driver, String url, String email, String password) {
        super(driver, url, email, password);
    }

    @Override
    public PageBase show() {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return  CheckIfElement.isDisplayed(CustomBy.xpath("/html/body/section[2]/a/div/div[2]/h2"),driver);
    }
}
