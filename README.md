# Skillgun.com
Browser Automation Readme
Overview
This automation script is designed to perform various tasks related to browser initialization, mobile number verification, login process, captcha handling, form submission, homepage validation, profile settings verification, UI element verification, and navigation testing on the Skillgun.com website.

Requirements
Operating System: Windows, macOS, Linux
Java Development Kit (JDK) 8 or higher
Selenium WebDriver for Java
TestNG or JUnit for test framework
Browser-specific WebDriver executable (e.g., ChromeDriver, GeckoDriver for Firefox)

Installation
Install Java Development Kit (JDK) on your system if not already installed.
Set up the Selenium WebDriver for Java in your project:
Add Selenium dependencies to your project using Maven or download the Selenium Java libraries manually.
Include TestNG or JUnit as your test framework, depending on your preference.
Download the appropriate WebDriver executable for your chosen browser:
Chrome WebDriver: https://sites.google.com/a/chromium.org/chromedriver/
Firefox WebDriver: https://github.com/mozilla/geckodriver/releases
Safari WebDriver (macOS only): Included with Safari Develop menu (Preferences > Advanced > Show Develop menu in menu bar)

Configuration
Update the config.java file with your credentials:
USERNAME: Your Skillgun.com username
PASSWORD: Your Skillgun.com password
CAPTCHA_MANUAL: Set to true if you want to manually handle captcha during testing
Running the Script
Compile your Java code using the Java compiler (javac) to generate the bytecode.
Run the compiled code using the Java Virtual Machine (java) with the appropriate class containing your automation script.

Test Cases
Browser Initialization:
Verify that the web browser is initialized and navigated to Skillgun.com.
Mobile Number Verification:
Check redirection to the mobile number verification page.
Login Process:
Enter valid mobile number and login credentials.
Verify functionality of the Privacy Policy checkbox.
Captcha Handling:
Pause execution for manual captcha entry.
Form Submission:
Fill required fields and submit the form.
Verify redirection to the expected URL.
Homepage Validation:
Check visibility of welcome messages, profile pictures, and scrollable texts.
Profile Settings Verification:
Click on profile settings and ensure proper redirection.
UI Element Verification:
Verify visibility and clickability of checkboxes, profile pictures, and buttons.
Navigation Testing:
Click "Back to Home" button and verify redirection.

Additional Notes
The script may require adjustments based on changes to the Skillgun.com website's UI or functionality.
Make sure to handle any additional authentication mechanisms or pop-ups that may appear during testing.
