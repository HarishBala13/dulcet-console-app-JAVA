package comdulcetapplication;

public class Dulcet {
	
	static boolean isApplicationExited = true;

	public static void main(String[] args) {
		// Welcome page of my Application
		 	Welcome.showWelcomePage();
		 	
		// Loading animation for initializing the application
	        LoadingAnimation.showLoading("Initializing Music Player...");
	        
	        
	    // Create objects for the controller of Song and User
	        
	        UserManager userManager = new UserManager();
	        SongManager songManager = new SongManager();

	        boolean loggedIn = userManager.start();
	        
	    // 

	        if (loggedIn) {
	            System.out.println("Login successful! Enjoy the Music Player.");
	            songManager.start();
	        } else {
	            System.out.println("Exiting application.");
	            Welcome.showExitMessage();
	            try {
	            	Thread.sleep(500);	
	            	isApplicationExited = false;
				} catch (InterruptedException app_interupted) {
					Thread.currentThread().interrupt();
					isApplicationExited = true;
					System.err.println("Application closing interrupted!"+app_interupted.getMessage());					
				}
	            if(isApplicationExited) {	            	
	            	Dulcet.main(null);
	            }
	        }

	}
}
