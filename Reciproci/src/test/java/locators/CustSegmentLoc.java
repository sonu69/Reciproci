package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustSegmentLoc {

	@FindBy(xpath="//input[@formcontrolname='segmentName']") public WebElement segmentName;

	@FindBy(xpath="//textarea[@formcontrolname='description']") public WebElement segmentDescription;

	@FindBy(xpath="//a[text()='SEGMENT RULE']") public WebElement segment;

	@FindBy(xpath="//button[@data-add='rule']") public WebElement addRule;

	@FindBy(xpath="//button[@data-add='group']") public WebElement addGroup;

	@FindBy(xpath="//div[@class='rule-filter-container']/select") public List<WebElement> filter;

	@FindBy(xpath="//div[@class='rule-operator-container']/select") public List<WebElement> operator;

	@FindBy(xpath="//div[@class='rule-value-container']/select") public List<WebElement> selValue;

	@FindBy(xpath="//div[@class='rule-value-container']/select") public List<WebElement> inputValue;

	@FindBy(xpath="//button[text()='ADD']") public List<WebElement> add;

}