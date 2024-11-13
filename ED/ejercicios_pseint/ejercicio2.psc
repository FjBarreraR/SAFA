Algoritmo ejercicio2
	Escribir "Pon un número"
	Leer primer_numero
	Escribir "Pon otro número"
	Leer segun_numero
	
	Escribir "¿Qué operación quieres hacer?"
	Leer operacion

	suma<-primer_numero+segun_numero
	resta<-primer_numero-segun_numero
	multiplicar<-primer_numero*segun_numero
	dividir<-primer_numero/segun_numero
	Si operacion="suma" Entonces
		Escribir "la suma es ", suma
	Fin Si
	Si operacion="resta" Entonces
		Escribir "la resta es ",resta
	FinSi
	Si operacion="multiplicar" Entonces
		Escribir "la multiplicación es ",multiplicar
	Fin Si
	Si operacion="dividir" Entonces
		Escribir "la división es ",dividir
	Fin Si
FinAlgoritmo
