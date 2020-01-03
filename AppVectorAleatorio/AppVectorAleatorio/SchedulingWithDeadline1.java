package Ejercicio8;

public class SchedulingWithDeadline {

	// n = Numero total de actividades
	// tiempoInicio[] = Array con los tiempos de inicio
	// tiempoFin[] = Array con los tiempos de finalizacion

	public static void calcularHorario(int tiempoInicio[], int tiempoFin[], int n) {
		int i, j;
		i = 0;
		System.out.print((i + 1) + " ");
		for (j = 1; j < n; j++) {
			if (tiempoInicio[j] >= tiempoFin[i]) {
				System.out.print((j + 1) + " ");
				i = j;
			}
		}
	}

	public static void main(String[] args) {
		int tiempoInicio[] = {1, 0, 5, 3, 6, 8, 8, 12}; 
		int tiempoFin[] = { 4, 6, 7, 9, 10, 11, 12, 16};
		int n = tiempoInicio.length;

		System.out.print("El horario optimo que minimiza la multa es: ");
		calcularHorario(tiempoInicio, tiempoFin, n);
	}

}
