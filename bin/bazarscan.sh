#!/bin/sh
# tomcat server

if test "$LOGNAME" = "rahul"
then
  echo "This application should not be run as root!"
  exit 1
fi

. `dirname $0`/../etc/env

#Check the logs directory
## $1 = directory
chklogdir () {
  if [ ! -d $1 ]
  then
    echo "creating directory $1...\c"
    mkdir -p $1
  fi
}

chklogdir $logdir

port=9780
BazarscanHOME=/opt/oss/bazarscanUI

JAVA_OPTIONS=" -Xms128m -Xmx512m"
CLASSPATH=$cp; export CLASSPATH

case "$1" in 
'start')
  echo "*** starting $app_name..."
 

 file=$BazarscanHOME/etc/bazarscanpid	
 if  test -f $file 
     then
         echo 
      else
   	 echo 0 >$BazarscanHOME/etc/bazarscanpid
 fi
 
 RUN_STAT=`cat $BazarscanHOME/etc/bazarscanpid`
 if [ $RUN_STAT != 0 ] ; then
     echo "bazarscanpid already Running with pid=" $RUN_STAT
 else
   # Execute the JVM
    cd $app_root
    echo Setting CLASSPATH to: $CLASSPATH
    echo Setting TOMCAT_ROOT to: $tomcat_root
    $java_cmd -Did=$app_name \
	$JAVA_OPTIONS \
	-classpath $CLASSPATH \
        -Dcatalina.home=$tomcat_root \
	-Dcatalina.base=$app_root \
	org.apache.catalina.startup.Bootstrap \
	-config $confdir/server.xml \
	start \
	>> $logdir/catalina.out 2>&1 & 
	echo $! >$BazarscanHOME/etc/bazarscanpid  


fi
  ;;

'stop')
 
   file=$BazarscanHOME/etc/bazarscanpid	
      	if test -f $file
      	then   	    	
   	   PID_VALUE=`cat $BazarscanHOME/etc/bazarscanpid`
   	   if [ $PID_VALUE != 0 ] ; then
   	      kill -9 $PID_VALUE 
   	      KILL_STATUS=$?
   		      if [ $KILL_STATUS = 0 ] ; then
   			echo $KILL_STATUS  >$BazarscanHOME/etc/bazarscanpid
   			echo "Bazarscan killed successfully"
   		      fi
   	   else
   	      echo "Bazarscan is Not Running"
   	   fi    
      	else
               echo " Bazarscan is not running" 
	fi
   
   
   
  ;;

'status')
  file=$BazarscanHOME/etc/bazarscanpid	
  	if test -f $file
  	then	
  	    RUN_STAT=`cat $BazarscanHOME/etc/bazarscanpid`
  	    if [ $RUN_STAT = 0 ] ; then
  		echo "BazarScan not Running  "
  	    else 
  		echo "BazarScan Running with pid=" $RUN_STAT
  	    fi                
  	else
  	    echo "BazarScan not Running"
	fi
  ;;

*)
  echo "usage: $0 { start | stop | status }"
esac
