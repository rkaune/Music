/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package music;

/**
 * Piccolo class.
 */
public class Piccolo extends Woodwind {
		
	/**
	 * constructor
	 * pre: none
	 * post: An piccolo has been created.
	 */
	public Piccolo(String piccoloist) {
		super(piccoloist);
	}


	/** 
	 * Returns the sound of the instrument.
	 * pre: none
	 * post: The sound made by the instrument is returned.
	 */
	public String makeSound() {
	 	return("peep");
	}

	
	/** 
	 * Returns a String that represents the instrument.
	 * pre: none
	 * post: A string representing the instrument has 
	 * been returned.
	 */
	public String toString() {
	 	return(super.getMusician() + " plays " + makeSound() + ".");
	}
}
