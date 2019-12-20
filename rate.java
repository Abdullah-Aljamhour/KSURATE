	
package rate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Scanner; 
public class rate {


			
		public static void main(String[] args) {
			int rate = 0;
			String ksuId;
			String nId;
	        Scanner sc = new Scanner(System.in); 

			System.out.print("Enter KSU ID: ");
			ksuId = sc.next();
			System.out.print("Enter National ID: ");
			nId = sc.next();
			System.out.print("Enter rate for ALL the courses from 1 - 5, (5 is the best rate): ");
			rate = sc.nextInt() + 2;
			while (rate > 7 || rate < 2) {
			System.out.print("Enter rate for ALL the courses from 1 - 5, (5 is the best rate): ");
			rate = sc.nextInt() + 2;
			}		
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			driver.get("https://edugate.ksu.edu.sa/ksu/ui/home.faces");
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/table/tbody/tr[1]/td[2]/div/label")).click();
			driver.findElement(By.xpath("/html/body/div/div/ul/li[2]")).click();
			driver.findElement(By.id("loginForm:username")).sendKeys(ksuId);
			driver.findElement(By.id("loginForm:password")).sendKeys(nId);
			driver.findElement(By.id("loginForm:password")).sendKeys(Keys.ENTER);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/center/div[12]/div[2]/div[1]/div[1]/div[2]/form/table/tbody/tr[4]")));
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[1]/div[1]/div[2]/form/table/tbody/tr[4]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/center/div[12]/div[2]/div[1]/div[1]/div[2]/form/table/tbody/tr[4]/td/div/div/table/tbody/tr[6]")));
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[1]/div[1]/div[2]/form/table/tbody/tr[4]/td/div/div/table/tbody/tr[6]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[2]/tbody/tr[2]/td/a")).click();
			try {
			while(true) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[3]/tbody/tr/td/table/tbody/tr[1]/td[1]/a")));
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[3]/tbody/tr/td/table/tbody/tr[1]/td[1]/a")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[3]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[3]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[3]/tbody/tr[3]/td/table/tbody/tr[4]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[3]/tbody/tr[3]/td/table/tbody/tr[5]/td[5]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[4]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[4]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[4]/tbody/tr[3]/td/table/tbody/tr[4]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[5]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[5]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[6]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[6]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[6]/tbody/tr[3]/td/table/tbody/tr[4]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[7]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[7]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[7]/tbody/tr[3]/td/table/tbody/tr[4]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[7]/tbody/tr[3]/td/table/tbody/tr[5]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[7]/tbody/tr[3]/td/table/tbody/tr[6]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[8]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[8]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[4]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[5]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[6]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[7]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[8]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[9]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[9]/tbody/tr[3]/td/table/tbody/tr[10]/td[4]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[10]/tbody/tr[3]/td/table/tbody/tr[2]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[10]/tbody/tr[3]/td/table/tbody/tr[3]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[10]/tbody/tr[3]/td/table/tbody/tr[4]/td["+rate+"]")).click();
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/div/a[1]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[4]/tbody/tr")));
			driver.findElement(By.xpath("/html/body/center/div[12]/div[2]/div[2]/div[3]/form/table[4]/tbody/tr")).click();
				
			}

			}
			catch(Exception e) {
				System.out.println("done");
			}
			sc.close();
			
	}

	
}
