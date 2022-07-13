package reto1;

/* 
 * 
 * 1) Crear clase 'BecaUniversitaria' ✔️
 * 2) Crear método compararInversion -> Sobrecar de métodos con parámetros y sin parámetros
 *      parámetros:
 *          * tiempo
 *          * monto
 *          * interes
 *      Retornar un String:
 *       *"La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia
 *      En el caso de que no se envien datos o se instancie con el constructor sin parámetros:
 *       *"No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada."
 * 
 * Aplicar sobrecarga de métodos al constructor.
 * 
 * NOTA:
 *  Redondear los resultados con Math.round()
 * 
 * 
 * FÓRMULAS:
 * interesSimple = monto * (interes/100) * tiempo ✔️
 * interesCompuesto = monto * ( (1+ (interes/100))^tiempo - 1 ) ✔️
 * compararInversion = interesCompuesto - interesSimple 
 */

//Descomentar al momento de subir a la plataforma
//package co.edu.utp.misiontic2022.reto1.p45;
public class BecaUniversitaria {
    // ATRIBUTOS
    private int pTiempo;
    private double pMonto;
    private double pInteres;

    // CONSTRUCTORES
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        // this.pTiempo -> Atributo
        // pTiempo -> Parámetro
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }

    public BecaUniversitaria() {
        this.pTiempo = 0;
        this.pMonto = 0.0;
        this.pInteres = 0.0;
    }

    // ACCIONES / MÉTODOS

    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }

    public String compararInversion() {
        if (pInteres == 0 && pTiempo == 0 && pMonto == 0) {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        } else {
            double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }

    }

    public double calcularInteresSimple() {
        double interesSimple = Math.round(pMonto * (pInteres / 100) * pTiempo);
        return interesSimple;
    }

    public double calcularInteresCompuesto() {
        double resultado = Math.pow((1 + (pInteres / 100)), pTiempo);
        double interesCompuesto = Math.round(pMonto * (resultado - 1));
        return interesCompuesto;
    }

}
