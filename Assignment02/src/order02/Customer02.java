package order02;

public class Customer02 {

	private String name;
	private Integer lcd;
	private Integer ram;
	private Integer mouse;
	private Integer sum;
	private Integer final_sum;
	private Integer payment;
	private Integer change;
	private Boolean member = false;
	private Boolean VIP = false;
	static Integer lcdprice = 4999;
	static Integer ramprice = 1280;
	static Integer mouseprice = 799;
	static Integer discountprice = 20000;
	
	public Customer02(String name, Integer lcd, Integer ram, Integer mouse, Integer payment, Boolean member, Boolean VIP) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		this.mouse = mouse;
		this.payment = payment;
		this.member = member;
		this.VIP = VIP;
		
		
		sum = lcdprice * lcd + ramprice * ram + mouseprice * mouse;
		if (VIP==true && sum >= discountprice)
		      final_sum = (int) (sum * 0.85 * 0.95);
		else if (member==true && sum >= discountprice)
		      final_sum = (int) (sum * 0.95 * 0.95);
		else if (member==true || sum >= discountprice)
			  final_sum = (int) (sum * 0.95); 
		else if (VIP==true)
			  final_sum = (int) (sum * 0.85); 
		else final_sum = sum;
		
		change = payment - final_sum;
			
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLcd() {
		return lcd;
	}

	public void setLcd(Integer lcd) {
		this.lcd = lcd;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getMouse() {
		return mouse;
	}

	public void setMouse(Integer mouse) {
		this.mouse = mouse;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Boolean getMember() {
		return member;
	}

	public void setMember(Boolean member) {
		this.member = member;
	}
	
	public Boolean getVIP() {
		return VIP;
	}

	public void setVIP(Boolean VIP) {
		this.VIP = VIP;
	}
	
	//calculate final sum based on membership and sum
	public void setFinal_sum(Integer final_sum) {
		this.final_sum = final_sum;
		  
	}
	
	public Integer getFinal_sum() {
		return final_sum;
	}
	
	public void setpayment(Integer payment) {
		this.payment = payment;
	  
	}
	public Integer getpayment() {
		return payment;
		
	}
	
	public void setchange(Integer change) {
		this.change = change;
		  
		}
	public Integer getchange() {
		return change;
		}	
	
	
	String show1()
	{return
	"Customer Title: " + getName()+
	"\nLcd: "+ getLcd()+
	"\nRam: "+ getRam()+
	"\nMouse: "+ getMouse()+
	"\nMembership: "+getMember()+
	"\nVIP status: "+getVIP()+
	"\nSubtotal: "+ getSum()+
	"\nFinal total: "+ getFinal_sum();}
	
	String show2()
	{return
	"Customer Title: " + getName()+
	"\nLcd: "+ getLcd()+
	"\nRam: "+ getRam()+
	"\nMouse: "+ getMouse()+
	"\nMembership: "+getMember()+
	"\nVIP status: "+getVIP()+
	"\nSubtotal: "+ getSum()+
	"\nFinal total: "+ getFinal_sum()+
	"\n--------------------------------"+
	"\nYou paid:"+ getpayment()+
	"\nYour change:" + getchange();
	}
	
	String show3()
	{return
	"Customer Title: " + getName()+
	"\nLcd: "+ getLcd()+
	"\nRam: "+ getRam()+
	"\nMouse: "+ getMouse()+
	"\nMembership: "+getMember()+
	"\nVIP status: "+getVIP()+
	"\nSubtotal: "+ getSum()+
	"\nFinal total: "+ getFinal_sum()+
	"\n--------------------------------"+
	"\nYou paid:"+ getpayment()+	"\n您輸入的支付金額不足";
	}
	

}

