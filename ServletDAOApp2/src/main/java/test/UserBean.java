package test;
import java.io.*;
public class UserBean implements Serializable
{
	private String pCode,pName;
	private int PPrice,Pqty;
	
	public UserBean()
	{
		
	}
	
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPPrice() {
		return PPrice;
	}
	public void setPPrice(int pPrice) {
		PPrice = pPrice;
	}
	public int getPqty() {
		return Pqty;
	}
	public void setPqty(int pqty) {
		Pqty = pqty;
	}
}
