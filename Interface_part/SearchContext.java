package Interface_part;

public interface SearchContext {

    public void findElement();
	
	default void search()
	{
		System.out.println("This is default implementation form searchcontext");
	}
}
