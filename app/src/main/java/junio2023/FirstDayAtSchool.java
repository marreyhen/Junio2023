/**
 * Clase a probar en el c�digo ejemplo para el control de junio de 2022
 */
package junio2023;

/**
 * @author Isabel Rom�n
 *
 */

import java.util.HashMap;
import java.util.Set;

public class FirstDayAtSchool {
	private HashMap<String, Integer> schoolbag = null;

	public FirstDayAtSchool() {
		this.schoolbag = new HashMap<String, Integer>();
		prepareMyBag();

	}

	public void prepareMyBag() {
		schoolbag.put("Pens", 1);
		schoolbag.put("Notebooks", 1);
	}

	public void addThings(String thingName, int number) {
		int things = number;
		if (schoolbag.containsKey(thingName)) {
			things = things + schoolbag.get(thingName).intValue();
		}
		schoolbag.put(thingName, Integer.valueOf(things));
	}

	public int getNumberOf(String thingName) {
		int number = 0;
		if (schoolbag.containsKey(thingName)) {
			number = number + schoolbag.get(thingName).intValue();
		}
		return number;

	}

	public Set<String> getThings() {

		return schoolbag.keySet();
	}
    /**
     * Deja la mochila vac�a
     */
	public void cleanMyBag() {
		schoolbag.clear();
        prepareMyBag();
	}

	public String toString() {
		String mybag = "These are the things in my bag: \n" + schoolbag.toString();
		return mybag;
	}
}
