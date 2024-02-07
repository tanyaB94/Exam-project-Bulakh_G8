package pages;


import org.openqa.selenium.WebDriver;

public class PageProvider {
private WebDriver webDriver;

public PageProvider(WebDriver webDriver) {
this.webDriver = webDriver;
}

public MainPage mainPage() {
return new MainPage(webDriver);
}

public BasketPage basketPage() {
return new BasketPage(webDriver);
}

public  LoginPage loginPage() {
    return new LoginPage(webDriver);
}

public MyAccount myAccount() {
return new MyAccount(webDriver);
}

    public FavoritesPage favoritePage() {
        return new FavoritesPage(webDriver);
    }

    public ItemsPage itemsPage() {
        return new ItemsPage(webDriver);
    }
}


