@echo off
:: memoryconfig.bat
:: Non-tech user can set these
set JVM_MIN_HEAP=128m
set JVM_MAX_HEAP=1024m

set JAVA_MEM_OPTS=-Xms%JVM_MIN_HEAP% -Xmx%JVM_MAX_HEAP%

call mvn exec:exec ^
  -Dexec.executable="%JAVA_HOME%\bin\java" ^
  -Dexec.args="%JAVA_MEM_OPTS% -cp %%classpath com.niteshsynergy.Main"
