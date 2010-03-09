package chariot

class Track {

	String name
	static hasMany = [sessions:Session]

    static constraints = {
    }
}
