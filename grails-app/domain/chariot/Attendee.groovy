package chariot

class Attendee extends Person {

	static hasMany = [registraionts:Registration]
	
    static constraints = {
    }
}
