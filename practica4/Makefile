PROG=Main.class
SRCS=Main.java Camion.java
OBJS=$(SRCS:.java=.class)

all: $(PROG)

$(PROG): $(SRCS)
	javac Main.java

.PHONY: edit go

edit:
	@geany -s -i $(SRCS) &

go:
	@java $(PROG)

clean:
	@rm -f $(PROG).class *.class core tags
