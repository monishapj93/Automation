package generic;

public interface IAutoConst {
	public static final String CHROME_KEY="webdriver.chrome.driver";
	public static final String CHROME_VALUE="./driver/chromedriver.exe";
	public static final String GECKO_KEY="webdriver.gecko.driver";
	public static final String GECKO_VALUE="./driver/geckodriver.exe";
    
	public static final String CONFIG_PATH="./config.properties";
    public static final String SUMMARY_PATH="./result/summary.xlsx";
    
    String DATA_PATH="./data/input.xlsx";
    String PHOTO_PATH="./photos";
}
