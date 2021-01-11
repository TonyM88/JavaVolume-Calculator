package volcalWANDISOCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class volcalCube implements volumeCalculation {
	// equation function for Cube volume
	@Override
	public double calculation(int a) {

		return (a * a * a);
	}

	@Override
	public double decFormat(double ans) {
		BigDecimal db = new BigDecimal(ans).setScale(2, RoundingMode.HALF_EVEN);
		ans = db.doubleValue();
		return ans;
	}

}
