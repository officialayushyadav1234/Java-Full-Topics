package Memory_Allocation;

public class EmployDriver {

	public static void main(String[] args) {
		
		System.out.println(Employ.comp_name);
		Employ.giveBiometric();	
		Employ e1=new Employ();
		System.out.println(e1.name);
		System.out.println(e1.id);
		e1.work();
		Employ e2=new Employ();
		Employ e3=new Employ();
		e1.name="mohan";
		e1.id=244;
		e2.name="sohan";
		e2.id=366;
		e3.name="rohan";
		e3.id=367;

		e2.comp_name="GokulDHam Enterprise";
		e2.name="Jethalal JI";

		System.out.println("EMploy1 details===================");
		System.out.println("Employ1 obj reference is: "+e1);
		System.out.println("Employ1 Company name is: "+e1.comp_name);
		System.out.println("Employ1 name is: "+e1.name);
		System.out.println("Employ1 ID is: "+e1.id);
		e1.giveBiometric();
		e1.work();
		System.out.println("EMploy2 details===================");
		System.out.println("Employ2 obj reference is: "+e2);
		System.out.println("Employ2 Company name is: "+e2.comp_name);
		System.out.println("Employ2 name is: "+e2.name);
		System.out.println("Employ2 ID is: "+e2.id);
		e2.giveBiometric();
		e2.work();
		System.out.println("EMploy3 details===================");
		System.out.println("Employ3 obj reference is: "+e3);
		System.out.println("Employ3 Company name is: "+e3.comp_name);
		System.out.println("Employ3 name is: "+e3.name);
		System.out.println("Employ3 ID is: "+e3.id);
		e3.giveBiometric();
		e3.work();

	}
}

/*
ABC
Employ SHould give biometric
null
0
Employ is working
EMploy1 details===================
Employ1 obj reference is: Memory_Allocation.Employ@4517d9a3
Employ1 Company name is: GokulDHam Enterprise
Employ1 name is: mohan
Employ1 ID is: 244
Employ SHould give biometric
Employ is working
EMploy2 details===================
Employ2 obj reference is: Memory_Allocation.Employ@72ea2f77
Employ2 Company name is: GokulDHam Enterprise
Employ2 name is: Jethalal JI
Employ2 ID is: 366
Employ SHould give biometric
Employ is working
EMploy3 details===================
Employ3 obj reference is: Memory_Allocation.Employ@33c7353a
Employ3 Company name is: GokulDHam Enterprise
Employ3 name is: rohan
Employ3 ID is: 367
Employ SHould give biometric
Employ is working
 
 */
