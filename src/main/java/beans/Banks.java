package beans;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
@XmlRootElement(name = "banks")
@Entity
public class Banks {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@XmlID
	@XmlElement(name="bank_id", required = true)
	private String bankID;
	@XmlElement(name="bank_name", required = true)
	private String bankName;
	
	public Banks(){
		
	}
	
	public Banks(String bankID, String bankName) {
		this.bankID = bankID;
		this.bankName = bankName;
	}
	
    public String getBankID() {
		return bankID;
	}
	public void setBankID(String bankID) {
		this.bankID = bankID;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBank_name(String bankName) {
		this.bankName = bankName;
	}
	
	public String toString()
	{
		return String.format(
                "Bank[bankID=%d, bankName='%s']",
                bankID, bankName);
	}
	
}
