package tools;

import static tools.nivelbajo.DateTools.*;

import domain.Config;
import domain.Reservation;

public class Validator {
	
	public boolean validateMonth(Reservation reserv, Config config) {
		return between(config.getMonth(), getMonth(reserv.getIniDat()), getMonth(reserv.getFinalDat()));
	}

	public boolean validateYear(Reservation reserv, Config config) {
		return between(config.getYear(), getYear(reserv.getIniDat()), getYear(reserv.getFinalDat()));
	}

	public boolean between(int i, int minValueInclusive, int maxValueInclusive) {
		if (i >= minValueInclusive && i <= maxValueInclusive)
			return true;
		else
			return false;
	}
}
