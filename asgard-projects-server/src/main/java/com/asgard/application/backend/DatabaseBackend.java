package com.asgard.application.backend;

import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface DatabaseBackend {
    @SqlQuery("select 1")
    Integer exampleQuery();
}
