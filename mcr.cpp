//test for editing code
bool isWin(char game[3][3]){
bool win = false; 
if (game[0][0] == game[0][1] && game[0][1] == game[0][2] && (game[0][0] 
== 'X' || game[0][0] == 'O')) win = true; 
if (game[1][0] == game[1][1] && game[1][1] == game[1][2] && (game[1][0] 
== 'X' || game[1][0] == 'O')) win = true; 
if (game[2][0] == game[2][1] && game[2][1] == game[2][2] && (game[2][0] 
== 'X' || game[2][0] == 'O')) win = true; 
// column
if (game[0][0] == game[1][0] && game[1][0] == game[2][0] && (game[0][0] 
== 'X' || game[0][0] == 'O')) win = true; 
if (game[0][1] == game[1][1] && game[1][1] == game[2][1] && (game[0][1] 
== 'X' || game[0][1] == 'O')) win = true; 
if (game[0][2] == game[1][2] && game[1][2] == game[2][2] && (game[0][2] 
== 'X' || game[0][2] == 'O')) win = true; 
// diagonal
if (game[0][0] == game[1][1] && game[1][1] == game[2][2] && (game[0][0] 
== 'X' || game[0][0] == 'O')) win = true; 
if (game[0][2] == game[1][1] && game[1][1] == game[2][0] && (game[0][2] 
== 'X' || game[0][2] == 'O')) win = true; 
return win;
} 
int main(){
int i, j;
	char game[3][3] = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
char player1 = 'X'; 
char player2 = 'O'; 
bool turn = true; // false for player 1's turn, true for player 2's turn. Player 1 first.
cout << "X = Player 1" << endl << "O = Player 2" << endl;
 for (int n=0; n<9; n++){
 turn = !turn; // use the not-operator to change true to false or 
false to true.
 if (turn == false) 
 cout << "Player 1: "; 
 else
  cout << "Player 2: "; 
 cout << "Which cell to mark? i:[1..3], j:[1..3]: "; 
 cin >> i >> j;
while( i>2 || j>2 || i<0 || j<0 ) 
		   {
			cout<<"Wrong input,please mark it again "<<endl;
			cin>>i>>j;
			}
		if(turn == false && game[i][j] == ' ')
			game[i][j] = player1;
		else if(turn == true && game[i][j] == ' ')
			game[i][j] = player2;
		if(isWin(game))
		    {
			cout<<"Win!"<<endl;
			break; //need to ternimate the problem
			}
		}
		if(!isWin(game))	
		    cout<<"Tie!"<<endl;
// show the game to console
	for(int r=0;r<3;r++){
	    for(int c=0;c<3;c++)
	    {
	        cout<<game[r][c]<<" ";
	    }
	    cout<<endl;
}
