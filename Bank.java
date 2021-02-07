package bankingsystemtwo;

public class bank {
    
	public void Start_banking(){
		bkash farinbkash = new bkash("farin", "01708914356",12000 ,"1234");
		farinbkash.information();
                bkash mashiatbkash = new bkash("mashiat", "01783578366",14000);
		mashiatbkash.information();
                
                
		nagad farinnagad = new nagad("farin", "01708914356",12000 ,"1234");
		farinnagad.information();

                
                
		rocket farinrocket = new rocket("farin", "017708914356",12000 ,"1234");
		farinrocket.information();

		
            System.out.println("bkash\n");
            farinbkash.addmoney(500);
	    farinbkash.cashout(300,"45");
	    farinbkash.cashout(4000,"1234");
	    
	    
	    
	    mashiatbkash.cashout(700);
	    mashiatbkash.pinset("4567");
	    mashiatbkash.cashout(500,"4567");
            
            System.out.println("nagad\n");
            farinnagad.addmoney(500);
	    farinnagad.cashout(300,"4095");
	    farinnagad.cashout(4000,"1234");
            farinnagad.cashout(700000 , "1234");
	    
	    
            System.out.println("rocket\n");
            farinrocket.addmoney(500);
	    farinrocket.cashout(300,"4578");
	    farinrocket.cashout(4000,"1234");
	    
	   
	    

	
	}    
}
    
