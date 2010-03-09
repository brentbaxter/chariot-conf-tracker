package chariot

class Conference {

	String name
	Date startDate
	Date endDate
	static hasMany = [tracks:Track]

	static constraints = {
		tracks(nullable:true,blank:true)
	}
}
