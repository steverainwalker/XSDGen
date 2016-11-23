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
	private String bank_id;
	@XmlElement(name="bank_name", required = true)
	private String bank_name;
	
	public Banks(){
		
	}
	
	public Banks(String bank_id, String bank_name) {
		this.bank_id = bank_id;
		this.bank_name = bank_name;
	}
	
    public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	
}
