package page.functions;

import page.interactions.Navigate;

public class FunctionInventory {
	
	public static boolean isInPageInventory() {
		String current_url = Navigate.getUrl();
		//System.out.println("#########>>>Current URL:" + current_url);
		if (current_url.contains("inventory.html")) {
			return true;
		}
		
		return false;
	}
}
