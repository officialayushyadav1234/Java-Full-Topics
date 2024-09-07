package ObjectClass_java;

public class EmployDriver {

	public static void main(String[] args) {
		
		Employ e1=new Employ("Mohan", 156, 34543.56);
		Employ e2=new Employ("Sohan", 146, 44543.56);
		Employ e3=new Employ("Mohan", 156, 34543.56);
		System.out.println("==========toString()========");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("========hashCode()============");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println("=============getClass()=========");
		System.out.println(e1.getClass());
		System.out.println(e2.getClass());
		System.out.println(e3.getClass());
		System.out.println("=======equals()================");
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println("=========");
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println("=============finalize()==========");
		e1=null; 
		System.gc();
		e2=null;
	}
}
