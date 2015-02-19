package hello.domain;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "profile")
@EnableAutoConfiguration
public class User {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "candidateID", nullable = false, updatable = false)
	private Long candidateID;

	@NotNull
	@Column(name = "name", nullable = false)
	private String name;

	@NotNull
	@Column(name = "company", nullable = false)
	private String company;

	@NotNull
	@Column(name = "experience", nullable = false)
	private String experience;

	@NotNull
	@Column(name = "qualification", nullable = false)
	private String qualification;

	@NotNull
	@Column(name = "college", nullable = false)
	private String college;

	@NotNull
	@Column(name = "resume", nullable = false)
	private String resume;

	@NotNull
	@Column(name = "regDate", nullable = false)
	private String regDate;

	@NotNull
	@Column(name = "department", nullable = false)
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public User() {
	}

	public User(String depatment, String name, String company,
			String experience, String qualification, String college,
			String resume, String regDate) {
		this.department = depatment;
		this.name = name;
		this.company = company;
		this.experience = experience;
		this.qualification = qualification;
		this.college = college;
		this.resume = resume;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		this.regDate = dateFormat.format(date);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public long getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(Long i) {
		this.candidateID = i;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("candidateID", candidateID)
				.add("name", name).add("company", company)
				.add("experience", experience)
				.add("qualification", qualification).add("college", college)
				.add("resume", resume).toString();
	}

}
