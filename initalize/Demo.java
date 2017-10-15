public class Demo{
	  
	  private int i;
	  public int fun(final int i){
		  this.i = i;
		  return i;
	  }
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.fun(2));
		System.out.println(d.fun(3));
	}
}
