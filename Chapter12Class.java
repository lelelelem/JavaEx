
class Chapter12Class extends Thread {

	
	Chapter12Class(){
		start();
	}
	
	enum StopLight{
		
		Red(5000), Yellow(2000), Green(5000);
		
		private int Delay;
		
		StopLight(int Delay){this.Delay = Delay;}
		
		
		int getDelay(){
			
			return Delay;
		}
	}
	
	public void run(){
			
		StopLight SL[] = StopLight.values();
		int i=0;
		
		while(true){			
			
				i = i%3;
					System.out.println("|"+SL[i]+"|");
				try {
					Thread.sleep(SL[i].getDelay());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
					System.out.println("====");
			i++;
		}
	}
		
}
