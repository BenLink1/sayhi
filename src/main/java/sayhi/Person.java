package sayhi;

public class Person
{
	String firstname;
	String lastname;
	int age;
	/**
	 * @param firstname
	 * @param lastname
	 * @param age - age of perosn in years
	 */
	public Person(String firstname, String lastname, int age)
	{
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname()
	{
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public Person procreate(Person that) throws underageexception
	{
		if(this.age<18 || that.age<18)
		{
			throw new underageexception();
		}
		Person offspring = new Person(this.firstname, that.lastname, 0);
		return offspring;
	}
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}
	@Override
	public String toString()
	{
		return "Person: " + firstname + " " + lastname + ", " + age;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname()
	{
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	public static void main(String[] args)
	{
		Person r = new Person("Romeo", "Montague", 15);
		System.out.println("R "+r);
	}
	
}


