package core.java.genericsAssignment;

 class PairMainClass4 <K,V>
{
		private K key;
		private V value;
		
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getValue() {
			return value;
		}
		public void setValue(V value) {
			this.value = value;
		}
		
		public PairMainClass4(K key, V value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return "PairMainClass4 [key=" + key + ", value=" + value + "]";
		}
		
}

public class MainClass4 
{
	public static void main(String[] args) 
	{
		PairMainClass4<String,String> p =new  PairMainClass4<>("11","abc");
		System.out.println(p.toString());
		p.setKey("HIII");
		p.setValue("!!");
		System.out.println(p.toString());
		
		
		 PairMainClass4<String, java.util.Date> p1=new  PairMainClass4<>("Date is",(new java.util.Date()));
		 System.out.println(p1.toString());

	}

}
