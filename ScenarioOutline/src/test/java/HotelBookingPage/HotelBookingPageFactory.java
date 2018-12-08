package HotelBookingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
	
	WebDriver wd;

	public HotelBookingPageFactory(WebDriver wd) {
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}

	public HotelBookingPageFactory() {

	}

	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement fname;

	@FindBy(xpath = "//*[@id='txtLastName']")
	@CacheLookup
	WebElement lname;

	@FindBy(how = How.NAME, using = "Email")
	@CacheLookup
	WebElement email;

	@FindBy(css = "input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement mobile;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement city;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement state;

	@FindBy(how = How.NAME, using = "persons")
	@CacheLookup
	int persons;

	@FindBy(xpath = "//*[@id='rooms']")
	@CacheLookup
	WebElement rooms;

	@FindBy(how = How.ID, using = "txtCardholderName")
	@CacheLookup
	WebElement cardholder;

	@FindBy(id = "txtDebit")
	@CacheLookup
	WebElement debit;

	@FindBy(name = "cvv")
	@CacheLookup
	WebElement cvv;

	@FindBy(id = "txtMonth")
	@CacheLookup
	WebElement month;

	@FindBy(id = "txtYear")
	@CacheLookup
	WebElement year;

	@FindBy(how = How.ID, using = "btnPayment")
	@CacheLookup
	WebElement button;



	public WebElement getFname() {
		return fname;
	}

	public void setFname(String fnameTemp) {
		fname.sendKeys(fnameTemp);;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lnameTemp) {
	   lname.sendKeys(lnameTemp);;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String emailTemp) {
	   email.sendKeys(emailTemp);;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String mobileTemp) {
		mobile.sendKeys(mobileTemp);;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String cityTemp) {
		Select cityData = new Select(city);
		cityData.selectByVisibleText(cityTemp);
	}

	public WebElement getState() {
		return state;
	}

	public void setState(String stateTemp) {
		Select stateData = new Select(state);
		stateData.selectByVisibleText(stateTemp);
	}

	public int getPersons() {
		return persons;
	}

	public void setPersons(int noOfPErsons) {
		persons = noOfPErsons;
	}

	/*public WebElement getRooms() {
		return rooms;
	}

	public void setRooms(WebElement rooms) {
		this.rooms = rooms;
	}*/

	public WebElement getCardholder() {
		return cardholder;
	}

	public void setCardholder(String cardholderName) {
		cardholder.sendKeys(cardholderName);
	}

	public WebElement getDebit() {
		return debit;
	}

	public void setDebit(String debitNum) {
		debit.sendKeys(debitNum);
	}

	public WebElement getCvv() {
		return cvv;
	}
	
	public void setCvv(String cvvPin) {
		cvv.sendKeys(cvvPin);
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(String monthTemp) {
		month.sendKeys(monthTemp);
	}

	public WebElement getYear() {
		return year;
	}


	public void setYear(String yearTemp) {
		year.sendKeys(yearTemp);
	}
	
	public WebElement getButton() {
		return button;
	}

	public void setButton() {
	  button.click();
	}
	
	
	

}
