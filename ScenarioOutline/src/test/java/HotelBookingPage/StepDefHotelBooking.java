package HotelBookingPage;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefHotelBooking {
	static WebDriver driver = null;
	static HotelBookingPageFactory pageFactory = null;

	@Given("^User is already in hotel booking page$")
	public void user_is_already_in_hotel_booking_page() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pbommidi\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("C:\\Users\\pbommidi\\Desktop\\App\\hotelbooking.html");
		pageFactory = new HotelBookingPageFactory(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Then("^check the heading of the page$")
	public void check_the_heading_of_the_page() {
		// Write code here that turns the phrase above into concrete actions
        String title = driver.getTitle();
        if(title.equals("Hotel Booking")) {
        	System.out.println("Matched");
        }
        else {
        	System.out.println("Title not matches");
    		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    		driver.close();
        }
	}

	@When("^first Name is empty$")
	public void first_Name_is_empty() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();
		

	}

	@Then("^display the error message to user and close$")
	public void display_the_error_message_to_user_and_close() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: " + alertMessage);
		Thread.sleep(2000);
		driver.close();

	}

	@When("^last Name is empty$")
	public void last_Name_is_empty() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("pooja");
		Thread.sleep(1000);
		pageFactory.setLname("");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^email is empty and click submit$")
	public void email_is_empty_and_click_submit() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^mobile num is empty and click submit$")
	public void mobile_num_is_empty_and_click_submit() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^user enters the invalid valid mobile no$")
	public void user_enters_the_invalid_valid_mobile_no(DataTable phone) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		List<String> objList = phone.asList(String.class);
		String data=null;
		for (String dataTemp:objList) {
			data=dataTemp;
			pageFactory.getMobile().clear();
			pageFactory.setMobile(dataTemp);
			Thread.sleep(1000);
			pageFactory.setButton();
			
			if (Pattern.matches("/^[6-9]{1}[0-9]{9}$/",data)) {
				System.out.println("Matching ");
			} else {
				String alertMessage = driver.switchTo().alert().getText();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
				System.out.println("not matched "+alertMessage);
				
			}
		}
		pageFactory.setButton();

	}

	@When("^if user is not selecting city$")
	public void if_user_is_not_selecting_city() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Select City");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@Then("^display the error msg to user and close$")
	public void display_the_error_msg_to_user_and_close() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("alert :: "+alertMessage);
		Thread.sleep(2000);
		driver.close();

	}

	@When("^if user is not selecting state$")
	public void if_user_is_not_selecting_state() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Select State");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^user enters (\\d+)$")
	public void user_enters(int noOfPersons) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(noOfPersons);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();


	}

	@Then("^for (\\d+) allocate (\\d+)$")
	public void for_allocate(int guest, int rooms) {
		// Write code here that turns the phrase above into concrete actions
		if (guest <= 3) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(1, rooms);
		} else if (guest <= 6) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(2, rooms);
		} else if (guest <= 9) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(3, rooms);
		}

	}


	@When("^user does not enter card holder name$")
	public void user_does_not_enter_card_holder_name() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}


	@When("^user does not enter debit card number$")
	public void user_does_not_enter_debit_card_number() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^user does not enter cvv$")
	public void user_does_not_enter_cvv() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^user does not enter expiration month$")
	public void user_does_not_enter_expiration_month() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^user does not enter expiration year$")
	public void user_does_not_enter_expiration_year() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@When("^on user entering valid data$")
	public void on_user_entering_valid_data() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		pageFactory.setFname("Pooja");
		Thread.sleep(1000);
		pageFactory.setLname("Bommidi");
		Thread.sleep(1000);
		pageFactory.setEmail("puja18@gmail.com");
		Thread.sleep(1000);
		pageFactory.setMobile("9985485173");
		Thread.sleep(1000);
		pageFactory.setCity("Hyderabad");
		Thread.sleep(1000);
		pageFactory.setState("Telangana");
		Thread.sleep(1000);
		pageFactory.setPersons(3);
		Thread.sleep(1000);
		pageFactory.setCardholder("pujadevi Bommidi");
		Thread.sleep(1000);
		pageFactory.setDebit("32144564561");
		Thread.sleep(1000);
		pageFactory.setCvv("3535");
		Thread.sleep(1000);
		pageFactory.setMonth("02");
		Thread.sleep(1000);
		pageFactory.setYear("18");
		Thread.sleep(1000);
		pageFactory.setButton();

	}

	@Then("^on successfully navigate to home page$")
	public void on_successfully_navigate_to_home_page() {
		// Write code here that turns the phrase above into concrete actions
        driver.navigate().to("C:\\Users\\pbommidi\\Desktop\\App\\success.html");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.close();
	}

}
