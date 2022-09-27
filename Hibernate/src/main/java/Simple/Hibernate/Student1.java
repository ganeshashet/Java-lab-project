package Simple.Hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Student1
{
	@Id
    private int S1id;
    private String S1name;
    private String S1branch;
    @OneToMany
    @JoinColumn(name="S1id")
    private List<Laptop> stuLap;
    public int getS1id() {
	  return S1id;
      }
    public void setS1id(int s1id) {
    	S1id = s1id;
    }
    public String getS1name() {
    	return S1name;
    }
    public void setS1name(String s1name) {
    	S1name = s1name;
    }
    public String getS1branch() {
    	return S1branch;
    }
    public void setS1branch(String s1branch) {
    	S1branch = s1branch;
    }
    
	public List<Laptop> getStuLap() {
		return stuLap;
	}
	public void setStuLap(List<Laptop> stuLap) {
		this.stuLap = stuLap;
	}
	@Override
	public String toString() {
		return "Student1 [S1id=" + S1id + ", S1name=" + S1name + ", S1branch=" + S1branch + "]";
	}
    
 
}
