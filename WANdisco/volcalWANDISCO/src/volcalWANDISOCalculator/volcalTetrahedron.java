package volcalWANDISOCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class volcalTetrahedron implements volumeCalculation {
	// Equation function for Tetrahedron volume
	@Override
	public double calculation(int a) {

		return (Math.pow(a, 3) / (6 * Math.sqrt(2)));
	}

	@Override
	public double decFormat(double ans) {
		BigDecimal db = new BigDecimal(ans).setScale(2, RoundingMode.HALF_EVEN);
		ans = db.doubleValue();
		return ans;
	}

}