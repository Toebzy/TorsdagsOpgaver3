int[][] chessArray = new int[8][8];
void setup() {
  size(800, 800);
  for(int i=0; i<chessArray.length;i++){
    for(int j=0; j<chessArray[i].length;j++){
      if((i+j)%2==0){
      chessArray[j][i]=0;
      }
      else{
      chessArray[j][i]=1;
    }
} 
}
}
void draw(){
  for(int i = 0; i < chessArray.length; i++){
    for(int j = 0; j < chessArray[i].length; j++){
      int sidelength = 100;
      if(chessArray[i][j] == 0){
        fill(0);
      } else if(chessArray[i][j] == 1){
        fill(255);
      }
      rect(i*sidelength, j*sidelength, sidelength, sidelength);
    }
  }
}
