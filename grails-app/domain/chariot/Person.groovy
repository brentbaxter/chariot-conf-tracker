package chariot

class Person {
	
	String firstName
	String lastName
	String email
	Address address
	
	static embedded = ['address']
	
    static constraints = {
    }
}
