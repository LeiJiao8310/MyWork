# Program4
# Pair-programming by:
#  Chin-shu shao (Email: cshao3@ucsc.edu) & Lei Jiao (Email: ljiao@ucsc.edu)
# This Makefile  allows user to  run the executable Roots jar file withought typing the javac command.
# This Makefile also submits the homeowrk and check submission by running  'make submit'and
#  'make check'.
Roots: Roots.java
	echo Main-class: Roots > Manifest
	jar vcfm Roots Manifest Roots.class
	rm Manifest
	chmod u+x Roots

Roots.class: Roots.java
	javac -Xlint Roots.java

clean:
	rm -f Roots.class Roots

submit:
	submit cmps012a-pt.w17 pa4 Makefile Roots.java

check:
	ls  /afs/cats.ucsc.edu/class/cmps012a-pt.w17/pa4/ljiao
