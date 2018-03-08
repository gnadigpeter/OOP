
public class eployee {

	public static void main(String[] args) {
		private String name;
		Integer salary;
		
		public void raiseSalary(int raise)
		{
			salary+=raise;
		}
		
		public String toString()
		{
			return "Név: " + name + ", fizetes: "+salary;
		}
	}
}
