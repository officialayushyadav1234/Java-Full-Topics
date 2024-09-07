package Interface_part;

public class RemoteWebDriver implements WebDriver,JavaScriptExecutor,TakeScreenShot{

	public void findElement()
	{
		System.out.println("this is find element");
	}
	public void getTitle()
	{
		System.out.println("this is get title");
	}
	public void executeScript()
	{
		System.out.println("this is execute script");
	}
	public void getScreenShot()
	{
		System.out.println("this is get screenshot");
	}
	
}
