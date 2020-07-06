import java.util.*;
import java.io.*;

class custom_comparators
{
    public static void main(String[] args) throws IOException
    {
		
		ArrayList<Person> list = new ArrayList<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        String name, city;
        int age;
        String[] separate_name;
        
        while(true)
        {
            System.out.println("Enter Name : ");
            name = br.readLine();
            separate_name = name.split(" ");
            System.out.println("Enter City : ");
            city = br.readLine();
            System.out.println("Enter Age : ");
            age = Integer.parseInt(br.readLine());
            
            list.add(new Person(separate_name[0], separate_name[1], city, age));
            
            System.out.println("Do you want to add more? (y/n)");
            String ans = br.readLine();
            if(ans.equals("n"))
                break;
        }

        for(Person detail : list)
        {
			System.out.println(detail);
        }
        
        System.out.println("Sort by : ");
        System.out.println("1 : First Name ");
        System.out.println("2 : Last Name ");
        System.out.println("3 : Age ");
        System.out.println("4 : City ");
        
        int choice = Integer.parseInt(br.readLine());

        switch(choice) 
        {
            case 1: Collections.sort(list, new SortByFName());
            break;
            case 2: Collections.sort(list, new SortByLName());
            break;
            case 3: Collections.sort(list, new SortByAge());
            break;
            case 4: Collections.sort(list, new SortByCity());
            break;
            default: System.out.println("Invalid Choice!");
        }

		System.out.println("After Sorting list: ");

        for(Person detail : list)
        {
			System.out.println(detail);
		}


	}
}


class Person
{
	String f_name,l_name, city;
    int age;

    Person(String f_name,String l_name, String city, int age)
    {
        this.f_name = f_name;
        this.l_name = l_name;
		this.city = city;
		this.age = age;
	}

    String getName()
    {
		return (this.f_name+ " " + this.l_name);
	}
    
    String get_f_Name()
    {
		return this.f_name;
    }
    
    String get_l_Name()
    {
		return this.l_name;
    }
    
    String getCity()
    {
		return this.city;
	}

    Integer getAge()
    {
		return this.age;
	}


	@Override
    public String toString()
    {
        return "Person details : " + this.getName() + ", " + this.getAge() + ", " + this.getCity();
	}
}

// Separate class for sorting using : Comparator
class SortByFName implements Comparator<Person>
{
	@Override
    public int compare(Person first, Person second)
    {
        return first.get_f_Name().compareTo(second.get_f_Name());
	}
}

class SortByLName implements Comparator<Person>
{
	@Override
    public int compare(Person first, Person second)
    {
        return first.get_l_Name().compareTo(second.get_l_Name());
    }
}

class SortByAge implements Comparator<Person>
{
	@Override
    public int compare(Person first, Person second)
    {
		return first.getAge().compareTo(second.getAge());
	}
}

class SortByCity implements Comparator<Person>
{
	@Override
    public int compare(Person first, Person second)
    {
		return first.getCity().compareTo(second.getCity());
    }
}
