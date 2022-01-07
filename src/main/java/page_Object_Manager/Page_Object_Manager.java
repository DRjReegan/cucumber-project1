package page_Object_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.AddToCart_Page;
import com.pom.Carrier_Page;
import com.pom.Checkout_Page;
import com.pom.Checkout_Page2;
import com.pom.Checkout_Page3;
import com.pom.Colour_Page;
import com.pom.Finalsubmit_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment_Page;
import com.pom.Purchasing_Page;
import com.pom.Quantity_Page;
import com.pom.Submit_Page;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_Page hp;
	private Login_Page lp;
	private Purchasing_Page pp;
	private Colour_Page cp;
	private AddToCart_Page ac;
	private Checkout_Page cp1;
	private Quantity_Page qp;
	private Checkout_Page2 ck;
	private Submit_Page sp;
	private Checkout_Page3 cp3;
	private Carrier_Page cap;
	private Payment_Page pay;
	private Finalsubmit_Page fs;
 
public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
}	
	public Home_Page getinHP(){
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	public Login_Page getinLP() {
		if (lp == null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	public Purchasing_Page getPP() {
		if (pp == null) {
			pp = new Purchasing_Page(driver);
		}
		return pp;
	}
	public Colour_Page getCP() {
		if (cp == null) {
			cp = new Colour_Page(driver);
		}
		return cp;
	}
	public AddToCart_Page getAC() {
		if (ac == null) {
			ac = new AddToCart_Page(driver);
		}
		return ac;
	}
	public Checkout_Page getCP1() {
		if (cp1 == null) {
			cp1 = new Checkout_Page(driver);
		}
		return cp1;
	}
	public Quantity_Page getQP() {
		if (qp == null) {
			qp = new Quantity_Page(driver);
		}
		return qp;
	}
	public Checkout_Page2 getCK() {
		if (ck == null) {
			ck = new Checkout_Page2(driver);
		}
		return ck;
	}
	public Submit_Page getSP() {
		if (sp == null) {
			sp = new Submit_Page(driver);
		}
		return sp;
	}
	public Checkout_Page3 getCP3() {
		if (cp3 == null) {
			cp3 = new Checkout_Page3(driver);
		}
		return cp3;
	}
	public Carrier_Page getCAP() {
		if (cap == null) {
			cap = new Carrier_Page(driver);
		}
		return cap;
	}
	public Payment_Page getPay() {
		if (pay == null) {
			pay = new Payment_Page(driver);
		}
		return pay;
	}
	public Finalsubmit_Page getFS() {
		if (fs == null) {
			fs = new Finalsubmit_Page(driver);
		}
		return fs;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
