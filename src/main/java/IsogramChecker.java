class IsogramChecker {

    boolean isIsogram(String phrase) {
    	boolean res = true;
    	int numRepe = 0;
		char[] let = new char[phrase.length()];
		let = phrase.toLowerCase().toCharArray();
		
		for(char cEx: let) {
			numRepe = 0;
			for(char cIn: let) {
				if(cEx == cIn) {
					if(Character.isLetter(cIn)){
						numRepe++;						
					}
				}
			}			
			if(numRepe > 1) {
				res = false;
				break;
			}
		}
		return res;
    }

}
