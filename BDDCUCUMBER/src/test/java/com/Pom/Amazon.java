package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {

	WebDriver driver;
	 public Amazon(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath = "(//a[@data-nav-role='signin'])[1]")
	 WebElement signInbtn;
	 
	 @FindBy(name = "email")
	 WebElement txtEmail;
	 
	 @FindBy(id = "continue")
	 WebElement continueBtn;
	 
	 @FindBy(name = "password")
	 WebElement password;
	 
	 @FindBy(id = "signInSubmit")
	 WebElement signIn;
	 
	 @FindBy(xpath = "(//a[@data-nav-role='signin'])[1]")
	 WebElement mouseOverOnAccount;
	 
	 @FindBy(xpath = "//span[text()='Your Account']")
	 WebElement yourAccount;
	 
	 @FindBy(xpath = "//img[@alt='Your Addresses']")
	 WebElement yourAddress;
	 
	 @FindBy(id = "ya-myab-plus-address-icon")
	 WebElement addAddress;
	 
	 @FindBy(name = "address-ui-widgets-enterAddressFullName")
	 WebElement fullName;
	 
	 @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
	 WebElement mobileNum;
	 
	 @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
	WebElement pinCode;
	 
	 @FindBy(id = "address-ui-widgets-enterAddressLine1")
	 WebElement companyAddress;
	 
	 @FindBy(id = "address-ui-widgets-enterAddressLine2")
	 WebElement area;
	 
	 @FindBy(id = "address-ui-widgets-landmark")
	 WebElement landmark;
	 
	 @FindBy(xpath = "//span[text()=' Select an Address Type ']")
	 WebElement addressType;
	 
	 @FindBy(xpath = "(//a[@class='a-dropdown-link'])[2]")
	 WebElement office;
	 
	 @FindBy(xpath = "//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
	 WebElement addressAdd;
	 
	 @FindBy(id = "twotabsearchtextbox")
	 WebElement searchProduct;
	 
	 @FindBy(id = "nav-search-submit-button")
	 WebElement searchSubmit;
	 
	 @FindBy(linkText = "Google Pixel 6 5G (Sorta Seafoam, 8GB RAM, 128GB Storage)")
	 WebElement productPhone;
	 
	 @FindBy(id = "submit.buy-now")
	 WebElement buyNow;
	 
	 @FindBy(xpath = "(//a[@class='a-declarative a-button-text '])[1]")
	 WebElement deliveryToThisAdd;
	 
	 public void clickSignIn() {
		  signInbtn.click();
	 }
	 public void setEmail(String email) {
		 txtEmail.clear();
		 txtEmail.sendKeys(email);
	 }
	 public void clickOnContinue() {
		  continueBtn.click();
	 }
	 public void setPassword(String pwd) {
		 password.sendKeys(pwd);
	 }
	 public WebElement signIn() {
		 return signIn;
	 }
	 public WebElement mouseOverOnAccountAndList(){
		 return mouseOverOnAccount;
	 }
	 public void clickOnYourAccount() {
		 yourAccount.click();
	 }
	 public void clickYourAddress() {
		 yourAddress.click();
	 }
	 public void clicOnAddAddress() {
		 addAddress.click();
	 }
	 public void sendFullName(String fname) {
		 fullName.sendKeys(fname);
	 }
	 public void sendMobileNum(String mnumber) {
		 mobileNum.sendKeys(mnumber);
	 }
	 public void sendPinCode(String pCode) {
		 pinCode.sendKeys(pCode);
	 }
	 public void sendCompanyAddress(String companyAdd) {
		 companyAddress.sendKeys(companyAdd);
	 }
	 public void sendArea(String Area) {
		 area.sendKeys(Area);
	 }
	 public void sendLandMark(String lmark) {
		 landmark.sendKeys(lmark);
	 }
	 public void clickOnAddressType() {
		 addressType.click();
	 }
	 public void clickOnOffice() {
		 office.click();
	 }
	 public void clickAddressAdd() {
		 addressAdd.click();
	 }
	 public void sendSearchProduct(String product) {
		 searchProduct.clear();
		 searchProduct.sendKeys(product);
	 }
	 public void clickOnSearchSubmit() {
		 searchSubmit.click();
	 }
	 public void searchMobile() {
		 productPhone.click();
	 }
	 	 public void clickOnBuyNow() {
		buyNow.click(); 
	 }
	 	 public void selectDeliveryToThisAddress() {
	 		 deliveryToThisAdd.click();
	 	 }
}
