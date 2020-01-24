#!/bin/sh

#
# use or infer JAVA_HOME
#
if [ -n "$JAVA_HOME" ]
then
    JAVA="$JAVA_HOME"/bin/java
else
    JAVA=java
fi

exec "$JAVA" -cp "../libs/jaxws-tools.jar:../libs/javax.activation.jar:../libs/webservices-api.jar:../libs/istack-commons-runtime.jar:../libs/jaxb-runtime.jar:../libs/jaxb-jxc.jar"  com.sun.tools.ws.WsImport -d ../libs/  "$@"