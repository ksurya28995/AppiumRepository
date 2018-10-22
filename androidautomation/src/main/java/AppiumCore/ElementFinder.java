package AppiumCore;

public class ElementFinder {

	public static String locator = "new UiSelector()";

	public ElementFinder resourceId(String value) {
		locator += ".resourceId(\"" + value + "\")";
		return this;
	}

	public ElementFinder className(String value) {
		locator += ".className(\"" + value + "\")";
		return this;
	}

	public ElementFinder text(String value) {
		locator += ".text(\"" + value + "\")";
		return this;
	}

	public ElementFinder contDesc(String value) {
		locator += ".description(\""+value+"\")";
		return this;
	}
	
	public ElementFinder xpath(String path) throws InterruptedException {
		locator = locator.replaceAll("new UiSelector()", "");
		locator = path;
		return this;
	}

	public ElementAction makeUiElement() {
		return new ElementAction(locator);
	}
}