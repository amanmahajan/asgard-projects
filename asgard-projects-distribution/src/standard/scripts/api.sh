#!/bin/bash
export JAVA_HOME=/opt/java

cd /opt/api/
./bin/asgard-projects-distribution server var/conf/server.yml
