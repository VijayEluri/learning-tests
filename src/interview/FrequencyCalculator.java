package interview;

import java.util.*;

public class FrequencyCalculator {

	public int getFrequency(int[] values) {
		if (values.length == 0)
			throw new RuntimeException(
					"The array is empty. There is no value you can get!");

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int value : values) {
			Integer frequency = map.get(value);
			if (frequency == null)
				map.put(value, 1);
			else
				map.put(value, ++frequency);
		}

		int numberWithMaxFrequency = values[0];
		for (int value : values) {
			int frequency = map.get(value);
			if (frequency > map.get(numberWithMaxFrequency))
				numberWithMaxFrequency = value;
		}

		return numberWithMaxFrequency;
	}
}
