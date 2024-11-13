Algoritmo ejercicio8
	Escribir "Pon el mes de tu compra"
	Leer mes
	Escribir "Pon el importe total de tu compra"
	Leer importa_total
	
	Si mes="octubre" o mes="Octubre" Entonces
		Escribir "El importa de tu compra con descuento es de: ",importa_total*0.85,"$"
	SiNo
		Escribir "El importe de tu compra es de: ",importa_total,"$"
	Fin Si
	
FinAlgoritmo
