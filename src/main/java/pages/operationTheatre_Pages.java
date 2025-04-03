package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class operationTheatre_Pages extends StartupPage {
	
//	Locators for TC-1 
	By usernameTextbox = By.xpath("//input[@id='username_id']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By signInButton = By.xpath("//button[@id='login']");
	By registeredPatientTextElement = By.xpath("//p[contains(text(), 'Registered Patient')]");
//	Locators for TC-2
	By operationTheatreModule = By.xpath("//span[.='OperationTheatre']");
	By hospitalNumberByElement = By.xpath("//span[contains(text(), 'Hospital Number')]");
//	Locators for TC-3
	By newOtButtonByElement = By.xpath("//button[contains(text(), 'New OT Booking')]");
	By bookingOTScheduleFormsTitleNameByElement = By.xpath("//span[contains(text(), 'Booking OT Schedule  | New Patient')]");
//	Locators for TC-4
	By selectpatientTextboxElement = By.xpath("//input[@id='srch_PatientList']");
	By diagnosisTextboxElement = By.xpath("//input[@id='Diagnosis']");
	By surgeryTypeTextboxElement = By.xpath("//textarea[@id='surgeryType']");
//	Locators for TC-5
	By remarksTextAreaByElement = By.xpath("//textarea[@id='remarks']");
//	Locators for TC-6
	By remarkTextboxElement = By.xpath("//textarea[@placeholder='Remarks']");
	By surgenNameTextFieldElement = By.xpath("//input[@id='id_input_currentRequestedByDoctor_selectReferral']");
	By surgenNameFirstButtonElement = By.xpath("//ul[@class='select-list']//li[1]");
//	Locators for TC-7
	By externalCheckBoxElement = By.xpath("//label[@class='is-ref mt-checkbox mt-checkbox-outline']//span");
//	Locators for TC-8	
	By plusIconButtonElement = By.xpath("//a[@class='btn blue btn-xs btn-ext']");
	By addButtonOfAddExternalReferralByElement = By.xpath("//button[contains(text(), 'Add')]");
	By errorMessageOfAddExternalReferralFormsByElement = By.xpath("//span[contains(text(), 'Referrer Name is required')]");
//	TC-9 Locators
	By referrerNameTextFieldElement = By.xpath("//input[@id='referrerName']");
	By extRefferAddressTextFieldElement = By.xpath("//input[@id='ExtRefferaddress']");
	By contactNumberTextFieldElement = By.xpath("//input[@id='contactNum']");
	By emailTextFieldElement = By.xpath("//input[@id='email']");
	By isIncentiveApplicableCheckboxElement = By.xpath("(//div[@class='icheck-inline']//span)[2]");
	By addButtonElement = By.xpath("//button[@id='add']");
	By successNotificationPopupMessageElement = By.xpath("//div[@class='msg-text padding-8-all']");
	By successNotificationPopupMessageOneElement = By.xpath("//p[@class='msg-status']");
	By successNotificationPopupMessageTwoElement = By.xpath("//p[@class='main-message']");
	By titleOfaddExternalReferralFormsByElement = By.xpath("//span[contains(text(), 'Add External Referral')]");
//	TC-10 Locators
	By closeLinkOfBookingOTScheduleNewPatientFormsByElement = By.xpath("//a[.='X']");
//	TC-11 Locators
	By billingModuleExpandIconByElement = By.xpath("//span[@data-target='#Billing']");
	By newOneCounterLinkByElement = By.xpath("//h5[contains(text(), 'New-1')]//span");
	By handOverSubModuleLinkByElement = By.xpath("//span[contains(text(), 'Handover')]");
	By remarksTextFieldOfBillingSubModulesByElement = By.xpath("//input[@id='HandoverRemarks_User']");
	By handOverToUserButtonOfBillingSubModuleByElement = By.xpath("//input[@value='HandOver To User']");
//	TC-12 LOcators
//	Write the locators here
//	TC-13 Locators
	By vaccinationModuleByElement = By.xpath("//a[@href='#/Vaccination']");
	By vaccinationModulesToggleIconByElement = By.xpath("//span[@data-target='#Vaccination']");
	By patientListSubModuleByElement = By.xpath("//a[@href='#/Vaccination/PatientList']//span[contains(text(), 'Patient List')]");
	By titleNameOfVaccinationPatientRegisterFormByElement = By.xpath("//span[contains(text(), 'Vaccination Patient Register')]");
//	TC-14 Locators
	By closeLinkOfVaccinationPatientRegisterForm = By.xpath("//a[.='X']");
	By appointmentModuleByElement = By.xpath("//a[@href='#/Appointment']");
	By appointmentModulesToggleIconByElement = By.xpath("//span[@data-target='#Appointment']");
	By bookingAppointmentSubModuleByElement = By.xpath("//a[@href='#/Appointment/CreateAppointment']//span[contains(text(), 'Book Appointment')]");
	By newPatientButtonByElement = By.xpath("//a[contains(text(), 'New Patient')]");
	By monthRadioButtonByElement = By.xpath("//input[@value='M']");
	By daysRadioButtonByElement = By.xpath("//input[@value='D']");
	By selectVisitTypeDropdownByElement = By.xpath("//select[@name='VistType']");
	By addAppointmentButtonByElement = By.xpath("//input[@value='Add Appointment']");
//		TC-15 Locators
	By errorNotificationPopupMessageElement = By.xpath("//div[@class='msg-text padding-8-all']");
	By statusErrorNotificationMessageByElement = By.xpath("//p[@class='msg-status']");
	By mainErrorNotificationMessageByElement = By.xpath("//p[@class='main-message']");
//		TC-16 Locators
	By newOTBookingButtonByElement = By.xpath("//button[contains(text(), 'New OT Booking')]");
	By selectOTAssistantNameFieldByElement = By.xpath("//span[contains(text(), '---Select Ot Assistant Name---')]");
	By searchTexboxOfSelectOTAssistantNameFieldByElement = By.xpath("//input[@placeholder='Search']");
	By drPoojaMishraCheckBoxByElement = By.xpath("//label[contains(text(), 'Dr. pooja Mishra')]/..//input");
	By selectOTAssistantNameDropdownByElement = By.xpath("//div[@class='cuppa-dropdown']");
//	TC-17 Locators
	By closeLinkByElement = By.xpath("//a[.='X']");
	By addNewOtButtonElement = By.xpath("//input[@value='Add New OT']");
//	TC-18 Locators
	By appointmentModule = By.xpath("(//span[.='Appointment'])[1]");
	By newOneSelectCounterElement = By.xpath("//div[@class='counter-item']//h5[contains(text(), 'New-1 ')]");
	By keyboardButtonElement = By.xpath("//div[@title='Shortcut Keys']");
	By altPlusNtooltipMessageElement = By.xpath("//li[contains(text(),'+')]");
//	TC-20 Locators
	By procurementModule = By.xpath("//span[.='Procurement']");
	By settingsTab = By.xpath("//a[.=' Settings ']");
	By invoiceHeadersSubTab = By.xpath("//a[.='Invoice Headers']");
	By addNewInvoiceHeaderButton = By.xpath("//input[@value='Add New Invoice Header']");
	By chooseFileButton = By.id("img");
	By procurementModuleByElement = By.xpath("//span[@data-target='#Procurement']");
// 	TC-21 Locators
	By purchaseOrderSubmoduleByElement = By.xpath("//a[@href='#/ProcurementMain/PurchaseOrder/PurchaseOrderList']//span[contains(text(), 'Purchase Order')]");
	By createPurchaseOrderButtonByElement = By.xpath("//input[@value='Create Purchase Order']");
	By addPurchaseOrderTitleByElement = By.xpath("//span[contains(text(), 'Add Purchase Order')]");
	By iFrameTextEditorByElement = By.xpath("//body[@contenteditable='true']");
//		By usernameTextfield = By.id("username_id");
//		By operationTheatreTab = By.xpath("//span[.='OperationTheatre']");
//		By newOTButtonElement = By.xpath("//button[contains(text(), 'New OT Booking')]");
//		By newOTButtonLink = By.xpath("//button[@class='btn btn-link']");
//		By searchTextBoxElement = By.xpath("//input[@id='quickFilterInput']");
//		By bookingOTSchedulePageElement = By.xpath("//span[contains(text(), 'Booking OT Schedule  | New Patient')]");
//		By anesthetistDoctorTextboxElement = By.xpath("//input[@id='AnesthetistDoctor']");

//		By xButton = By.xpath("//a[.='X']");
	
	String pageName = this.getClass().getSimpleName();
	public operationTheatre_Pages(WebDriver driver) {
		super(driver);
	}
	
	/**@Test1.1
	 * Logs into the Health App using the provided valid credentials.
	 *
	 * @param expectedData A map containing login credentials with keys "username" and "password".
	 * @return true if the login is successful and the registered patient text is displayed, false otherwise.
	 * @throws Exception if any issue occurs during login.
	 * 
	 * This method:
	 * - Finds and highlights the username and password text fields.
	 * - Enters the provided username and password.
	 * - Clicks the sign-in button.
	 * - Verifies if the registered patient text is displayed to confirm successful login.
	 * 
	 * @author Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		Boolean textIsDisplayed = false;
		try {
			WebElement usernametextFieldWebElement = commonEvents.findElement(usernameTextbox);
			commonEvents.highlightElement(usernametextFieldWebElement);
			commonEvents.sendKeys(usernameTextbox,expectedData.get("username"));

			WebElement passwordtextFieldWebElement = commonEvents.findElement(passwordTextbox);
			commonEvents.highlightElement(passwordtextFieldWebElement);
			commonEvents.sendKeys(passwordTextbox,expectedData.get("password"));

			WebElement signinButtonWebElement = commonEvents.findElement(signInButton);
			commonEvents.highlightElement(signinButtonWebElement);
			commonEvents.click(signInButton);

			if(commonEvents.isDisplayed(registeredPatientTextElement))
			{   
				WebElement registeredPatientTextWebElement = commonEvents.findElement(registeredPatientTextElement);
				commonEvents.highlightElement(registeredPatientTextWebElement);
				textIsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return textIsDisplayed;
	}

	/**@Test1.2
	 * Verifies the title of the current page.
	 * @param : null
	 * @return The title of the current page as a String.
	 * @throws Exception if any issue occurs while retrieving the title.
	 * 
	 * This method:
	 * - Retrieves the title of the currently loaded page.
	 * - Prints the title to the console.
	 * - Returns the title as a String.
	 * 
	 * @author YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		String pageTitle = "";
		try {
			pageTitle = commonEvents.getTitle();
			System.out.println("title of the page is  :" + pageTitle );
		}catch(Exception e) {
			throw e;
		}	
		return pageTitle;
	}

	/**@Test1.3
	 * Retrieves and verifies the URL of the current page.
	 * @param : null
	 * @return The current page URL as a String.
	 * @throws Exception if any issue occurs while retrieving the URL.
	 * 
	 * This method:
	 * - Retrieves the URL of the currently loaded page.
	 * - Prints the URL to the console.
	 * - Returns the URL as a String.
	 * 
	 * @author YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		String urlofThepage = "";
		try {
			urlofThepage = commonEvents.getCurrentUrl();
			System.out.println("URL of the page is  :" + urlofThepage );
		}catch(Exception e) {
			throw e;
		}	
		return urlofThepage;
	}

	/**@Test2
	 * Navigates to the Operation Theatre module and verifies the table header name.
	 * @param : null
	 * @return The table header name as a String if the Operation Theatre module is present; otherwise, an empty string.
	 * @throws Exception if any issue occurs during navigation or verification.
	 * 
	 * This method:
	 * - Checks if the Operation Theatre module is present.
	 * - Clicks on the module if it is available.
	 * - Verifies if the hospital number table header is displayed.
	 * - Retrieves and returns the table header name.
	 * 
	 * @author YAKSHA
	 */
	public String goToOperationTheatreModuleVerifyTableHeaderName() throws Exception {
		String tableHeaderNameIsDisplayed = "";
		try {
			if(commonEvents.isDisplayed(operationTheatreModule)){
				commonEvents.click(operationTheatreModule);
				Thread.sleep(3000);
			}

			if(commonEvents.isDisplayed(hospitalNumberByElement)) {
				tableHeaderNameIsDisplayed = commonEvents.getText(hospitalNumberByElement);

				System.out.println("table header name is : " + tableHeaderNameIsDisplayed);
				return tableHeaderNameIsDisplayed;
			}

		}catch(Exception e) {
			throw e;
		}	
		return tableHeaderNameIsDisplayed;
	}

	/**@Test3
	 * Verifies the Booking OT Schedule form by clicking the "New OT Booking" button.
	 * @param : null
	 * @return The title name of the Booking OT Schedule form as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Clicks on the "New OT Booking" button.
	 * - Retrieves and returns the title name of the Booking OT Schedule form.
	 * 
	 * @author YAKSHA
	 */
	public String verifyBookingOTScheduleFormByClickingOnNewOTBookingButton() throws Exception {
		String bookingOTScheduleFormsName = "";
		try {
			commonEvents.click(newOtButtonByElement);
			Thread.sleep(2000);
			bookingOTScheduleFormsName = commonEvents.getText(bookingOTScheduleFormsTitleNameByElement);
			System.out.println("booking OT Schedule Form's Title Name" + bookingOTScheduleFormsName );
		}catch(Exception e) {
			throw e;
		}	
		return bookingOTScheduleFormsName;
	}


	/**@Test4
	 * Verifies if the textboxes are present, enters values into them, and validates the entered values.
	 * @param expectedData A map containing values for:
	 *        - "patientName": The value to be entered in the patient selection textbox.
	 *        - "diagnosisValue": The value to be entered in the diagnosis textbox.
	 *        - "surgeryTypeValue": The value to be entered in the surgery type textbox.
	 * @return The value entered in the patient selection textbox as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the Booking OT Schedule form title is displayed.
	 * - Enters values into the patient name, diagnosis, and surgery type textboxes.
	 * - Retrieves and returns the value entered in the patient selection textbox.
	 * 
	 * @author YAKSHA
	 */
	public String verifyEnteredDataIsPresentInSelectPatientTextbox(Map<String, String> expectedData) throws Exception {

		String selectPatientTextboxValue = "";
		try {
			if(commonEvents.isDisplayed(bookingOTScheduleFormsTitleNameByElement)) {
				commonEvents.sendKeys(selectpatientTextboxElement, expectedData.get("patientName"));
				commonEvents.sendKeys(diagnosisTextboxElement, expectedData.get("diagnosisValue"));
				commonEvents.sendKeys(surgeryTypeTextboxElement, expectedData.get("surgeryTypeValue"));

				selectPatientTextboxValue = commonEvents.getAttribute(selectpatientTextboxElement, "value");
				System.out.println("attribute value of select patient Textbox : " + selectPatientTextboxValue );
			}
		}catch(Exception e) {
			throw e;
		}	
		return selectPatientTextboxValue;
	}
	
	/**@Test5
	 * Verifies the placeholder name of a textbox.
	 * @param : null
	 * @return The placeholder name of the textbox as a String.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the textbox is enabled.
	 * - Retrieves and returns the placeholder text of the textbox.
	 * 
	 * @author YAKSHA
	 */
	public String verifyPlaceholderNameOfTexboxIfTextboxIsEnabled() throws Exception {
		String placeholderNameOfRemarkasTextarea = "";
		try {
			if(commonEvents.isDisplayed(remarksTextAreaByElement) &&
					commonEvents.isEnabled(remarksTextAreaByElement)) {
				commonEvents.click(remarksTextAreaByElement);
				Thread.sleep(2000);
				placeholderNameOfRemarkasTextarea = commonEvents.getAttribute(remarksTextAreaByElement, "placeholder");
				System.out.println("booking OT Schedule Form's Title Name" + placeholderNameOfRemarkasTextarea );
				return placeholderNameOfRemarkasTextarea;
			}
		}catch(Exception e) {
			throw e;
		}	
		return placeholderNameOfRemarkasTextarea;
	}

	
	/**@Test6
	 * Verifies if a button is present after entering a value into the surgeon name text field.
	 *
	 * @param expectedData A map containing:
	 *        - "surgenNameValue1": The value to be entered into the surgeon name text field.
	 * @return The text of the surgeon name button if present, otherwise an empty string.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the surgeon name text field is displayed.
	 * - Enters the provided surgeon name and presses Enter.
	 * - Clicks on the Any other text box to trigger UI changes.
	 * - Checks if the surgeon name button is displayed.
	 * - Retrieves and returns the text of the surgeon name button.
	 * 
	 * @author YAKSHA
	 */
	public String verifyButtonIsPresentAfterSendValueToSurgenNameTextfield(Map<String, String> expectedData) throws Exception {
		String surgenNameButtonAttributeValue = "";
		try {
			if(commonEvents.isDisplayed(surgenNameTextFieldElement)) {
				commonEvents.sendKeys(surgenNameTextFieldElement, expectedData.get("surgenNameValue1"));
				commonEvents.sendKeys(surgenNameTextFieldElement, Keys.ENTER);
				Thread.sleep(2000);
				commonEvents.click(remarkTextboxElement);
				Thread.sleep(2000);
				commonEvents.isDisplayed(surgenNameFirstButtonElement);
				surgenNameButtonAttributeValue = commonEvents.getText(surgenNameFirstButtonElement);
				System.out.println("attribute value of surgen Name : " + surgenNameButtonAttributeValue );
			}
		}catch(Exception e) {
			throw e;
		}	
		return surgenNameButtonAttributeValue;
	}

	 /**@Test7
	 * Verifies if the plus (+) button is present after clicking the external checkbox.
	 * @param : null
	 * @return true if the plus (+) button is displayed after selecting the checkbox, otherwise false.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the external checkbox is displayed.
	 * - Clicks the external checkbox.
	 * - Verifies if the checkbox is selected.
	 * - Checks if the plus (+) button is displayed.
	 * - Returns true if the plus (+) button is present.
	 * 
	 * @author YAKSHA
	 */
	public Boolean verifyPlusButtonIsPresentAfterClickOnExternalCheckbox() throws Exception {
		boolean plusIconIsDisplayed = false;
		try {
			commonEvents.isDisplayed(externalCheckBoxElement);
			commonEvents.click(externalCheckBoxElement);
			Thread.sleep(3000);

			commonEvents.isSelected(externalCheckBoxElement);
			commonEvents.isDisplayed(plusIconButtonElement);
			plusIconIsDisplayed = true;

		}catch(Exception e) {
			throw e;
		}	
		return plusIconIsDisplayed;
	}
	
	/**@Test8
	 * Verifies the error message displayed in the "Add External Referral" form.
	 * @param : null
	 * @return The error message as a String if displayed; otherwise, an empty string.
	 * @throws Exception if any issue occurs during the process.
	 * 
	 * This method:
	 * - Checks if the plus (+) icon button is displayed.
	 * - Clicks on the plus (+) icon button.
	 * - Clicks on the "Add" button in the "Add External Referral" form.
	 * - Checks if the error message is displayed.
	 * - Retrieves and returns the error message text.
	 *
	 * @author YAKSHA
	 */
	public String verifyErrorMessageInAddExternalReferralForms() throws Exception {
		String errorMessageOfAddExternalReferralForms = "";
		try {
			if(commonEvents.isDisplayed(plusIconButtonElement)) {
				commonEvents.click(plusIconButtonElement);
				Thread.sleep(2000);
				commonEvents.click(addButtonOfAddExternalReferralByElement);
				Thread.sleep(2000);
				commonEvents.isDisplayed(errorMessageOfAddExternalReferralFormsByElement);
				errorMessageOfAddExternalReferralForms = commonEvents.getText(errorMessageOfAddExternalReferralFormsByElement);
				System.out.println("error Message Of Add External Referral Forms : " + errorMessageOfAddExternalReferralForms );
				return errorMessageOfAddExternalReferralForms;
			}
		}catch(Exception e) {
			throw e;
		}
		return errorMessageOfAddExternalReferralForms;
	}
	
	 /**
     * @Test9
     * Method: verifySuccessNotificationPopupMessage()
     * @param expectedData - A Map containing expected values for referrer details such as 
     *                      referrer name, address, contact number, and email.
     * @description - This method populates the external referral form fields, submits the form, 
     *               and retrieves the success notification message displayed on the UI.
     * @return - A String containing the success notification messages.
     * @throws Exception - Throws an exception if any error occurs during execution.
     * @author - YAKSHA
     */
	
	public String verifySuccessNotificationPopupMessage(Map<String, String> expectedData) throws Exception {
		String successNotificationPopupMessageValue = "";
		try {
			Thread.sleep(10000);
			if(commonEvents.isDisplayed(titleOfaddExternalReferralFormsByElement)) {

				WebElement titleOfaddExternalReferralFormsWebElement = commonEvents.findElement(titleOfaddExternalReferralFormsByElement);
				commonEvents.highlightElementAfterAction(titleOfaddExternalReferralFormsWebElement);

				commonEvents.sendKeys(referrerNameTextFieldElement, expectedData.get("referrerName"));
				commonEvents.sendKeys(extRefferAddressTextFieldElement, expectedData.get("ExtRefferaddress"));
				commonEvents.sendKeys(contactNumberTextFieldElement, expectedData.get("contactNum"));
				commonEvents.sendKeys(emailTextFieldElement, expectedData.get("email"));
				Thread.sleep(1000);
				commonEvents.click(isIncentiveApplicableCheckboxElement);
				commonEvents.click(addButtonElement);

				commonEvents.isDisplayed(successNotificationPopupMessageElement);

				String actualNotificationValue = commonEvents.getText(successNotificationPopupMessageElement);
				System.out.println("success notification popup message text Value : " + actualNotificationValue );

				String notificationMessageOne = commonEvents.getText(successNotificationPopupMessageOneElement);
				System.out.println("notification Message One " + notificationMessageOne);

				String notificationMessageTwo = commonEvents.getText(successNotificationPopupMessageTwoElement);
				System.out.println("notification Message two " + notificationMessageTwo);

				successNotificationPopupMessageValue = notificationMessageOne + " " +notificationMessageTwo ;
				System.out.println("success notification popup message text Value : " + successNotificationPopupMessageValue );

			}
		}catch(Exception e) {
			throw e;
		}	
		return successNotificationPopupMessageValue;
	}
	
	/**
     * @Test10
     * Closes the "Booking OT Schedule New Patient" form using JavaScript.
     * @param null
     * @return True if the form was successfully closed; otherwise, false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Checks if the close button is displayed.
     * - Clicks the close button using JavaScript.
     * - Waits for the action to complete.
     * - Returns true if the form was closed successfully.
     *
     * @author YAKSHA
     */
	public Boolean closeBookingOTScheduleNewPatientFormsByUsingJsExecutor() throws Exception {
		boolean IsDisplayed = false;
		try {
			if (commonEvents.isDisplayed(closeLinkOfBookingOTScheduleNewPatientFormsByElement)) {
				commonEvents.jsClick(closeLinkOfBookingOTScheduleNewPatientFormsByElement);
				Thread.sleep(3000);
				IsDisplayed=true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return IsDisplayed;
	}

	/**
     * @Test11
     * Performs a scroll operation to the bottom of the page and validates the presence of a button and text field.
     * @param expectedData - A Map containing the expected value for the remarks text field.
     * @return True if the button and text field are present; otherwise, false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Expands the billing module.
     * - Navigates to the "New One Counter" section.
     * - Scrolls to the "Hand Over" sub-module and clicks on it.
     * - Scrolls to the bottom of the page.
     * - Validates if the remarks text field and handover button are displayed.
     * - Enters remarks and clicks the handover button if both elements are present.
     *
     * @author YAKSHA
     */
	public Boolean validateBillingHandOverSectionsRemarksFieldAndHandOverButton(Map<String, String> expectedData) throws Exception {
		boolean performScrollOperation = false;
		try {
			commonEvents.jsClick(billingModuleExpandIconByElement);
			Thread.sleep(2000);

			commonEvents.click(newOneCounterLinkByElement);
			Thread.sleep(2000);

			commonEvents.jsScrollPageTillElementVisible(handOverSubModuleLinkByElement, "billing", "handOverElement");
			Thread.sleep(2000);

			commonEvents.click(handOverSubModuleLinkByElement);
			Thread.sleep(3000);

			commonEvents.jsScrollToBottomOfThePage();
			Thread.sleep(2000);

			if(commonEvents.isDisplayed(remarksTextFieldOfBillingSubModulesByElement)&& 
					commonEvents.isDisplayed(handOverToUserButtonOfBillingSubModuleByElement)) {
				commonEvents.sendKeys(remarksTextFieldOfBillingSubModulesByElement, expectedData.get("remarksValue"));
				Thread.sleep(2000);
				commonEvents.click(handOverToUserButtonOfBillingSubModuleByElement);
				System.out.println("Remarks textbox & HandOverToUser button are present");
				performScrollOperation = true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return performScrollOperation;
	}

	 /**
     * @Test12
     * Verifies the locator value of a text box, sends a value to it, and highlights the text box.
     * @param expectedData - A Map containing the value to be entered in the remarks text field.
     * @return The locator value (ID) of the text box as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Checks if the remarks text field is displayed.
     * - Clicks on the text field and clears any existing value.
     * - Enters the provided value into the text field.
     * - Retrieves and prints the locator (ID) of the text box.
     * - Highlights the text box after entering the value.
     *
     * @author YAKSHA
     */
	
	public String verifyLocatorsValueOfELement(Map<String, String> expectedData) throws Exception {
		String locatorsValue = "";
		try {
			Thread.sleep(3000);
			if(commonEvents.isDisplayed(remarksTextFieldOfBillingSubModulesByElement)) {
				Thread.sleep(3000);
				commonEvents.click(remarksTextFieldOfBillingSubModulesByElement);
				commonEvents.clear(remarksTextFieldOfBillingSubModulesByElement);
				Thread.sleep(2000);
				commonEvents.sendKeys(remarksTextFieldOfBillingSubModulesByElement, expectedData.get("remarksValue"));
				locatorsValue = commonEvents.getAttribute(remarksTextFieldOfBillingSubModulesByElement,"id");
				System.out.println("ID locators value of Remarks Texbox : " + locatorsValue);

				WebElement  remarksTextFieldWebElement = commonEvents.findElement(remarksTextFieldOfBillingSubModulesByElement);
				commonEvents.highlightElement(remarksTextFieldWebElement);

			}
		}catch(Exception e) {
			throw e;
		}
		return locatorsValue;
	}

	 /**
     * @Test13
     * Performs a keyboard operation to open the "Vaccination Patient Register" form.
     * @param null
     * @return The title of the "Vaccination Patient Register" form as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Scrolls to the vaccination module section.
     * - Expands the vaccination module and navigates to the patient list sub-module.
     * - Performs the "Alt + N" keyboard shortcut operation.
     * - Retrieves and returns the title of the "Vaccination Patient Register" form.
     *
     * @author YAKSHA
     */
	
	public String performKeyboardOperation() throws Exception {
		String titleNameOfVaccinationPatientRegisterForm = "";
		try {
			Thread.sleep(2000);
			commonEvents.jsScrollPageTillElementVisible(vaccinationModuleByElement, "vaccinationModule", "vaccinationModule");
			if (commonEvents.isDisplayed(vaccinationModuleByElement)) {
				Thread.sleep(2000);
				commonEvents.jsClick(vaccinationModulesToggleIconByElement);
				Thread.sleep(2000);
				commonEvents.jsClick(patientListSubModuleByElement);
				Thread.sleep(5000);
				commonEvents.performAltN();
				Thread.sleep(2000);

				titleNameOfVaccinationPatientRegisterForm = commonEvents.getText(titleNameOfVaccinationPatientRegisterFormByElement);
				System.out.println("title Name Of Vaccination Patient Register form : " + titleNameOfVaccinationPatientRegisterForm);
				return titleNameOfVaccinationPatientRegisterForm;
			}
		}catch(Exception e) {
			throw e;
		}
		return titleNameOfVaccinationPatientRegisterForm;
	}

	/**
     * @Test14.1
     * Verifies the selection and de-selection of radio buttons in the appointment booking module.
     * @param null
     * @return True if the radio buttons are successfully selected and de-selected; otherwise, false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Closes the "Vaccination Patient Register" form if open.
     * - Scrolls to the "Appointment Module".
     * - Expands the "Appointment Module" and navigates to the "Booking Appointment" sub-module.
     * - Clicks the "New Patient" button.
     * - Selects the "Month" radio button and verifies its selection.
     * - Selects the "Days" radio button and verifies that "Month" is de-selected.
     *
     * @author YAKSHA
     */
	public Boolean verifyRadioButton() throws Exception {
		Boolean verifyRadioButton = false;
		try {
			commonEvents.click(closeLinkOfVaccinationPatientRegisterForm);
			Thread.sleep(3000);

			commonEvents.jsScrollPageTillElementVisible(appointmentModuleByElement, "appointmentModule", "appointmentModule");

			if(commonEvents.isDisplayed(appointmentModuleByElement)) {
				commonEvents.jsClick(appointmentModulesToggleIconByElement);
				Thread.sleep(3000);
				commonEvents.jsClick(bookingAppointmentSubModuleByElement);
				Thread.sleep(3000);
				commonEvents.click(newPatientButtonByElement);
				Thread.sleep(3000);

				commonEvents.jsClick(monthRadioButtonByElement);

				if(commonEvents.isSelected(monthRadioButtonByElement)) {
					System.out.println("Month Radio button is selected");
				}

				commonEvents.jsClick(daysRadioButtonByElement);

				if(!commonEvents.isSelected(monthRadioButtonByElement)) {
					System.out.println("Month Radio button is De-Selected");
				}

				verifyRadioButton = true;
			}
		}catch(Exception e) {
			throw e;
		}	
		return verifyRadioButton;
	}

	 /**
     * @Test14.2
     * Verifies that the correct option is selected from a dropdown based on expected data.
     * @param expectedData - A Map containing the value of the option to be selected from the dropdown.
     * @return The selected option as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Selects an option from the "Visit Type" dropdown based on the provided expected data.
     * - Retrieves and returns the first selected option from the dropdown.
     * - Prints the selected option for verification.
     *
     * @author YAKSHA
     */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

		String selectedOption = "" ;

		try {
			commonEvents.selectByVisibleText(selectVisitTypeDropdownByElement, expectedData.get("visitTypeOptionValue"));
			selectedOption = commonEvents.getFirstSelectedOptionFromDropdown(selectVisitTypeDropdownByElement, "elementName", "pageName");
			System.out.println("first selected option from country dropdown : " + selectedOption );
			return selectedOption;
		}catch(Exception e) {
			throw e;
		}	
	}

	 /**
     * @Test15
     * Verifies the error notification popup message using a hard assert.
     * @param null
     * @return The full error notification message as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Checks if the "Add Appointment" button is displayed.
     * - Highlights the "Add Appointment" button.
     * - Clicks the "Add Appointment" button to trigger the error notification popup.
     * - Verifies the presence of the error notification popup.
     * - Retrieves and prints the actual error message, status, and main error message.
     * - Concatenates and returns the full error notification message.
     *
     * @author YAKSHA
     */
	public String verifyErrorNotificationPopupMessage() throws Exception {
		String mainErrorNotificationPopupMessageValue = "";
		try {
			Thread.sleep(2000);
			if(commonEvents.isDisplayed(addAppointmentButtonByElement)) {

				WebElement addAppointmentButtonWebElement = commonEvents.findElement(addAppointmentButtonByElement);
				commonEvents.highlightElementAfterAction(addAppointmentButtonWebElement);

				Thread.sleep(2000);

				commonEvents.click(addAppointmentButtonByElement);

				commonEvents.isDisplayed(errorNotificationPopupMessageElement);

				String actualNotificationErrorMessage = commonEvents.getText(errorNotificationPopupMessageElement);
				System.out.println("Error notification popup message text Value : " + actualNotificationErrorMessage );

				String statusOfErrorMessage = commonEvents.getText(statusErrorNotificationMessageByElement);
				System.out.println("status error notification Message :  " + statusOfErrorMessage);

				String mainNotificationErrorMessage = commonEvents.getText(mainErrorNotificationMessageByElement);
				System.out.println("main notification Error Message :  " + mainNotificationErrorMessage);

				mainErrorNotificationPopupMessageValue = statusOfErrorMessage + " " + mainNotificationErrorMessage ;
				System.out.println("main error notification popup message text Value : " + mainErrorNotificationPopupMessageValue );

				return mainErrorNotificationPopupMessageValue;

			}
		}catch(Exception e) {
			throw e;
		}	
		return mainErrorNotificationPopupMessageValue;
	}
	
	 /**
     * @Test16
     * Handles the auto-suggestion dropdown for selecting an OT Assistant.
     * @param expectedData - A Map containing the OT Assistant name to be searched and selected.
     * @return The selected OT Assistant name as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Operation Theatre" module.
     * - Clicks on the "New OT Booking" button.
     * - Clicks on the "Select OT Assistant Name" field and search box.
     * - Enters the OT Assistant's name into the search box.
     * - Selects the assistant from the auto-suggestion list.
     * - Clicks to confirm the selection.
     * - Verifies if the correct OT Assistant name is selected and returns it.
     *
     * @author YAKSHA
     */
	public String handleAutoSuggesstion(Map<String, String> expectedData) throws Exception {
		String selectedSuggestionValue = "";
		try {
			commonEvents.click(operationTheatreModule);
			Thread.sleep(2000);
			commonEvents.click(newOTBookingButtonByElement);
			Thread.sleep(3000);
			commonEvents.click(selectOTAssistantNameFieldByElement);
			Thread.sleep(3000);
			commonEvents.click(searchTexboxOfSelectOTAssistantNameFieldByElement);
			Thread.sleep(3000);
			commonEvents.sendKeys(searchTexboxOfSelectOTAssistantNameFieldByElement, expectedData.get("otAssistantName"));		
			Thread.sleep(3000);
			commonEvents.jsClick(drPoojaMishraCheckBoxByElement);
			Thread.sleep(3000);
			commonEvents.click(selectOTAssistantNameDropdownByElement);
			Thread.sleep(3000);

			if(commonEvents.isDisplayed(selectOTAssistantNameDropdownByElement)) {
				selectedSuggestionValue = commonEvents.getText(selectOTAssistantNameDropdownByElement);
				System.out.println("selected suggestion value is : " + selectedSuggestionValue);
				return selectedSuggestionValue;
			}
		}catch(Exception e) {
			throw e;
		}
		return selectedSuggestionValue;
	}
	
	

	/**
     * @Test17
     * Captures a screenshot of the current page.
     * @param null
     * @return true if the screenshot is successfully taken, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Clicks on the close button to exit the current module.
     * - Takes a screenshot of the "Operation Theatre Module".
     * - Returns true if the screenshot is successfully captured.
     *
     * @author YAKSHA
     */
	
	public Boolean takingScreenshotOfTheCurrentPage() throws Exception {
		boolean isDisplayed = false;
		commonEvents.click(closeLinkByElement);
		try {
			commonEvents.takeScreenshot("Operation Theatre Module");
			isDisplayed = true;

		}catch(Exception e) {
			throw e;
		}
		return isDisplayed;
	}

	/**
     * @Test18
     * Verifies the tooltip text of an element in the Appointment Module.
     * @param null
     * @return The tooltip text as a String.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Appointment" module.
     * - Waits for and interacts with the "Keyboard" button.
     * - Hovers over the element to trigger the tooltip.
     * - Retrieves and returns the tooltip text.
     *
     * @author YAKSHA
     */
	public String verifyToolTipOfAnElement() throws Exception {
		String tooltipText = "";
		try {
			commonEvents.click(appointmentModule);
			Thread.sleep(3000);
//			commonEvents.click(newOneSelectCounterElement);
			Thread.sleep(3000);
			commonEvents.waitTillElementVisible(keyboardButtonElement,50);
			commonEvents.mouseHoverClick(keyboardButtonElement);
			commonEvents.waitTillElementVisible(altPlusNtooltipMessageElement,50);
			tooltipText = commonEvents.getText(altPlusNtooltipMessageElement);
			System.out.println("New Patient Tooltip text value is:" + tooltipText );
		}catch(Exception e) {
			throw e;
		}
		return tooltipText;
	}
	

	  /**
     * @Test19
     * Handles an alert popup in the Operation Theatre Module.
     * @param null
     * @return true if the alert popup is successfully handled, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Operation Theatre Module".
     * - Clicks on "New OT Booking".
     * - Clicks on "Add New OT" if available.
     * - Accepts and handles the alert popup.
     * - Returns true if the popup is successfully handled.
     *
     * @author YAKSHA
     */
	
	public boolean handleAlertPopup() throws Exception {

		boolean isPopupHandled = false;

		try {
			Thread.sleep(2000);
			commonEvents.click(operationTheatreModule);
			Thread.sleep(2000);
			commonEvents.click(newOTBookingButtonByElement);
			Thread.sleep(2000);
			if(commonEvents.isDisplayed(addNewOtButtonElement)){
				Thread.sleep(2000);
				commonEvents.click(addNewOtButtonElement);
				Thread.sleep(2000);
				// commonEvents.validateAlertMessage();
				commonEvents.acceptAlert();
				isPopupHandled = true;
			}
		}catch(Exception e) {
			throw e;
		}
		return isPopupHandled;
	}

	  /**
     * @Test20
     * Handles file upload in the Scanned Images section.
     * @param pathOfTheFile The file path of the image to be uploaded.
     * @return true if the file is successfully uploaded, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Procurement Module".
     * - Opens the "Settings" tab.
     * - Selects the "Invoice Headers" sub-tab.
     * - Clicks the "Add New Invoice Header" button.
     * - Uploads a file in the "Scanned Images" section.
     * - Returns true if the upload is successful.
     *
     * @author YAKSHA
     */
	public Boolean uploadImageInScannedImagesSection(String pathOfTheFile) throws Exception {
		boolean isUploaded = false;
		try {
			commonEvents.click(closeLinkByElement);
			commonEvents.click(procurementModule);
			Thread.sleep(1000);
			commonEvents.click(settingsTab);
			Thread.sleep(1000);
			commonEvents.click(invoiceHeadersSubTab);
			Thread.sleep(1000);
			commonEvents.click(addNewInvoiceHeaderButton);
			Thread.sleep(1000);
			System.out.println("path of the file" + pathOfTheFile );
			Thread.sleep(1000);
			commonEvents.fileUpload(pathOfTheFile);
			Thread.sleep(1000);
			
			
			
			isUploaded = true;
		}catch(Exception e) {
			throw e;
		}
		return isUploaded;
	}

    /**
     * @Test21
     * Handles interaction with an iframe within the Purchase Order module.
     * @param expectedData A Map containing data values including text to enter in the iframe.
     * @return true if the iframe is handled successfully, otherwise false.
     * @throws Exception if any issue occurs during the process.
     * 
     * This method:
     * - Navigates to the "Procurement Module".
     * - Opens the "Purchase Order" submodule.
     * - Clicks on the "Create Purchase Order" button.
     * - Highlights the "Add Purchase Order Title".
     * - Scrolls to the bottom of the page.
     * - Switches to an iframe and enters text.
     * - Switches back to the main content.
     * - Returns true if the iframe interaction is successful.
     *
     * @author YAKSHA
     */
	public boolean handleIframe(Map<String, String> expectedData) throws Exception {

		boolean iSHandleIframe = false;

		try {
			commonEvents.click(closeLinkByElement);
			Thread.sleep(3000);
			commonEvents.jsClick(procurementModuleByElement);
			commonEvents.jsClick(purchaseOrderSubmoduleByElement);		
			commonEvents.jsClick(createPurchaseOrderButtonByElement);	
		    WebElement addPurchaseOrderTitleWebElement = commonEvents.findElement(addPurchaseOrderTitleByElement);
		    commonEvents.highlight(addPurchaseOrderTitleWebElement);	    
		    String addPurchaseOrderTitleTextValue = commonEvents.getText(addPurchaseOrderTitleByElement);
			System.out.println("title name of the : " + addPurchaseOrderTitleTextValue);			
			commonEvents.jsScrollToBottomOfThePage();
			Thread.sleep(3000);
            driver.switchTo().frame(0);
            commonEvents.sendKeys(iFrameTextEditorByElement, expectedData.get("iframeTextValue"));
            Thread.sleep(3000);
            driver.switchTo().defaultContent();

			iSHandleIframe = true;
		}catch(Exception e) {
			throw e;
		}
		return iSHandleIframe;
	}

}
