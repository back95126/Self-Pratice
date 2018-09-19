#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
using namespace std;
int a, b, c;             // 101 100 99
char temp;
char temps;
char tempes;
int main()
{
    printf("Please Enter a , b , c:\n");
    scanf("%d %d %d",&a ,&b ,&c);

    while (a > c)
    {
        tempes = a;
        a = c;
        c = tempes;
    }


    while (a > b)
    {
        temps = a;
        a = b;
        b = temps;
    }

    while (b > c)
    {
        temp = b;
        b = c;
        c = temp;
    }

    printf("%d %d %d\n",a ,b ,c);

    if(a + b <= c){printf("No!\n");}
    else if((a * a)+(b * b) < c * c){printf("Obtuse\n");}
    else if((a * a)+(b * b) == c * c){printf("Right\n");}
    else if((a * a)+(b * b) > c * c){printf("Acute\n");}

}
