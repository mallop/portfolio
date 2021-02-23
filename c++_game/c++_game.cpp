#include<iostream>
#include<cstdlib>
using namespace std;
//........................................................ deklaracje funkcji
void naglowek();
void plansza();
void pusta_tab(string tab[6][7]);               
void wyswietl_gracz(string tab[6][7]);              // wyswietlenie planszy z wpisanym zetonem gracza/komputera


//........................................................ poczatek programu
int main(){
                           //deklaracje:
string tab[6][7];          //tablicy
int z=0;                   //liczba konczaca program 
string zaw="oooo";         //wyglad zetonu gracza
string los="####";         //wyglad zetonu komputera
int k_gracz = 0;           //wyzerowanie warosci zetonu gracza
int k_komp = 0;            //wyzerowanie wartosci zetonu komputera
int kol1 = 5, kol2 = 5, kol3=5, kol4 = 5, kol5 = 5, kol6 = 5, kol7 = 5;     //przypisanie ostatniego wiersza kolumnom
naglowek();                                   
plansza();	
pusta_tab(tab);	
	

do{
//...........................................................ruch gracza
cout << "nr zetonu gracza   ";
cin >> k_gracz;
cout << endl;
	
while(k_gracz<1 || k_gracz>7){
cout<<"liczba spoza zakresu (1-7)-prosze podac inna";
cin>>k_gracz;
}

		
if(k_gracz == 1){
   k_gracz = k_gracz - 1; 
   tab[kol1][k_gracz] = "oooo";
   kol1--;
   if(kol1<0)
   kol1=0;
}
		
if(k_gracz == 2){
   k_gracz = k_gracz - 1; 
   tab[kol2][k_gracz] = "oooo";
   kol2--;
   if(kol2<0)
   kol2=0;
}     

if(k_gracz == 3){
   k_gracz = k_gracz - 1; 
   tab[kol3][k_gracz] = "oooo";
   kol3--;
   if(kol3<0)
   kol3=0;
}          
			
if(k_gracz == 4){
   k_gracz = k_gracz - 1; 
   tab[kol4][k_gracz] = "oooo";
   kol4--;
   if(kol4<0)
   kol4=0;
}          
			
if(k_gracz == 5){
   k_gracz = k_gracz - 1; 
   tab[kol5][k_gracz] = "oooo";
   kol5--;
   if(kol5<0)
   kol5=0;
}          
		
if(k_gracz == 6){
   k_gracz = k_gracz - 1; 
   tab[kol6][k_gracz] = "oooo";
   kol6--;
   if(kol6<0)
   kol6=0;
}          
			
if(k_gracz == 7){
   k_gracz = k_gracz - 1; 
   tab[kol7][k_gracz] = "oooo";
   kol7--;
   if(kol7<0)
   kol7=0;
}

   wyswietl_gracz(tab);                            // pokazanie w tabeli w jakie miejsce gracz wrzucil zeton
//................................................. sprawdzanie czy gracz wygral
for(int i=0; i<6;i++)                               // powtarzanie, by przeszukac cala plansze
{
	
  if(zaw==tab[i][0])
{                                 //sprawdzenie czy sa 4 te same zetony w poziomie
  if(zaw==tab[i][1]){
  if(zaw==tab[i][2]){
  if(zaw==tab[i][3]){
  cout<<"gracz wygral";
   return 0;	 	
  }
  }
  }
}
		
   if(zaw==tab[i][1])
{	
   if(zaw==tab[i][2]){
   if(zaw==tab[i][3]){
   if(zaw==tab[i][4]){
   cout<<"gracz wygral";
   return 0;	 	
   }
   }
   }
}

   if(zaw==tab[i][2])
{
   if(zaw==tab[i][3]){
   if(zaw==tab[i][4]){
   if(zaw==tab[i][5]){
   cout<<"gracz wygral";
   return 0;	 	
   }
   }
   }
}

   if(zaw==tab[i][3])
{
   if(zaw==tab[i][4]){
   if(zaw==tab[i][5]){
   if(zaw==tab[i][6]){
   cout<<"gracz wygral";
   return 0;	 	
   }
   }
   }
}

}


for(int j=0;j<7;j++)                            
{
		
   if(zaw==tab[5][j])                      //sprawdzenie czy sa 4 te same zetony w pionie
{
   if(zaw==tab[4][j]){
   if(zaw==tab[3][j]){
   if(zaw==tab[2][j]){
   cout<<"gracz wygral";
   return 0;	 	
   }
   }
   }
}

   if(zaw==tab[4][j])
{
   if(zaw==tab[3][j]){
   if(zaw==tab[2][j]){
   if(zaw==tab[1][j]){
   cout<<"gracz wygral";
   return 0;	 	
   }
   }
   }
}

   if(zaw==tab[3][j])
{
   if(zaw==tab[2][j]){
   if(zaw==tab[1][j]){
   if(zaw==tab[0][j]){
   cout<<"gracz wygral";
   return 0;	 	
   }
   }
   }
}

}


for(int j=0; j<4 ;j++)
{
   if(zaw==tab[2][j]){
   if(zaw==tab[3][j+1]){
   if(zaw==tab[4][j+2]){                         //sprawdzanie czy gracz wygral, wrzucajac 4 zetony po skosie (od lewej)
   if(zaw==tab[5][j+3]){
   cout<<"gracz wygral";
   return 0;                       
   }
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(zaw==tab[1][j]){
   if(zaw==tab[2][j+1]){
   if(zaw==tab[3][j+2]){
   if(zaw==tab[4][j+3]){
   cout<<"gracz wygral";
   return 0;
   }
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(zaw==tab[0][j]){
   if(zaw==tab[1][j+1]){
   if(zaw==tab[2][j+2]){
   if(zaw==tab[3][j+3]){
   cout<<"gracz wygral";
   return 0;
   }
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(zaw==tab[5][j]){                               //sprawdzanie czy gracz wygral, wrzucajac 4 zetony po skosie (od prawej):
   if(zaw==tab[4][j+1]){
   if(zaw==tab[3][j+2]){                         
   if(zaw==tab[2][j+3]){
   cout<<"gracz wygral";
   return 0;                         
   }
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(zaw==tab[4][j]){
   if(zaw==tab[3][j+1]){
   if(zaw==tab[2][j+2]){                         
   if(zaw==tab[1][j+3]){
   cout<<"gracz wygral";
   return 0;                        
   }
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(zaw==tab[3][j]){
   if(zaw==tab[2][j+1]){
   if(zaw==tab[1][j+2]){                         
   if(zaw==tab[0][j+3]){
   cout<<"gracz wygral";
   return 0;                        
   }
   }
   }  
   }
}


//....................................................... ruch komputera
cout<<"kolej komputera- prosze wcisnac enter \n\n\n";
system("pause");  
k_komp=1+rand()%7;

while(k_komp<1 || k_komp>7){
	cin>>k_komp;
}

if(k_komp == 1){
   k_komp--; 
   tab[kol1][k_komp] = "####";
   kol1--;
   if(kol1<0)
   kol1=0;
}                                        //nr kolumny, ktora wybiera komputer
			
if(k_komp == 2){
   k_komp--;
   tab[kol2][k_komp] = "####";
   kol2--;
   if(kol2<0)
   kol2=0;
}     
		
if(k_komp == 3){
   k_komp--;
   tab[kol3][k_komp] = "####";
   kol3--;
   if(kol3<0)
   kol3=0;
}          
			
if(k_komp == 4){
   k_komp--;
   tab[kol4][k_komp] = "####";
   kol4--;
   if(kol4<0)
   kol4=0;
}          
			
if(k_komp == 5){
   k_komp--;
   tab[kol5][k_komp] = "####";
   kol5--;
   if(kol5<0)
   kol5=0;
}          
			
if(k_komp == 6){
   k_komp--;
   tab[kol6][k_komp] = "####";
   kol6--;
   if(kol6<0)
   kol6=0;
}          
			
if(k_komp == 7){
   k_komp--;
   tab[kol7][k_komp] = "####";
   kol7--;
   if(kol7<0)
   kol7=0;
}           

wyswietl_gracz(tab);                            // pokazanie w tabeli w jakie miejsce gracz wrzucil zeton
//................................................. sprawdzanie czy komputer wygral
              
for(int i=0; i<6;i++)
{
		
   if(los==tab[i][0]){                         // sprawdzenie czy sa 4 te same zetony w poziomie
   if(los==tab[i][1]){
   if(los==tab[i][2]){
   if(los==tab[i][3]){
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
}
		
   if(los==tab[i][1]){
   if(los==tab[i][2]){
   if(los==tab[i][3]){
   if(los==tab[i][4]){
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
}

   if(los==tab[i][2]){
   if(los==tab[i][3]){
   if(los==tab[i][4]){
   if(los==tab[i][5]){
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
}

   if(los==tab[i][3]){
   if(los==tab[i][4]){
   if(los==tab[i][5]){
   if(los==tab[i][6]){
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
}

}
                                                   

for(int j=0;j<7;j++)
{
		
   if(los==tab[5][j]){                       //sprawdzenie czy sa 4 te same zetony w pionie
   if(los==tab[4][j]){
   if(los==tab[3][j]){
   if(los==tab[2][j])
   {
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
}

   if(los==tab[4][j]){
   if(los==tab[3][j]){
   if(los==tab[2][j]){
   if(los==tab[1][j]){
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
}

   if(los==tab[3][j]){
   if(los==tab[2][j]){
   if(los==tab[1][j]){
   if(los==tab[0][j]){
   cout<<"komputer wygral";
   return 0;	 	
   }
   }
   }
   }

}


for(int j=0; j<4 ;j++)
{
    if(los==tab[2][j]){
	if(los==tab[3][j+1]){
	if(los==tab[4][j+2]){                         //sprawdzanie czy gracz wygral, wrzucajac 4 zetony po skosie (od lewej)
    if(los==tab[5][j+3]){
	cout<<"komputer wygral";
	return 0;                         
	}
	}
	}
    }
}

for(int j=0; j<4 ;j++)
{
    if(los==tab[1][j]){
	if(los==tab[2][j+1]){
	if(los==tab[3][j+2]){
	if(los==tab[4][j+3]){
	cout<<"komputer wygral";
	return 0;
	}
    }
	}
    }
}

for(int j=0; j<4 ;j++)
{
    if(los==tab[0][j]){
	if(los==tab[1][j+1]){
	if(los==tab[2][j+2]){
	if(los==tab[3][j+3]){
	cout<<"komputer wygral";
	return 0;
	}
    }
	}
    }
}


                                      
for(int j=0; j<4 ;j++)
{
   if(los==tab[5][j]){                          //sprawdzanie czy gracz wygral, wrzucajac 4 zetony po skosie (od prawej):
   if(los==tab[4][j+1]){
   if(los==tab[3][j+2]){                         
   if(los==tab[2][j+3]){
   cout<<"komputer wygral";
   return 0;                         
   } 
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(los==tab[4][j]){
   if(los==tab[3][j+1]){
   if(los==tab[2][j+2]){                         
   if(los==tab[1][j+3]){
   cout<<"komputer wygral";
   return 0;                         
   }
   }
   }
   }
}


for(int j=0; j<4 ;j++)
{
   if(los==tab[3][j]){
   if(los==tab[2][j+1]){
   if(los==tab[1][j+2]){                         
   if(los==tab[0][j+3]){
   cout<<"komputer wygral";
   return 0;                         
   }
   }
   }
   }
}


cout<<endl;
cout<<endl;
cout << "koniec-0, inna cyfra-dalej";
cin >> z;	
}	
while(z!=0);	

return 0;
}


void naglowek(){
	cout<<endl;
	cout<<"Gra dla 2 graczy-jednym z nich jest komputer."<<endl;
	cout<< "Gracze na przemian wrzucaja swoje zetony do pionowo ustawionej planszy"<<endl;
	cout<<"Wygrywa ten, ktory pierwszy ustawi swoje 4 zetony:"<<endl;
	cout<<"pionowo"<<endl;
	cout<<"poziomo"<<endl;
	cout<<"lub na skos"<<endl;
    cout<<"             zeton gracza  oooo"<<"    "<<"zeton komputera ####"<<endl;
    cout<<"                           oooo"<<"    "<<"                ####"<<endl;
    cout<<"\n\n\n";
	system("pause");
	
}


void plansza(){
	for (int i = 0; i<6; i++){                    //wykonywanie powtorzen

		for (int i = 0; i<7; i++)
			cout << "+-----";
		cout << "+";
		cout << endl;

		for (int i = 0; i<7; i++)                     
			cout << "|     ";                     //rysowanie tabeli
		cout << "|";
		cout << endl;

		for (int i = 0; i<7; i++)
			cout << "|     ";
		cout << "|";
		cout << endl;
	}

	    for (int i = 0; i<7; i++)
	    cout << "+-----";
	    cout << "+";
	    cout << endl;
        cout << "   1     2     3     4     5     6     7\n\n";
}


void pusta_tab(string gra[6][7]){             //wczytanie pustej tabeli
for (int i = 0; i<6; i++){                    
    for (int j = 0; j<7; j++)
    gra[i][j] = "    "; 	                 //wczytanie pustych miejsc
    }
}


void wyswietl_gracz(string gra[6][7]){
   for (int m = 0; m<6; m++){
      for (int j = 0; j<7; j++)
	  cout << "+-----";
      cout << "+";	                                     //wczytanie zetonu do tabeli
	  cout << endl;
	for (int k = 0; k<7; k++)
	  cout << "| " << gra[m][k];
	  cout << "|";
	  cout << endl;
	for (int l = 0; l<7; l++)
	  cout << "| " << gra[m][l];
	  cout << "|";
	  cout << endl;
}
	for (int n = 0; n<7; n++)
	cout << "+-----";
    cout << "+";
	cout << endl;
    cout << "   1     2     3     4     5     6     7";
    cout << endl;	
}




	

