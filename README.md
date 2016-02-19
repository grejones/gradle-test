# gradle-test
Very sparse meaningless example to illustrate Gradle Incremental Java build
I'm using this purely to illustrate/repeat a problem I'm seeing when I try to perform incremental Java compiles in Gradle.
In the src directory are a couple .java files.  The com.my.test.Person2.java references the com.my.test.Person class. 
Similarly, in the src2 directory the com.my.test.DeptInSrc2.java references the same com.my.test.Person class. This is a "cross-project"
reference in terms of src is built by one project and src2 is built by another project.

What I see consistently (when I run the build script in the root gradle-test directory) is that changes to Person class that should force a
recompile of the classes that reference it - only recompile the ones in the same project (i.e. Person2).  They do not recompile the one in
the src2 project (DeptInSrc2).

Again - this whole project is extremely simplistic and the logic/syntax of any of the files contained is meaningless. The purpose of it
is just testing of references and incremental Java compile using Gradle.
I've been building with a command like invocation like: gradle --info compileJava >> /temp/gradlerun.log 2>> /temp/gradlerun_error.log
So that I could view more detailed information that resulted.
