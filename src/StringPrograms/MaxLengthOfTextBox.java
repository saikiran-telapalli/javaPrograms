package StringPrograms;

public class MaxLengthOfTextBox {

	public static int maxLen(String value) {

		//public void TypeInField(String xpath, String value){
		String val = value; 
		// WebElement element = driver.findElement(By.xpath(xpath));
		//element.clear();
		int i = 0;
		for (;i < val.length(); i++){
			char c = val.charAt(i);
			String s = new StringBuilder().append(c).toString();
			//element.sendKeys(s);
//			if(driver.findElement(By.xpath(xpath)).isDisplayed()) {
//				break;
//			}
		
		}    

		return i;

	}
	
	public static void main(String[] args) {
		int maxLen = maxLen("dusadiugwiuddhqudqwdioudhsunduhunhhunfh");
		System.out.println(maxLen);
	}

}
