package board;

import java.util.Scanner;


public class Test {
	public Board p[]=new Board[24];
	
	Board[] Tiger = new Board[3];
	Board[] Goat  = new Board[15];
	

	public void Board_config(){
		// TODO Auto-generated method stub
     
     
  
	
   
     
    p[0] = new Board(380,20,"p[0]");
    
    p[1] = new Board(50,225,"p[1]");
    p[2] = new Board(225,225,"p[2]");
    p[3] = new Board(325,225,"p[3]");
    p[4] = new Board(440,225,"p[4]");
    p[5] = new Board(500,225,"p[5]");
    
    p[6] = new Board(700,220,"p[6]");
    p[7] = new Board(50,310,"p[7]");
    p[8] = new Board(200,310,"p[8]");
    p[9] = new Board(320,310,"p[9]");
    p[10] = new Board(450,310,"p[10]");
    p[11] = new Board(550,310,"p[11]");
    p[12] = new Board(700,310,"p[12]");
    p[13] = new Board(50,395,"p[13]");
    p[14] = new Board(150,395,"p[14]");
    p[15] = new Board(300,395,"p[15]");
    p[16] = new Board(450,395,"p[16]");
    p[17] = new Board(600,395,"p[17]");
    p[18] = new Board(700,395,"p[18]");
    p[19] = new Board(1,1,"p[21]");
    p[20] = new Board(3,1,"p[20]");
    p[21] = new Board(8,1,"p[21]");
    p[22] = new Board(11,1,"p[22]");    
     
    p[0].direction(p[2],p[3],p[4],p[5]);
    p[1].direction(null, p[2], null, p[7]);  
    p[2].direction(p[1], p[3], p[0], p[8]);
    p[3].direction(p[2], p[4], p[0], p[9]);
    p[4].direction(p[3], p[5], p[0], p[10]);
    p[5].direction(p[4], p[6], p[0], p[11]);
    p[6].direction(p[5], null, null, p[12]);
    p[7].direction(null, p[8], p[1], p[2]);
    p[8].direction(p[4],p[9],p[2],p[14]);
    p[9].direction(p[8], p[10], p[3], p[15]);
    p[10].direction(p[9], p[11], p[4], p[16]);
    p[11].direction(p[10],p[12],p[5],p[17]);
    p[12].direction(p[11], null, p[6], p[18]);
    p[13].direction(null, p[14], p[7], null);
    p[14].direction(p[13], p[15], p[8], p[21]);
    p[15].direction(p[14], p[16], p[9], p[20]);
    p[16].direction(p[15], p[17], p[10], p[21]);
    p[17].direction(p[16], p[18], p[11], p[22]);
    p[18].direction(p[17],null,p[12],null);
    p[21].direction(null,p[20],p[14],null);
    p[20].direction(p[21], p[21], p[15], null);
    p[21].direction(p[20], p[22], p[16], null);
    p[22].direction(p[21],null,p[17],null);
    
				//Default tiger position
  p[0].add_tiger();
  p[3].add_tiger();
  p[4].add_tiger();
  
  p[2].add_goat();
  p[9].add_goat();


     for(int i=0;i<=22;i++){
		gx[i]=p[i].X;
		gy[i]=p[i].Y;
		
	}
	}
    
	} 
	
	void get_input(){
	
		
		
		
		
		int input_from_x,input_from_y,input_to_x,input_to_y , i , j = 0;
		
		
    System.out.println("Enter the FROM points :");
    @SuppressWarnings("resource")
	Scanner IN = new Scanner(System.in);
	for(i=0;i<=22;i++){
		p[i].X=gx[i];
		p[i].Y=gy[i];
		gx1[i]=gx[i];
		gy1[i]=gy[i];
	}
    
    
    System.out.println("FROM x = ");
    input_from_x=IN.nextInt();
    System.out.println("FROM y = ");
    input_from_y=IN.nextInt();
    
    for(i=0;i<=22;i++){
    	
    	if(p[i].X == input_from_x && p[i].Y == input_from_y){
    		break;
    	}
    	else if(((gx1[i]=gx1[i]+1)==input_from_x)&&((gy1[i]=gy1[i]+1)==input_from_y)){
    		input_from_x--;
    		input_from_y--;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]+1)==input_from_x)&&((gy1[i]=gy1[i]+2)==input_from_y)){
    		input_from_x=input_from_x-2;
    		input_from_y=input_from_x-2;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]+1)==input_from_x)&&((gy1[i]=gy1[i]+3)==input_from_y)){
    		input_from_x=input_from_x-3;
    		input_from_y=input_from_x-3;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]+1)==input_from_x)&&((gy1[i]=gy1[i]+4)==input_from_y)){
    		input_from_x=input_from_x-4;
    		input_from_y=input_from_x-4;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]+1)==input_from_x)&&((gy1[i]=gy1[i]+5)==input_from_y)){
    		input_from_x=input_from_x-5;
    		input_from_y=input_from_x-5;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]-6)==input_from_x)&&((gy1[i]=gy1[i]-1)==input_from_y)){
    		input_from_x++;
    		input_from_y++;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]-1)==input_from_x)&&((gy1[i]=gy1[i]-2)==input_from_y)){
    		input_from_x=input_from_x+2;
    		input_from_y=input_from_x+2;
    		break;
    	}
    	else if(((gx1[i]=gx1[i]-1)==input_from_x)&&((gy1[i]=gy1[i]-3)==input_from_y)){
    		input_from_x=input_from_x+3;
    		input_from_y=input_from_x+3;
    		break;
    	}
    	else  if(((gx1[i]=gx1[i]-1)==input_from_x)&&((gy1[i]=gy1[i]-4)==input_from_y)){
    		input_from_x=input_from_x+4;
    		input_from_y=input_from_x+4;
    		break;
    	}
    	else  if(((gx1[i]=gx1[i]-1)==input_from_x)&&((gy1[i]=gy1[i]-5)==input_from_y)){
    		input_from_x=input_from_x+5;
    		input_from_y=input_from_x+5;
    		break;
    	}
    }
    System.out.println("i ="+i);
    
    
    
    System.out.println("Enter the TO points");
    System.out.println("TO x = ");
    input_to_x=IN.nextInt();
    System.out.println("TO y = ");
    input_to_y=IN.nextInt();
    
    
    for(j=0;j<=22;j++){
    	if((input_from_x==input_to_x)&&(input_from_y==input_to_y)){
    		System.out.println("your destination position is wrong choose another one" );
    		j=i;
    		break;
    	}
    	else if(p[j].X == input_to_x && p[j].Y == input_to_y){
    		break;
    	}
    	else if(((p[j].X=p[j].X+1)==input_to_x)&&((p[j].Y=p[j].Y+1)==input_to_y)){
    		input_to_x--;
			input_to_y--;
			break;
    	}
    	else if(((p[j].X=p[j].X+1)==input_to_x)&&(p[j].Y=p[j].Y+2)==input_to_y){
    		input_to_x=input_to_x-2;
			input_to_y=input_to_y-2;
			break;
    	}
    	else if(((p[j].X=p[j].X+1)==input_to_x)&&(p[j].Y=p[j].Y+3)==input_to_y){
    		input_to_x=input_to_x-3;
			input_to_y=input_to_y-3;
			break;
    	}
    	else if(((p[j].X=p[j].X+1)==input_to_x)&&(p[j].Y=p[j].Y+4)==input_to_y){
    		input_to_x=input_to_x-4;
			input_to_y=input_to_y-4;
			break;
    	}
    	else if(((p[j].X=p[j].X+1)==input_to_x)&&(p[j].Y=p[j].Y+5)==input_to_y){
    		input_to_x=input_to_x-5;
			input_to_y=input_to_y-5;
			break;
    	}
    	else if(((p[j].X=p[j].X-6)==input_to_x)&&(p[j].Y=p[j].Y-1)==input_to_y){
    		input_to_x++;
			input_to_y++;
			break;
    	}
    	else if(((p[j].X=p[j].X-1)==input_to_x)&&(p[j].Y=p[j].Y-2)==input_to_y){
    		input_to_x=input_to_x+2;
			input_to_y=input_to_x+2;
			break;
    	}
    	else if(((p[j].X=p[j].X-1)==input_to_x)&&(p[j].Y=p[j].Y-3)==input_to_y){
    		input_to_x=input_to_x+3;
			input_to_y=input_to_x+3;
			break;
			
    	}
    	else if(((p[j].X=p[j].X-1)==input_to_x)&&(p[j].Y=p[j].Y-4)==input_to_y){
    		input_to_x=input_to_x+4;
			input_to_y=input_to_x+4;
			break;
			
    	}
    	else if(((p[j].X=p[j].X-1)==input_to_x)&&(p[j].Y=p[j].Y-5)==input_to_y){
    		input_to_x=input_to_x+5;
			input_to_y=input_to_x+5;
			break;
    	}
    }
    
    System.out.println("j ="+j);
    
     
    
    
    
    
    try{
    p[i].move_tiger(p[j]);  //moves tiger from p[3] to left of p[3] i.e. p[2] 
    }
    catch(NullPointerException e){ // activated when move out of range
    	System.out.println("Move Out of Range : Invalid move");
    }
    display();
    
    
    
    
 
	
 }
	void display(){
		 Game T_Game = new Game();//Testing
		 int[][] a = new int[3][3];
		 int[][] goat_coordinate = new int[15][15];
		 int j,i;
		   System.out.println("Tiger at");//Display
		   for(j=0,i=0;i<22;i++){	
			   if(p[i].tiger==true)
		   	{
		      System.out.println("p["+i+"]");
		     
		     
		      Tiger[j]=p[i];
		      j++;		 
		   	}
			   
			  
		   }
		   
		 a[0][0] 	= 	Tiger[0].X;
		 a[0][1]	=	Tiger[0].Y;
		 
		 a[1][0] 	= 	Tiger[1].X;
		 a[1][1]	=	Tiger[1].Y;
		  
		 a[2][0] 	=	Tiger[2].X;
		 a[2][1]	=	Tiger[2].Y;
		  
		  
		   T_Game.move_coin(a);
		  
		   	System.out.println("Goat at");
		   	j=0;
		   for(i=0;i<22;i++)
		   {
		  	 if(p[i].goat==true)
		  	 {	
		  		 System.out.println("p["+i+"]");
		  		 Goat[j]=p[i];
		  		 j++;
		  		
		  	 }
		   }
	for(i=0;i<j;i++){
		for(int l=0;l<2;l++){
			if(l==0){
				goat_coordinate[i][0] = Goat[i].X;
			}
			if(l==1){
				goat_coordinate[i][1] = Goat[i].Y;
			}
		}
	}
		   
		   
		   
		   
	 T_Game.move_goat(goat_coordinate,i);
	
    
	}

}


