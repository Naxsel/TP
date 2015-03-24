.SUFFIXES: .cc .o

PROG=main
SRCS=main.cc Casino.cc SieteYMedio.cc CartaMasAlta.cc Partida.cc Baraja.cc Carta.cc
OBJS=$(SRCS:.cc=.o)

all: $(PROG)

$(PROG): $(OBJS)
	g++ -std=c++11 -o $(PROG) $^

%.o: %.cc
	g++ -std=c++11 -c $<

.PHONY: edit go

edit:
	@geany -s -i $(SRCS) &

go:
	@$(PROG)

clean:
	@rm -f $(PROG) *.o core tags

palo.o: Palo.h
carta.o: Carta.h Carta.cc
baraja.o: Baraja.h Baraja.cc
partida.o: Partida.h Partida.cc
sieteymedio.o: SieteYMedio.h SieteYMedio.cc
cartamasalta.o: CartaMasAlta.h CartaMasAlta.cc
casino.o: Casino.h Casino.cc
main.o: main.cc
