Algoritmo ejercicio2
	Escribir "Pon un n�mero"
	Leer primer_numero
	Escribir "Pon otro n�mero"
	Leer segun_numero
	
	Escribir "�Qu� operaci�n quieres hacer?"
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
		Escribir "la multiplicaci�n es ",multiplicar
	Fin Si
	Si operacion="dividir" Entonces
		Escribir "la divisi�n es ",dividir
	Fin Si
FinAlgoritmo
