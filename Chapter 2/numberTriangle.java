//for loop to produce following output: 

//1
//22
//333
//4444
//55555
//666666
//7777777

for(int i = 1; i <= 7; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(i); // print value of i for each iteration
    }
    System.out.println(); // print a line 7 times
}
