package chariot

class Speaker extends Person {

	static hasMany = [sessions:Session]
	
    static constraints = {
    }
}
