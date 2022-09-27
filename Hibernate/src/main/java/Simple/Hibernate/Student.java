package Simple.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;



@Entity 
@Setter
@Getter
public class Student {
	
	@Id
	private int stId;
	private String stName;
	private String stCourse;
}