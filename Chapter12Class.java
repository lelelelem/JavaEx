
class Chapter12Class extends Thread {

	private int Del=0;
	
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
			
		MainStopLight();
	
	}
	
	private void MainStopLight(){
			
		
		StopLight SL[] = StopLight.values();
		int i=0;
		
		while(true){			
			
				i = i%3;
					System.out.println("|"+SL[i]+"|");
				try {
					Del = SL[i].getDelay();
					Thread.sleep(SL[i].getDelay());
					
				} catch (InterruptedException e) {
				
				}
					System.out.println("====");
			i++;
		}
		
	}
	
	
		
}
