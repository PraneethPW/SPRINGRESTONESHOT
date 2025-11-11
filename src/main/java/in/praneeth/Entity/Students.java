package in.praneeth.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document
@Component
public class Students {

	public Students() {
		System.out.println("ENTITY CLASS CREATED");
		
	}
	@Id
	private String studentName ;
	private Integer studentAge;
	private String studentSection;
	private String studentCity;
	
	
 
	
	@Override
	public String toString() {
		return "Students [studentName=" + studentName + ", studentAge=" + studentAge + ", studentSection="
				+ studentSection + ", studentCity=" + studentCity + "]";
	}


	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the studentAge
	 */
	public Integer getStudentAge() {
		return studentAge;
	}
	/**
	 * @param studentAge the studentAge to set
	 */
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	/**
	 * @return the studentSection
	 */
	public String getStudentSection() {
		return studentSection;
	}
	/**
	 * @param studentSection the studentSection to set
	 */
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	/**
	 * @return the studentcity
	 */
	public String getStudentCity() {
		return studentCity;
	}
	/**
	 * @param studentcity the studentcity to set
	 */
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


	
}
