/*

Single responsibility
-> One class should have One responsibility 

Open extension / Closed modification
-> Classes should be easy to extend, but modified only in exceptional circumstances

Lizkov substitution
-> 100% usage of inherited traits, if traits aren't used, why are they there?

Interface segregation
-> Ideally ALL methods in interface should be used by all implementors, if not, segregate

Dependency inversion
-> Higher level classes should not depend on lower level classes
-> should be connected by interfaces


*/


// ##########################################################
// 					DESIGN PATTERNS
// ##########################################################

/*

###################### State Pattern ##############################
This pattern has a High Level Class that uses an interface to implement
Lower level implementations seamlessly at runtime
the attribute controls the logic of which implementation is run

###################### Strategy Pattern ##############################
Basically the same as State pattern, but the focus here is now on
Getting potentially one high level class using multiple interfaces and
implementers, think of it as a difference in scale... I need to use them 
more to understan the subtle differences


###################### Builder Pattern ##############################
This is for allowing us to more flexibly manage a complex class with
many attributes, but in a way that is more human readable and easily
understood

I can change from modifying one attribute to all attributes without
having to overload and have loads of constructors, as languages develop
this is becoming more and more redundant but I still prefer this way
of coding. 

###################### Adapter pattern ##############################
This is for allowing two different classes that wouldn't normally be able
to use each others methods / be comparable, to do so. the example given was
if we wanted to know if a square fit in a circle hole, we could have a convesion
class that allowed java to accept a square as a circle and check if it fits, the
implementation details of that fit check are left to us.

we overrode the method of circle to make it pupose built for square inside the 
adapter. I will need to see use cases for this before really understanding it.


Facade Pattern
This is all about grouping a bunch of related classes together into a wrapper
class that automates their interactions into a simpler to use user interface

we took the process of sending a message and simplified its implementation


*/





public class Default {
	// attributes
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;

	public Default(String attr1, String attr2, String attr3, String attr4, String attr5) {
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
		this.attr4 = attr4;
		this.attr5 = attr5;

	}

}

public class DefaultBuilder {
		// attributes
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String attr5;

	public void setAttr1(){...};
	public void setAttr2(){...};
	public void setAttr3(){...};
	public void setAttr4(){...};
	public void setAttr5(){...};

	public buildDefault() {
		return new Default(
			String attr1, 
			String attr2, 
			String attr3, 
			String attr4, 
			String attr5);
	}

	public DefaultBuilder addAttr1 (String attr) {
		setAttr1(attr);
		return this;
	}

	public DefaultBuilder addAttr2 (String attr) {
		setAttr2(attr);
		return this;
	}

	public DefaultBuilder addAttr3 (String attr) {
		setAttr3(attr);
		return this;
	}

	public DefaultBuilder addAttr4 (String attr) {
		setAttr4(attr);
		return this;
	}

	public DefaultBuilder addAttr5 (String attr) {
		setAttr5(attr);
		return this;
	}
}