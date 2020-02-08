public class Book
{
    private String name;
    private String author;
    private String publisher;
    private String number;
    private String type;
    private String year;

  public Book()
  {
    name = null;
    author = null;
    publisher = null;
    number = null;
    type = null;
    year = null;
   }

  public Book(String Name,String Author,String Publisher,String Number,String Type,String Year)
  {
    setName(Name);
    setAuthor(Author);
    setPublisher(Publisher);
    setNumber(Number);
    setType(Type);
    setYear(Year);
   }

  public boolean setName(String n)
  {
      name = n;
      return true;
   }
   
   public boolean setAuthor(String a)
	 {
      author = a;
      return true;
     }
	 public boolean setPublisher(String p)
	{
   
      publisher = p;
      return true;
      
	}
   
    public boolean setNumber(String num)
  {
   if(num.substring(0,1).matches("[A-Za-z]") && num.substring(1,6).matches("[0-9]{5}"))
    {
      number = num;
      
	}
	return true;
  }
  
    public boolean setType(String t)
  {
   
      type = t;
      return true;
      
  }
	 public boolean setYear(String y)
	{
   
      year = y;
      return true;
  
     }
   

  public String getName()
   {
    return name;
   }

  

  public String getAuthor()
  {
   return author;
  }

 

  public String getPublisher()
  {
   return publisher;
  }

  public String getNumber()
  {
    return number;
  }

  public String getType()
  {
   return type;
  }

   public String getYear()
  {
   return year;
  }
 }
