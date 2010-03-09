dataSource {
	pooled = true
	driverClassName = "org.hsqldb.jdbcDriver"
	username = "sa"
	password = ""
	
	// PostgreSQL settings
	//driverClassName = "org.postgresql.Driver"
	//username = "conftracker"
	//password = "password"
    //dialect = org.hibernate.dialect.PostgreSQLDialect
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop','update'
			//url = "jdbc:postgresql:conftrackDev"
			url = "jdbc:hsqldb:mem:devDB"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			//url = "jdbc:postgresql:conftrackTest"
			url = "jdbc:hsqldb:mem:testDb"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			//url = "jdbc:postgresql:conftrackProd"
			url = "jdbc:hsqldb:file:prodDb;shutdown=true"
		}
	}
}