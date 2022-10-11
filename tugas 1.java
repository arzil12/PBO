public class Main { //1.main program
    public static void main(String[] args) {
        Integer angka;//3. tipe data
        int x = 20;
        int y = 18;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};;
        System.out.println("Hello world!");
        String name = "John";// tipe data
        System.out.println(name);
        angka = 5;//2.variabel
        //perulangan for dan array statis satu dimensi
        System.out.println(angka);
        for (int i=0; i<=3;i++){//4. for
            System.out.println(cars[i]);//8. array satu dimensi
        }
        if (x > y) {// if
            System.out.println("x is greater than y");
        }
        int b = 1;
        while (b <= 3){//while
            System.out.println("Hello World");
            b++;
        }
        int a=1;
        do{// do while
            System.out.println(a);
            a++;
        }while(a<=4);
        // array multi dimensi
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int z = myNumbers[1][2];
        System.out.println(z);

    }


}
