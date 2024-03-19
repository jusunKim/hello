class Person{
	private String name;
	private int age;
	public void setName(){
		this.name = name;
	}
	public void setAge(){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public String getAge(){
		return age;
	}
	public void sayHello(){
		System.out.println('Hello,'+name);
	}
}