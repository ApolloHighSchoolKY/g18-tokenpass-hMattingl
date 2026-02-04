public TokenPass(int playerCount){
  /*  to be answered in part (a) */
  board = new int[playerCount];

  for(int i = 0; i < board.length;i++)
    board[i] = int((math.random()+ 1) * 10);
}

public void distributeCurrentPlayerTokens(){
  /* to be answered in part (b) */
  if(currentPlayer == board.length - 1)
    int givenPlayer = 0;
  else
    int givenPlayer = currentPlayer + 1;

  while(board[currentPlayer] > 0)
  {
    board[givenPlayer] += 1;
    board[currentPlayer] -= 1;
    
    if(givenPlayer == board.length - 1)
      givenPlayer = 0;
    else
      givenPlayer += 1;

  }
  
}
