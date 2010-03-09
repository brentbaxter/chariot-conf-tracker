class BootStrap {

	def init = { servletContext ->
		environments {
			development {
				// dev bootstrap
			}
			test {
				// test bootstap
			}
			production {
				// prod bootstrap
			}
		}     
	}
	
	def destroy = {
	}
} 