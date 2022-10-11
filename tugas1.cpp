#include<iostream>
using namespace std;

int main(){
	int angka;
	string nama[3]={"nanda", "asep", "udin"};
	int myNumbers[3][4]= { {1, 2, 3, 4}, {5, 6, 7} };
	angka=5;
	for(int i=0;i<=2; i++){
		cout<<"nama: "<<nama[i]<<endl;
	}
	if(angka>4){
		cout<<"5 lebih dari 4"<<endl;
	}
	int b = 1;
        while (b <= 3){//while
            cout<<"Hello World"<<endl;
            b++;
        }
    int a=1;
        do{// do while
            cout<<a<<endl;
            a++;
        }while(a<=4);
        // array multi dimensi
        int z = myNumbers[1][2];
        cout<<"array yang dipanggil: "<<z;
	
}
