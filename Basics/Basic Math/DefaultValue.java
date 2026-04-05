class DefaultValue
{
	byte b;
	short s;
	int n;
	long l;
	float f;
	double d;
	char c;
	Boolean bool;
	public static void main(String[] args)
	{
		DefaultValue obj = new DefaultValue();
        	System.out.println("byte default value = " + obj.b);
        	System.out.println("short default value = " + obj.s);
        	System.out.println("int default value = " + obj.n);
        	System.out.println("long default value = " + obj.l);
        	System.out.println("float default value = " + obj.f);
	        System.out.println("double default value = " + obj.d);
        	System.out.println("char default value = " + obj.c);
        	System.out.println("boolean default value = " + obj.bool);
	}
}
