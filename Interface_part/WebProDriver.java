package Interface_part;

public class WebProDriver {

	public static void main(String[] args) {
		
		WebDriver wd=new ChromeDriver();
		TakeScreenShot t1=(TakeScreenShot)wd;
		t1.getScreenShot();
		ChromeDriver cd=(ChromeDriver)wd;
		cd.getScreenShot();
		cd.search();
	}
}
