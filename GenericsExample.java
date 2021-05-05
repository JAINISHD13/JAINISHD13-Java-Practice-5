
public class GenericsExample {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		GenericsFactory<Book> factoryB = new GenericsFactory<Book>(Book.class);
		Book book = factoryB.createInstance();
		System.out.println(book.getProductName());
		
		GenericsFactory<Video> factoryV = new GenericsFactory<Video>(Video.class);
		Video video = factoryV.createInstance();
		System.out.println(video.getProductName());
		
		
		Newspaper newspaper = new Newspaper();
		System.out.println(newspaper.getProductName());
		
	}	
}

class Book
{
	public String getProductName()
	{
		return "Books";
	}
}

class Video
{
	public String getProductName()
	{
		return "Video";		
	}
}

class Newspaper
{
	public String getProductName()
	{
		return "NewsPaper";
	}
}


class GenericsFactory<T>
{
	Class theClass = null;
	
	public GenericsFactory(Class theClass)
	{
		this.theClass = theClass;
	}

	public T createInstance() throws InstantiationException, IllegalAccessException
	{
		return (T) this.theClass.newInstance();
	}
}