package sayhi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class personagetest
{
	Person R;
	Person J;
	Person P;
	Person S;
	Person child;

	@BeforeEach
	void setUp() throws Exception
	{
		R = new Person("Romeo","Montague",15);
		J = new Person("Juliet","Capulet",13);
		P = new Person("Prince","Unknown",54);
		S = new Person("William","Shakespeare",32);
	}

	@Test
	void testToString()
	{
		assertEquals("Person: Romeo Montague, 15",R.toString());
		//fail("Not yet implemented");
	}
	@Test
	void testprocreate()
	{
		assertThrows(underageexception.class,
			()->{
				R.procreate(J);
			});
		assertThrows(underageexception.class,
				()->{
					J.procreate(P);
				});
		
		try
		{
			child = S.procreate(P);
			assertEquals(0, child.getAge());
			
		} catch (underageexception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
