import javax.persistence.*;

@Entity
@Table(name="RegularEmployeeSub")
@PrimaryKeyJoinColumn(name="ID")
public class ContractEmployee extends Employee{
@Column(name="payPerHour")
private float payPerHour;
@Column(name="contractDuration")
private String contractDuration;
//getters and setters
public float getPayPerHour() {
	return payPerHour;
}
public void setPayPerHour(float payPerHour) {
	this.payPerHour = payPerHour;
}
public String getContractDuration() {
	return contractDuration;
}
public void setContractDuration(String contractDuration) {
	this.contractDuration = contractDuration;
}

}
