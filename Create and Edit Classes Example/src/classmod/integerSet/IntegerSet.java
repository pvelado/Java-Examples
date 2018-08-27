package classmod.integerSet;

public class IntegerSet {
	
	private boolean [] elementSet;
	
	
	public IntegerSet() {
		elementSet = new boolean [101];
		
	}
	
	public IntegerSet union (IntegerSet iSet) {
		IntegerSet newSet = new IntegerSet();
		
		for (int i = 0; i < elementSet.length;i++) {
			if (iSet.elementSet[i] == true || this.elementSet[i] == true) {
				 newSet.elementSet[i] = true;
			}
		}
		return newSet;
	}
	public IntegerSet intersection(IntegerSet iSet) {
		IntegerSet newSet = new IntegerSet();
		
		for(int i = 0; i < elementSet.length;i++) {
			if (this.elementSet[i] == true && iSet.elementSet[i] == true) {
				newSet.elementSet[i] = true;
			}
		}
		return newSet;
	}
	public IntegerSet insertElement(int data) {
		elementSet[data] = true;
		return this;
	}
	public IntegerSet deleteElement(int data) {
		elementSet[data] = false;
		return this;
	}
	public boolean isEqualTo (IntegerSet iSet) {
		if (this.equals(iSet))
			return true;
		else 
			return false;
	}
	
	public String toString() {
		String str = "";
		
		for (int i = 0; i < elementSet.length; i++) {
			if (elementSet[i] == true) {
				str = str.concat(String.valueOf(i).concat(" "));
			}
		}
		
		if (str.length() == 0) {
			str = str.concat("---");
		}
		
		return str;
	}
}
