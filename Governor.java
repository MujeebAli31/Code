package edu.monmouth.lab2;

public class Governor {

	private String name;
	private int age;

public Governor( String name, int age)
{
	this.name=name;
	this.age=age;
}
public void setName(String name)
{
	this.name=name;
	
}
public void setAge(int age)
{
	this.age=age;
}
public String getName()
{
	return this.name;
}
public int getAge()
{
	return this.age;
}
@Override
public boolean equals(Object o)
{
	   if (this == o) {
           return true;
       }
       if (o == null || getClass() != o.getClass()) {
           return false;
       }
       Governor governor = (Governor) o;
       return age == governor.age && name.equals(governor.name);
}
@Override
public int hashCode()
{
	  int result = name.hashCode();
      result = 31 * result + age;
      return result;	
}
@Override
public String toString() {
	return "Governor [name=" + name + ", age=" + age + "]";
}

}