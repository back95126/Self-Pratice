include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
using namespace std;
int a, b, c, d, e, f;
 
char fb = 0;
int main()
{
    printf("***** Welcome to Play The NUMBER GAME *****\n");
    printf("-\n");
    printf("***** Now Let's we start the game *****\n");
    printf("-\n");
    printf("***** Is your number existed in here? *****\n");
    printf("***** 0: YES 1: NO *****\n");
    printf("*****  1, 3, 5, 7, 9,11,13,15 *****\n");
    printf("***** 17,19,21,23,25,27,29,31 *****\n");
    printf("***** 33,35,37,39,41,43,45,47 *****\n");
    printf("***** 49,51,53,55,57,59,61,63 *****\n");
    scanf("%d",&a);
    if(a == 0)
    {fb = fb + 1;}
    else{fb = 0;}
 
 
 
    printf("***** Is your number existed in here? *****\n");
    printf("*****  2, 3, 6, 7,10,11,14,15 *****\n");
    printf("***** 18,19,22,23,26,27,30,31 *****\n");
    printf("***** 34,35,38,39,42,43,46,47 *****\n");
    printf("***** 50,51,54,55,58,59,62,63 *****\n");
    scanf("%d",&b);
    if(b == 0)
    {fb = fb + 2;}
    else{fb == fb;}
 
 
 
    printf("***** Is your number existed in here? 0/1 *****\n");
    printf("*****  4, 5, 6, 7,12,13,14,15 *****\n");
    printf("***** 20,21,22,23,28,29,30,31 *****\n");
    printf("***** 36,37,38,39,44,45,46,47 *****\n");
    printf("***** 52,53,54,55,60,61,62,63 *****\n");
    scanf("%d",&c);
    if(c == 0)
    {fb = fb + 4;}
    else{fb == fb ;}
 
    printf("***** Is your number existed in here? 0/1 *****\n");
    printf("*****  8, 9,10,11,12,13,14,15 *****\n");
    printf("***** 24,25,26,27,28,29,30,31 *****\n");
    printf("***** 40,41,42,43,44,45,46,47 *****\n");
    printf("***** 56,57,58,59,60,61,62,63 *****\n");
    scanf("%d",&d);
    if(d == 0)
    {fb = fb + 8;}
    else{fb == fb ;}
 
 
    printf("***** Is your number existed in here? 0/1 *****\n");
    printf("***** 16,17,18,19,20,21,22,23 *****\n");
    printf("***** 24,25,26,27,28,29,30,31 *****\n");
    printf("***** 48,49,50,51,52,53,54,55 *****\n");
    printf("***** 56,57,58,59,60,61,62,63 *****\n");
    scanf("%d",&e);
    if(e == 0)
    {fb = fb + 16;}
    else{fb == fb ;}
 
 
 
    printf("***** Is your number existed in here? 0/1 *****\n");
    printf("***** 32,33,34,35,36,37,38,39 *****\n");
    printf("***** 40,41,42,43,44,45,46,47 *****\n");
    printf("***** 48,49,50,51,52,53,54,55 *****\n");
    printf("***** 56,57,58,59,60,61,62,63 *****\n");
    scanf("%d",&f);
    if(f == 0)
    {fb = fb + 32;}
    else{fb == fb ;}
 
   
    printf("Your number is :%2d\n",fb);
   
}
