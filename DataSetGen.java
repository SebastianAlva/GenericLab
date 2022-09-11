/**
 * 
 * @author sebas
 *
 * @param <T>
 */

// The <T extends Measurable> means that T always will extend Measurable
public class DataSetGen<T extends Measurable> {

	//Instance Variable 
	private T maximum;
	private double sum;
	private int count; 

	
	//Parameterized constructor
	public DataSetGen () {

		sum = 0 ; 
		count = 0 ; 
		maximum = null;
	}
	
	/**
	 * Adds a data value to the data set.
	 * 
	 * @param x a data value
	 */
	public void add(T x) {
		sum = sum + x.getMeasure();
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;
	}

	  /**
    Gets the average of the added data.
    @return the average or 0 if no data has been added
 */
 public double getAverage()
 {
    if (count == 0) return 0;
    else return sum / count;
 }

 /**
    Gets the largest of the added data.
    @return the maximum or 0 if no data has been added
 */
 public T getMaximum()
 {
    return maximum;
 }
	


}


