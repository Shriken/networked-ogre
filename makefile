# define compiler, flags
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Main.java \
	Game.java \
	Render.java \
	RenderComponent.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

run:
	java Main
