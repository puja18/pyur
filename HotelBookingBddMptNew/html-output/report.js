$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotelbookingregistration/HotelBooking.feature");
formatter.feature({
  "line": 3,
  "name": "HotelBookingApplication",
  "description": "",
  "id": "hotelbookingapplication",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HotelBooking"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "User has already logged in to hotel application",
  "description": "and is navigated to Hotel Booking register page.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 8,
  "name": "checking for the title",
  "description": "",
  "id": "hotelbookingapplication;checking-for-the-title",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is already in hotel booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "check the page title in booking page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsHotelBooking.user_is_already_in_hotel_booking_page()"
});
formatter.result({
  "duration": 3087514691,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.check_the_page_title_in_booking_page()"
});
formatter.result({
  "duration": 148284555,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User has already logged in to hotel application",
  "description": "and is navigated to Hotel Booking register page.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "Hotel Booking Failure when first Name is empty",
  "description": "",
  "id": "hotelbookingapplication;hotel-booking-failure-when-first-name-is-empty",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is already in hotel booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "first Name is empty",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "display the error msg to user and close",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsHotelBooking.user_is_already_in_hotel_booking_page()"
});
formatter.result({
  "duration": 2552351494,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.first_Name_is_empty()"
});
formatter.result({
  "duration": 1058900482,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.click_submit()"
});
formatter.result({
  "duration": 121712841,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.display_alert_msg_to_user()"
});
formatter.result({
  "duration": 4165290714,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User has already logged in to hotel application",
  "description": "and is navigated to Hotel Booking register page.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 18,
  "name": "Hotel Booking Failure when last Name is empty",
  "description": "",
  "id": "hotelbookingapplication;hotel-booking-failure-when-last-name-is-empty",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "User is already in hotel booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "last Name is empty",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "click submit",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "display the error msg to user and close",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsHotelBooking.user_is_already_in_hotel_booking_page()"
});
formatter.result({
  "duration": 2668971840,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.last_Name_is_empty()"
});
formatter.result({
  "duration": 2203006927,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.click_submit()"
});
formatter.result({
  "duration": 22614713,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please fill the Last Name}\n  (Session info: chrome\u003d71.0.3578.80)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds: null\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027CHNSIPDT0T613\u0027, ip: \u002710.219.34.49\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_45\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.36.540470 (e522d04694c7eb..., userDataDir: C:\\Users\\pbommidi\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 71.0.3578.80, webStorageEnabled: true}\nSession ID: 1f07000579dd9abf869d5b536ef4ea5f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:172)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:279)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:497)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat hotelbookingregistration.HotelBookingPageFactory.setButton(HotelBookingPageFactory.java:86)\r\n\tat hotelbookingregistration.StepDefsHotelBooking.click_submit(StepDefsHotelBooking.java:64)\r\n\tat ✽.And click submit(hotelbookingregistration/HotelBooking.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefsHotelBooking.display_alert_msg_to_user()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 5,
  "name": "User has already logged in to hotel application",
  "description": "and is navigated to Hotel Booking register page.",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 24,
  "name": "Wrong Email input",
  "description": "",
  "id": "hotelbookingapplication;wrong-email-input",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is already in hotel booking page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user enters all data",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user enters incorrect email format and clicks the button",
  "keyword": "But "
});
formatter.step({
  "line": 28,
  "name": "display the error msg to user and close",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefsHotelBooking.user_is_already_in_hotel_booking_page()"
});
formatter.result({
  "duration": 2734382544,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.user_enters_all_data()"
});
formatter.result({
  "duration": 11958186080,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.user_enters_incorrect_email_format_and_clicks_the_button()"
});
formatter.result({
  "duration": 1269455492,
  "status": "passed"
});
formatter.match({
  "location": "StepDefsHotelBooking.display_alert_msg_to_user()"
});
