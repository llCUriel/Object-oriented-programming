/* 
 * File:   main.cpp
 * Author: sdelaot
 *
 * Created on 31 de enero de 2017, 15:09
 */
#include <cstdlib>
#include <stdio.h>

using namespace std;
// PUNTO 1 ( A y B )
#define CTE_EXA_A 10
#define CTE_EXA_B 20

double globalA = 3.14159;
long globalB = 100000;

double calcularPuntoUnoExamA() {
    double localA = 4.22;
    return (CTE_EXA_A * globalA * localA);
}
long calcularPuntoUnoExamB() {
    long localB = 40;
    return (CTE_EXA_B * globalB * localB);
}

// PUNTO 2 
// Examen A
long llamarPuntoDosExamA( long l ) {
    return l*l;
}
long calcularPuntoDosExamA( char ca ) {
    return (long)ca + llamarPuntoDosExamA( 10000 );
}
// Examen B
double llamarPuntoDosExamB( float f ) {
    return f+f;
}
double calcularPuntoDosExamB( int numero ) {
    return (double)numero + llamarPuntoDosExamB( 19.12f );
}

//PUNTO 3
// Examen A
int *procesarArregloExamA( int *arreglo, int lg ) {
    int n = 0;
    for( n=lg-1; n>=0; n-- ) {
        arreglo[n] *= (10+(10*(n+1)));
        }
    return arreglo;
}
void procesarPuntoCuatroExamA() {
    int n = 0;
    int arreglo[] = { 1, 2, 3, 4, 5 };
    printf( "Antes:\n" );
    for( n=0; n<5; n++ ) {
        printf( "%d ", arreglo[n] );
        }
    int *arreglo1 = procesarArregloExamA( arreglo, 5 );
    printf( "\nDespues:\n" );
    for( n=0; n<5; n++ ) {
        printf( "a) %d p) %d ", arreglo[n], arreglo1[n] );
        }
    printf( "\n" );
}
// Examen B
int *procesarArregloExamB( int *arreglo, int lg ) {
    int n = 0;
    for( n=0; n<lg; n++ ) {
        arreglo[n] *= (10+(10*(n+1)));
        }
    return arreglo;
}
void procesarPuntoCuatroExamB() {
    int n = 0;
    int arreglo[] = { 10, 9, 8, 7, 6 };
    printf( "Antes:\n" );
    for( n=0; n<5; n++ ) {
        printf( "%d ", arreglo[n] );
        }
    int *arreglo1 = procesarArregloExamB( arreglo, 5 );
    printf( "\nDespues:\n" );
    for( n=0; n<5; n++ ) {
        printf( "a) %d p) %d ", arreglo[n], arreglo1[n] );
        }
    printf( "\n" );
}

// PUNTO 4
//Examen A
long calcularFibonacci( long numero ) {
    if( numero==0 ) {
        return 1L;
        }
    if( numero==1 ) {
        return 1L;
        }
    return calcularFibonacci( numero-1 ) + calcularFibonacci( numero-2 );
}
//Examen B
long calcularFactorial( long numero ) {
    if( numero==1 ) {
        return 1L;
        }
    return numero * calcularFactorial( numero-1 );
}

// PUNTO 5
// EXAMEN A
double calcularConXExamA( int x ) {
    double PI = 3.14159;
    return (2*x*PI)/2.71;
}
void calcularDiagramaExamenA() {
    int x = 0;
    double res;
    do {
        do {
            printf( "Dame un entero x: " );
            scanf( "%d", &x );
        } while( x<10 );
        res = calcularConXExamA( x );
    } while( res>100 && res<500 );
    printf( "res = %f", res );
}
// EXAMEN B
double calcularConXExamB( int x ) {
    double PI = 3.14159;
    return (2*x*PI)/4.71;
}
void calcularDiagramaExamenB() {
    int x = 0;
    double res;
    do {
        do {
            printf( "Dame un entero x: " );
            scanf( "%d", &x );
        } while( x<10 );
        res = calcularConXExamB( x );
    } while( res>100 && res<500 );
    printf( "res = %f", res );
}
// MAIN
int main(int argc, char** argv) {
    long num = 10;   
    // Examen A
    printf( "%f\n", calcularPuntoUnoExamA() );
    printf( "%ld\n", calcularPuntoDosExamA( 'a' ) );
    procesarPuntoCuatroExamA();
    printf( "Fibonacci(%ld)=%ld\n", num, calcularFibonacci( num ) );
    calcularDiagramaExamenA();
    
    // Examen B
    printf( "%ld\n", calcularPuntoUnoExamB() );
    printf( "%f\n", calcularPuntoDosExamB( 100 ) );
    procesarPuntoCuatroExamB();
    printf( "Factorial(%ld)=%ld\n", num, calcularFactorial( num ) );
    calcularDiagramaExamenB();
    
    return 0;
}
