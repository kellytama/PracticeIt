//The first 12 Fibonacci numbers are:
// 1 1 2 3 5 8 13 21 34 55 89 144

int f1 = 1;
int f2 = 0;
int f3 = 0;

for (int k = 1; k <= 12; k++){
    if (k < 2){
        System.out.print(f1 + " ");
    } else {
        f3 = f2;
        f2 = f1;
        f1 = f2 + f3;
        System.out.print(f1 + " ");
    }
}
