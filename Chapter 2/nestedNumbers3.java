//Modify your code from the previous problem to produce the following output:

//999999999888888887777777666666555554444333221
//999999999888888887777777666666555554444333221
//999999999888888887777777666666555554444333221
//999999999888888887777777666666555554444333221

for(int i = 0; i < 4; i++) { // print 4 lines
    for(int j = 9; j >= 1; j--) { // count down from 9 - 1
        for(int k = 0; k < j; k++) // mod
            System.out.print(j); 
    }
    System.out.println();
}
